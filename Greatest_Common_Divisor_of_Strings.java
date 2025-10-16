class GCD_Of_Strings
{
    public static void main(String[] args)
    {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }
    
    public static String gcdOfStrings(String str1, String str2) {
        boolean match = ((str1+str2).equals(str2+str1));

        if (match)
        {
            return str1.substring(0, (gcd(str1.length(), str2.length())));
        }
        else
            return "";
    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b); //If b is 0, then it will never divide a, and a is the gcd. Otherwise recursion through to find gcd.
    }
}