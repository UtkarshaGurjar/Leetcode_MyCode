class Valid_Palindrome 
{
    public boolean isPalindrome(String s) 
    {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb=sb.reverse();
        String ss=sb.toString();
        if(s.equalsIgnoreCase(ss))
            return true;
        return false;
    }
}