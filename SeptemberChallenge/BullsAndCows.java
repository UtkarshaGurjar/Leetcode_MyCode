class Solution 
{
    public String getHint(String secret, String guess) 
    {
        char[] secretChar= secret.toCharArray();
        char[] guessChar = guess.toCharArray();
        int[] secretPos = new int [10];
        int[] guessPos = new int[10];
        int abull=0;
        int bcow=0;
        
        for(int i=0; i<secret.length(); i++)
        {
            if(secretChar[i]==guessChar[i])
            {
                abull++;
            }
            else
            {
                secretPos[secretChar[i]-'0']++;
                guessPos[guessChar[i]-'0']++;
            }
        }
        
        for(int i=0; i<secretPos.length; i++)
        {
            bcow += Math.min(secretPos[i], guessPos[i]);
        }
        return abull+"A"+bcow+"B";
    }
}