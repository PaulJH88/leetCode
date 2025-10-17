import java.util.ArrayList;
import java.util.Stack;

public class Reverse_Vowels_of_String {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }    
    
    public static String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        Stack<Character> reverseVowels = new Stack<>();
        StringBuilder retVal = new StringBuilder(s);
        
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (int i=0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(vowels.contains(c))
            {
                reverseVowels.push(c);
                //System.out.println("Removing " + c + " from index " + i);
                indexes.add(i);
            }
        }

        while(!reverseVowels.isEmpty())
        {
            int ind = indexes.remove(0);
            char rv = reverseVowels.pop();
            retVal.setCharAt(ind,rv);
            //System.out.println("Placing " + rv + " at index " + ind);
            //System.out.println("Return so far: " + retVal);
        }
        

        return retVal.toString();
    }
}
