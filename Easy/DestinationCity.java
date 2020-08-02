class DestinationCity 
{
    public String destCity(List<List<String>> paths) 
    {
        if(paths==null)
            return "";
        List<String> l = new ArrayList<>();
        
        for(int i=0; i<paths.size();i++)
        {
            l.add(paths.get(i).get(0));
        }
        
        for(int i=0; i<paths.size();i++)
        {
            if(!l.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }
        return "";
    }
}