class Solution 
{
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) 
    {
        /*if(nums.length==0)
            return false;
        for(int i=0; i<nums.length-1;i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if((Math.abs(1L*nums[i]-nums[j])<=t) && (Math.abs(i-j)<=k))
                    return true;
            }
        }
        return false;
        */
        
        TreeSet<Long> ts = new TreeSet();
        for(int i=0; i<nums.length; i++)
        {
            Long floor = ts.floor((long) nums[i]);
            if(floor!=null && nums[i]-floor<=t)
                return true;
            
            Long ceiling = ts.ceiling((long) nums[i]);
            if(ceiling !=null && ceiling-nums[i]<=t)
                return true;
            
            ts.add((long) nums[i]);
            if(ts.size()>k)
                ts.remove((long) nums[i-k]);
        }
        return false;
        
    }
}