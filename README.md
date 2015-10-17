#Tidal GE: Grammatical Evolution of Tidal Mini-Language

This is a web-based API for evolving populations of tidal music patterns. It is primarily intended for use with the extramuros framework. It uses CORS to allow any web service to grab patterns. 





#Development notes

##Current todo:



##Current setup procedure

Set up my branch of extramuros. Open the page 127.0.0.1:8000/jqtest.html - it has a standard exramuros layout, but with extra buttons. 


###Tomcat notes

We're running Tomcat 7

To compile java to classes, from the ```WEB-INF``` directory,  do:

	javac -cp ../../../../lib/servlet-api.jar ajaxdemo/ActionServlet.java 
	
	
	
	
