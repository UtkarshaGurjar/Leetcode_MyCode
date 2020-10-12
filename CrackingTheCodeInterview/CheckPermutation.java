import java.util.*; 
public class MyClass 
{
    public static boolean permute(String s, String t)
    {
        if(s.length()!=t.length())
            return false;
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0; i<c.length;i++)
        {
            if(c[i] == d[i])
                return true;
        }
        return false;
    }
    
    public static void main(String args[]) 
    {
      String s1 = "test";
      String s2="spt";
      if(permute(s1,s2))
        System.out.println("Same");
      else
        System.out.println("no");
    }
}