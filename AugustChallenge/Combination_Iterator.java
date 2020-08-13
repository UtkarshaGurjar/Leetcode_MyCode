class Combination_Iterator 
{
    Queue<String> queue;
    public CombinationIterator(String characters, int combinationLength) 
    {
        queue = new LinkedList();
        generate(characters, 0,"", combinationLength, queue);
    }
    private void generate(String s, int start, String sofar, int c, Queue<String> queue)
    {
        if(c==0)
        {
            queue.add(sofar);
            return;
        }
        
        for(int i=start; i<s.length(); i++)
        {
            generate(s, i+1, sofar+s.charAt(i), c-1, queue);
        }
    }
    public String next() 
    {
        return queue.poll();
    }
    
    public boolean hasNext() 
    {
        return !queue.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */