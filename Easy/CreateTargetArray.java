class CreateTargetArray 
{
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int target[] = new int[nums.length];
        for(int i=0; i<index.length;i++)
        {
            int a=index[i];
            if(target[a]!=-1)
            {
                for(int j=target.length-1; j>a;j--)
                {
                    target[j]=target[j-1];
                }
                target[a]=nums[i];
            }
            else
            {
                target[a]=nums[i];
            }
        }
        return target;
    }
}