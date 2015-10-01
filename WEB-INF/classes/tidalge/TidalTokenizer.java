import java.util.regex.Pattern;

public class TidalTokenizer
{

  /** Class to hold information about individual tokens */
  private class TokenInfo {
    public final Pattern regex;
    public final int token;

    public TokenInfo(Pattern regex, int token) {
      super();
      this.regex = regex;
      this.token = token;
    }
  }
  
  public class Token
  {
    public final int token;
    public final String sequence;
    
    public Token(int token, String sequence)
    {
      super();
      this.token = token;
      this.sequence = sequence;
    }
    
  }

  private LinkedList<TokenInfo> tokenInfos;
  private LinkedList<Token> tokens;

  public TidalTokenizer() {
    tokenInfos = new LinkedList<TokenInfo>();
  }
  
  public void add(String regex, int token) {
    tokenInfos.add(new TokenInfo(
      Pattern.compile("^("+regex+")"), token));
  }
  
}
