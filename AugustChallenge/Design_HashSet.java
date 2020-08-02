class Detect_Capital 
{
    public boolean detectCapitalUse(String word) 
    {
        String uWord=word.toUpperCase();
        String lWord=word.toLowerCase();
        String fWord=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word.equals(uWord) || word.equals(lWord) || word.equals(fWord))
            return true; 
        return false;
    }
}