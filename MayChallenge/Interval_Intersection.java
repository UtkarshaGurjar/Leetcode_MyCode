class Solution 
{
    public int[][] intervalIntersection(int[][] A, int[][] B) 
    {
        int a=0, b=0;
        List<int[]> answer = new ArrayList<>();
        while(a<A.length && b<B.length)
        {
            if(B[b][1] >= A[a][0] && B[b][0] <= A[a][1])
            {
                int max = Math.max(B[b][0], A[a][0]);
                int min = Math.min(B[b][1], A[a][1]);
                answer.add(new int[]{max,min});
            }
            if(B[b][1] > A[a][1])
            {
                a++;
            }
            else if(B[b][1] < A[a][1])
            {
                b++;
            }
            else
            {
                a++;
                b++;
            }
        }
        return answer.toArray(new int[answer.size()][2]);
    }
}