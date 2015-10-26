#Tidal GE: Grammatical Evolution of Tidal Mini-Language

This is a web-based API for evolving populations of tidal music patterns. It is primarily intended for use with the extramuros framework. It uses CORS to allow any web service to grab patterns. 

#User Guide-ish

##Button actions:

### **EVAL** 

sends the pattern to tidal for rendering audio

### PUSH 

sends the pattern to the GA population. If the bucket isn't full, it is simply appended with a fitness of one. 

includes a parsing step to make sure we aren't pushing rubbish into the population. 


### PULL

requests a mutated individual from the population

### UP/DOWN

`Regulates' a pattern in the population - up increases it's regulation, down decreases it. 







#Development notes

##Current todo:


##in-browser population: 

The idea is that a population is run in a browser



##Current setup procedure

1. Set up my branch of git extramuros by running the ```startup.sh``` script. 
   Open the page 127.0.0.1:8000/jqtest.html - it has a standard exramuros layout, but with extra buttons. 


###Tomcat notes

We're running Tomcat 7

To compile java to classes, from the ```WEB-INF``` directory,  do:

	javac -cp ../../../../lib/servlet-api.jar ajaxdemo/ActionServlet.java 
	
	
	
	
