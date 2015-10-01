// To save as "<TOMCAT_HOME>\webapps\hello\WEB-INF\classes\HelloServlet.java"
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloServlet extends HttpServlet {


  private String message;

  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World";
  }

    private void fixHeaders(HttpServletResponse response) {

        //System.out.println("Headers are: \n"+response.getHeaders("Access-Control-Allow-Origin"));


        //response.setHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, PUT, POST, OPTIONS, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "86400");
    }


   //@Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 
      // Set the response MIME type of the response message
      response.setContentType("text/html");

        //Set the headers so that CORS works ok...(see the fixHeaders() function)
      //response.addHeader("Access-Control-Allow-Origin", "*");
      fixHeaders(response);

      // Allocate an output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();

    System.out.println("wibble");

    System.out.println(request.getParameterNames());
 
      // Write the response message, in an HTML page
      try {
        out.print("d1 $ sound \"bd sn cp cp \"");
        /*
         out.println("<html>");
         out.println("<head><title>Hello, World</title></head>");
         out.println("<body>");
         out.println("<h1>Hello, world!</h1>");  // says Hello
         // Echo client's request information
         out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
         out.println("<p>Protocol: " + request.getProtocol() + "</p>");
         out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
         out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
         // Generate a random number upon each request
         out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
         out.println("</body></html>");
        */
      } finally {
         out.close();  // Always close the output writer
      }
   }
}
