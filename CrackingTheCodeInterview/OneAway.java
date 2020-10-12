import java.util.*;
import java.lang.*;
public class MyClass 
{
    public static boolean checkEdits(String s, String t) 
    {
        if(Math.abs(s.length()-t.length())>1)
            return false;
        int count=0;
        if(Math.abs(t.length()-s.length())==1)
            count++;
        int val = s.length()>t.length()? t.length() : s.length();
        for(int i=0; i<val;i++)
        {
            if(count>1)
                return false;
            else if(s.charAt(i)!=t.charAt(i))
                count++;
        }
        return true;
    }

    public static void main(String args[]) 
    {
      String s1 = "tastefe";
      String s2="tastee";
      if(checkEdits(s1, s2))
        System.out.println("True");
      else
        System.out.println("False");
    }
}