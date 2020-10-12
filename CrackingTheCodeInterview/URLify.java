import java.util.*; 
public class MyClass 
{
    public static String replaceSpace(String string) 
    {
        StringBuilder sb = new StringBuilder();
        for(char c : string.toCharArray()) 
        {
            if (c == ' ') 
                sb.append("%20");
            else 
                sb.append(c);
        }
    return sb.toString();
    }

    public static void main(String args[]) 
    {
      String s1 = "My Testing For  2 Spaces";
      String s = replaceSpace(s1);
      System.out.println(s);
    }
}