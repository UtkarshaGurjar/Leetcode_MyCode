class ShuffleArray 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int ans[]=new int[nums.length];
        int i=0, j=n, k=0;
        while(k<nums.length)
        {
            ans[k]=nums[i];
            ans[k+1]=nums[j];
            i++;
            k=k+2;
            j++;
        }
        return ans;
    }
}