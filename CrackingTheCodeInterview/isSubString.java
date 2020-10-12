import java.util.*;
public class Main
{
    public static boolean isSubstring(String s1, String s2)
    {
      if(s1.length()!=s2.length())
        {return false;}
      for(int i=0; i<s1.length();i++)
      {
        String check = s1.substring(i, s1.length()) + s1.substring(0,i);
        if(s2.equals(check))
          {return true;}
      }
      return false;
    }
    
	public static void main(String[] args) 
	{
	  Scanner src = new Scanner(System.in);
		boolean ans = isSubstring("waterbottle", "aterbottlew");
    if(!ans)
      {System.out.println("No");}
    else
      {System.out.println("Yes");}
  
	}
}
