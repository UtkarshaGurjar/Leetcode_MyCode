class FrequentAlphabets 
{
    public String freqAlphabets(String s) 
    {
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<s.length())
        {
            int val=0;
            if(i+2<s.length() && s.charAt(i+2) == '#')
            {
                val = Integer.parseInt(s.substring(i, i+2));
                i=i+3;
            }
            else
            {
                val=Integer.parseInt(s.substring(i, i+1));
                i=i+1;
            }
            sb.append((char)('a'+val-1));
        }
        return sb.toString();
    }
}