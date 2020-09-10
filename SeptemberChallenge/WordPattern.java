class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String string[] = str.split(" ");
        Map<Character, String> hmap = new HashMap();
        HashSet<String> hset = new HashSet();
        if(pattern.length()!=string.length)
            return false;
        for(int i=0; i<pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String word = string[i];
            
            if(hmap.containsKey(ch)) //key is present so check if the value is same or not
            {
                String oldCorres = hmap.get(ch);
                if(oldCorres.equals(word)==false)
                    return false;
            }
            else //either add the value of may be the value is different
            {
                if(hset.contains(word))
                {return false;}
                hmap.put(ch,word);
                hset.add(word);
                
            }
        }
        return true;
    }
}