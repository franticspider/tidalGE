import parser.*;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.*;


import org.json.*;
import java.util.Enumeration;
 
@WebServlet("/parsetidal")
public class ParserServlet extends HttpServlet {
 
 
  private static final long serialVersionUID = 1L;

  private  Tokenizer tokenizer = new Tokenizer();
    
  public ParserServlet() {
  
  
    System.out.println("Inside constructor in ParserServlet");

    int tnum = 1;


    //TODO: These rules should be in a tidal-specific tokenizer
    //tokenizer.add("sin|cos|exp|ln|sqrt", 1);
    //tokenizer.add("\\(", 2);
    //tokenizer.add("\\)", 3);
    //tokenizer.add("\\+|-", 4);
    //tokenizer.add("\\*|/", 5);
    //tokenizer.add("[0-9]+",6);
    //tokenizer.add("[a-zA-Z][a-zA-Z0-9_]*", 7);
    tokenizer.add("d[0-9]",tnum++);
    tokenizer.add("\\$",tnum++);
    tokenizer.add("\\\"",tnum++);
    tokenizer.add("sound",tnum++);
    tokenizer.add("bd|sn|cp|bev",tnum++);
     
  }
  
  

    private void fixCORSHeaders(HttpServletResponse response) {

        //System.out.println("Headers are: \n"+response.getHeaders("Access-Control-Allow-Origin"));


        //response.setHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, PUT, POST, OPTIONS, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "86400");
    }
  
  
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    
    
		/** Do the necessary to allow CORS messages to be handled: */
		// Set the response MIME type of the response message
		response.setContentType("text/html");

		//Set the headers so that CORS works ok...(see the fixCORSHeaders() function)
		//response.addHeader("Access-Control-Allow-Origin", "*");
		fixCORSHeaders(response);
    
    
    
    
        System.out.println("Inside doGet in ParserServlet, request is:\n"+request.toString());
	    System.out.println(request.getParameterNames());
    
    
    /*
		StringBuilder sb = new StringBuilder();
		BufferedReader reader = request.getReader();
		try {
		    String line;
		    while ((line = reader.readLine()) != null) {
		        sb.append(line).append('\n');
		    }
		} finally {
		    reader.close();
		}
		System.out.println(sb.toString());
    */

	/* TODO: We need to use json at some point (or xml - don't mind which)		
		JSONObject jObj = new JSONObject(request.getParameter("mydata")); // this parses the json
		Iterator it = jObj.keys(); //gets all the keys

		while(it.hasNext())
		{
		    String key = it.next(); // get key
		    Object o = jObj.get(key); // get value
		    //session.putValue(key, o); // store in session
		
		    
		    System.out.println("key is "+key+", value is: "+o.toString());
		}
	*/	
	
		
    
    
    
    	/*
        String name=null;
        name = "Hello Idiot "+request.getParameter("input");
        if(name!=null){
          if(request.getParameter("input").toString().equals("")){
              name="Hello Idiot User";
          }
        }
        else{
            name = "Parameter doesn't exist";
        }*/
        
        String pattern=null;
        String answer="";

        System.out.println("Headers:");
        Enumeration<String> headerNames = request.getHeaderNames();
        while( headerNames.hasMoreElements()){
        	System.out.println(headerNames.nextElement());
        }
        //Another attempt to get the parameters
        System.out.println("Parameters:");
        int nelements =0;
        String jsonstring="";
        Enumeration<String> paramNames = request.getParameterNames();
        while( paramNames.hasMoreElements()){
        	jsonstring = paramNames.nextElement();
        	System.out.println(jsonstring);
        }
        
        JSONObject json = new JSONObject(jsonstring);
        System.out.println("action=" + json.get("action"));
        System.out.println("pattern=" + json.get("pattern"));
        
        
        //
        
        
        
        
        pattern = (String) json.get("pattern");//request.getParameter("tidalinput");
        
        System.out.println("Pattern is: "+pattern);
        
        /** This is the old tokenizer stuff - we're using antlr now...
        if(pattern !=null){
          try{
            tokenizer.tokenize(pattern);//"d1 $ sojjund \" bd bd \"");

            if(tokenizer.size()<1){
            	answer += "No tokens found";
            }
            else{
	            for (Tokenizer.Token tok : tokenizer.getTokens())
	            {
	              answer+= tok.sequence + " ";
	            }
            }
          }
          catch (ParserException e)
          {
            //System.out.println(e.getMessage());
            answer+=e.getMessage();
          }
        
        }
        */
        /*TODO: We need to verify that the pattern is workable with the grammar
        * for now, let's just reject 1/3 of submissions so we can get the browser logic right.
        */
        answer = pattern;
        boolean validpattern = true;
        if(Math.random() < 0.3){
        	validpattern=false;
        }
        
        
        
  
        response.setContentType("text/plain");  
        response.setCharacterEncoding("UTF-8"); 
        //response.getWriter().write(answer); 
        
        
      	// Allocate an output writer to write the response message into the network socket
      	PrintWriter out = response.getWriter();
      	
      	/** Handle the quots */
      	String answer2 = answer.replace("\"", "\\\"");
      	
      	System.out.println("Response is: "+answer2);
      	
      	/** WE MUST RETURN JSON DATA */
      	out.print("{\"response\": \""+answer2+"\",\"valid\":\""+validpattern+"\"}");////\""+answer+"\"");
        
    }

  
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  
 }



  /********************************************************************************
   * @param args
   */
  public static void nevercallmain(String[] args)
  {
    Tokenizer tokenizer = new Tokenizer();
    try
    {
      tokenizer.tokenize(" sin(x) * (1 - var_12) ");

      for (Tokenizer.Token tok : tokenizer.getTokens())
      {
        System.out.println("" + tok.token + " " + tok.sequence);
      }
    }
    catch (ParserException e)
    {
      System.out.println(e.getMessage());
    }

  }
}
