class Counting_bits 
{
    public int[] countBits(int num) 
    {
        int [] b = new int[num+1];
        b[0]=0;
        for(int i=1 ; i<num+1; i++)
        {
            b[i] = count(i);
        }
        return b;
    }
    public int count(int n)
    {
        int[] a = new int[20];
        int index=0, count=0;
        while(n>0)
        {
            a[index++] = n%2;
            n=n/2;
        }
        for(int i=0; i<index;i++)
        {
            if(a[i] == 1)
                count++;
        }
        return count;
    }
}