# Template generated code from trgen 0.14.1
JAR = /tmp/antlr-4.9.3-complete.jar
CLASSPATH = $(JAR):.
.SUFFIXES: .g4 .java .class
.java.class:
	javac -cp $(CLASSPATH) $*.java
ANTLRGRAMMARS ?= $(wildcard *.g4)
GENERATED = ExpressionParser.java ExpressionLexer.java 
SOURCES = $(GENERATED) \
    Program.java \
    ErrorListener.java
default: classes
classes: $(GENERATED) $(SOURCES:.java=.class)
clean:
	rm -f *.class
	rm -f *.interp
	rm -f *.tokens
	rm -f $(GENERATED)
run:
	trwdog java -classpath $(CLASSPATH) Program $(RUNARGS)
ExpressionParser.java : Expression.g4
	java -jar $(JAR) -encoding utf-8  $<
ExpressionLexer.java : Expression.g4
	java -jar $(JAR) -encoding utf-8  $<

test:
	bash test.sh
