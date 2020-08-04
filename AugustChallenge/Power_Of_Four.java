class Power_Of_Four 
{
    public boolean isPowerOfFour(int num) 
    {
        double ans = Math.log(num)/Math.log(4);
        double a = ans-(int)ans;
        return a==0;
    }
}