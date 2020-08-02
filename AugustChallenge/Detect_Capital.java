class MyHashSet 
{

    /** Initialize your data structure here. */
    private transient HashMap map;
    private static final Object PRESENT = new Object();
    
    public MyHashSet() 
    {
        map = new HashMap<>();
    }
    
    public void add(int key) 
    {
        map.put(key, PRESENT);
    }
    
    public void remove(int key) 
    {
        map.remove(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) 
    {
        if(map.containsKey(key))
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */