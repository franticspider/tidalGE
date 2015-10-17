package parser;

public class ParserException extends RuntimeException {
  public ParserException(String msg) {
    super(msg);
  	System.out.println("Parser Exception is "+msg);
  }
}
