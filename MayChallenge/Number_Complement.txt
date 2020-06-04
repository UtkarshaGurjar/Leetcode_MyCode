class Number_Complement
{
        
    public int findComplement(int num) 
    {
        String s = Integer.toBinaryString(num);
        String comp="";
        for (int i = 0; i < s.length(); i++) 
        { 
            comp += (s.charAt(i) == '0') ? '1' : '0'; 
        } 
        return Integer.parseInt(comp,2);
    }
}