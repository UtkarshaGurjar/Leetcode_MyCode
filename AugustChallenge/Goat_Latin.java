class Goat_Latin 
{
    public String toGoatLatin(String S) 
    {
        if(S.length()==0)
            return S;
        StringBuilder sb = new StringBuilder();
        String[] str = S.split("\\s+");
        String as="a";
        for(String st: str)
        {
            char c = st.charAt(0);
            if("AEIOUaeiou".indexOf(c)!=-1) // if vowel (-1 if first letter is other than AEIOUaeiou)
            {
                sb.append(st);
            }
            else
            {
                sb.append(st.substring(1,st.length())+c);
            }
        
        sb.append("ma");
        sb.append(as);
        as+="a";
        sb.append(" ");
        }
        return sb.toString().trim();
    }
    
}