class Minimum_Cost_For_Tickets 
{
    public int mincostTickets(int[] days, int[] costs) 
    {
        boolean[] travelling = new boolean[days[days.length - 1]+1];
        int[]finalcost = new int[days[days.length - 1]+1];  
        for(int day : days)
            travelling[day] = true; 
        for(int i = 1;i<finalcost.length;i++)
        {
            if(travelling[i])
            {
                finalcost[i] = Math.min(finalcost[i-1] + costs[0] , Math.min(finalcost[Math.max(0,i-7)]+costs[1],
                              finalcost[Math.max(0,i-30)]+costs[2]));
            }
            else
            {
               finalcost[i] = finalcost[i-1]; 
            }
        }
        return finalcost[finalcost.length-1];
    }
}