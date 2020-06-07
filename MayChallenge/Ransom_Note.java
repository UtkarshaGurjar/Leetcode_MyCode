class Ransom_Note
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] c = new int[26];
	    char[] r = ransomNote.toCharArray(), m = magazine.toCharArray();
	    for (int i=0; i<m.length; i++) 
        {
		    c[m[i] - 'a']++;
	    }
	    for (int i=0; i<r.length; i++) 
        {
		    if (c[r[i] - 'a']-- < 1) 
            {
			    return false;
		    }
	    }
	    return true;
    }
}