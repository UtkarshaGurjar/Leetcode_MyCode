class XorOperation 
{
    public int xorOperation(int n, int start) 
    {
        int ans[] = new int[n];
        ans[0]=start;
        int sum=ans[0];
        for(int i=1; i<n;i++)
        {
            ans[i]=ans[i-1]+2;
        }
        for(int i=1; i<n;i++)
        {
            sum= sum ^ ans[i];
        }
        return sum;
    }
}