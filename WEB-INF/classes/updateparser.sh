#!/bin/bash


#copy the files from the eclipse folder:
cp ~/git/antlr4tidal/Antlr4Tidal/target/generated-sources/antlr4/Tidal1*.java .

#Finally, compile the classes:
javac -cp ../../../../lib/servlet-api.jar:../lib/antlr-4.5-complete.jar:. *.java
