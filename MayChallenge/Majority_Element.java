class Majority_Element
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        
        for (Integer m: hm.keySet())
        {
            if(hm.get(m) > nums.length/2)
                return m;
        }
        return nums[nums.length/2];
    }
}