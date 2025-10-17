import java.util.Stack;

public class Reverse_Words_in_String {
    public static void main(String[] args) {
        System.out.println(reverseWords("leet    code"));
    } 
    
    public static String reverseWords(String s) {
      StringBuilder sb = new StringBuilder(s.trim());
      Stack<String> stringStack = new Stack<>();
      String word = "";
      
      for (int i = 0; i < sb.length(); i++)
      {
        char curChar = sb.charAt(i);
        boolean isWhitespace = Character.isWhitespace(curChar);

        if (isWhitespace && !word.equals(""))
        {
            stringStack.push(word);
            word = "";
        }
        else if(curChar != ' ')
        {
            word = (word + curChar);
        }
      }
      stringStack.push(word);

      sb = new StringBuilder();
      while(!stringStack.isEmpty())
      {
        sb.append(stringStack.pop());
        sb.append(" ");
      }
      sb.deleteCharAt(sb.length()-1);
    return sb.toString();

    }
}
