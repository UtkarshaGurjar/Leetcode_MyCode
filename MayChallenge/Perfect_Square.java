/*
class Perfect_Square 
{
    public boolean isPerfectSquare(int num) 
    {
        for (long i = 1; i * i <= num; i++)
        { 
            if (i*i == num) 
            { 
                return true; 
            } 
        } 
        return false; 
    }
}
1*/

// Using binary search
class Perfect_Square
{
    public boolean isPerfectSquare(int num) 
    {
        int left=1, right=num, mid=0;
        if (num ==0 || num == 1)
            return true;
        while(left <= right)
        {
            mid = left + (right-left)/2;
            if(mid*mid == num)
                return true;
            else if ((double)mid*mid > (double)num)
                right=mid-1;
            else
                left=mid+1;
        }
        return false;
    }
}

