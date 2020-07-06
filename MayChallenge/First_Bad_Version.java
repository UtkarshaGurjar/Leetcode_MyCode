/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class First_Bad_Version extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
        int first =1, last=n, startVersion=n, mid=0;
        while(first<=last)
        {
            mid = first + (last-first)/2;
            if(isBadVersion(mid))
            {   
                last=mid-1;
                startVersion=mid;
            }
            else
                first = mid+1;
        }
        return startVersion;
    }
}