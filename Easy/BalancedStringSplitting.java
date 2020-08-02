class BalancedStringSplitting 
{
    public int balancedStringSplit(String s) 
    {
        char c[] = s.toCharArray();
        int rcount=0, lcount=0, total=0;
        for(int i=0; i<c.length; i++)
        {
            if(c[i]=='L')
                lcount++;
            else
                rcount++;
            
            if(lcount==rcount)
            {
                total++;
                lcount=0;
                rcount=0;
            }
        }
        return total;
    }
}