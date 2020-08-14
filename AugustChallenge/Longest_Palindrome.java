class Longest_Palindrome 
{
    public int longestPalindrome(String s) 
    {
        HashMap<Character, Integer> h = new HashMap<>();
        int count=0;
        int pointer=0;
        for(char c: s.toCharArray())
        {
            h.put(c, h.containsKey(c)? h.get(c)+1 : 1);
        }
        
        for(Character key:h.keySet())
        {
            if(h.size()==1)
                return h.get(key);
            if(h.get(key)%2==0)
                count+=h.get(key);
            if((h.get(key)-1)%2==0)
            {   count+=h.get(key)-1;
                h.put(key,1);
            }
            if(h.get(key)==1 && pointer ==0)
            {count++;
             pointer++;
            }  
        }
        return count;
    }
}