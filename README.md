#Tidal GE: Grammatical Evolution of Tidal Mini-Language

This is a web-based API for evolving populations of tidal music patterns. It is primarily intended for use with the extramuros framework. It uses CORS to allow any web service to grab patterns. 



##Tomcat notes

We're running Tomcat 7

To compile java to classes, from the ```WEB-INF``` directory,  do:

	javac -cp ../../../../lib/servlet-api.jar ajaxdemo/ActionServlet.java 
