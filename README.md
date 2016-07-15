#Tidal GE: Grammatical Evolution of Tidal Mini-Language

This is a web-based API for evolving populations of tidal music patterns. It is primarily intended for use with the extramuros framework. It uses CORS to allow any web service to grab patterns. 

#Admin Guide-ish


##Current setup procedure

1. Set up my branch of git extramuros by running the ```startup.sh``` script in my git/extramuros branch.

2. Startup the tomcat server  - go to localtomcat/bin and enter ``catalina.sh run''

3. Open the page 127.0.0.1:8000/jqtest.html - it has a standard exramuros layout, but with extra buttons. 


###Tomcat notes

We're running Tomcat 7

###Compiling the parser classes


To compile java to classes, from the ```WEB-INF``` directory,  do:

	javac -cp ../../../../lib/servlet-api.jar *.java 
	
(not all java classes compile at the moment, but the ones we need do!)	

There's  a script in WEB-INF/classes called ```updateparser.sh``` that does this for you - note the command is slightly different to the above - so, TODO: check which is the correct method!
	

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

##Notes on installing from scratch / updating

###CORS 

Needs to be enabled in catatlina using the following code 

```
    <filter>
  		<filter-name>CorsFilter</filter-name>
  		<filter-class>org.apache.catalina.filters.CorsFilter</filter-class>
	</filter>
	<filter-mapping>
	  <filter-name>CorsFilter</filter-name>
	  <url-pattern>/*</url-pattern>
	</filter-mapping>
```

I've got this statement in both ```conf/web.xml``` and ```webapps/tidalGE/web.xml``` but I'm not sure which is the correct one..

###Static files

Require the following entries: 

	<servlet-mapping>
		<servlet-name>default</servlet-name>
		<url-pattern>*.html</url-pattern>
	</servlet-mapping>


###WebApps

There are several in tidalGE, used for debugging and testing. Let's list them here: 

* http://localhost:8080/tidalGE/sayhello This just checks that catalina is running ok, and executing code
* http://localhost:8080/tidalGE/index.html Is supposed to load this README!





