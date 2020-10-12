import java.util.*;
import java.lang.*;
public class MyClass 
{
    public static String checkCount(String s) 
    {
        int length = s.length();
        if(length==0)
            return s;
        if(length==1)
            return s+"1";
        if(length>1)
        {
            String ans="";
            char first = s.charAt(0);
            int count=1;
            for(int i=1; i<s.length();i++)
            {
                if(s.charAt(i)==first)
                    count++;
                else
                {
                    ans+=Character.toString(first)+Integer.toString(count);
                    count=1;
                    first = s.charAt(i);
                }
            }
            ans+=Character.toString(first)+Integer.toString(count);
            return ans;
        }
        return s;
    }

    public static void main(String args[]) 
    {
      String s1 = "yyytgh";
      System.out.println(checkCount(s1));
    }
}