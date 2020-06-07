class Straight_Line
{
    public boolean checkStraightLine(int[][] coordinates) 
    {
        double b = (coordinates[1][1]-coordinates[0][1]);
        double c = (coordinates[1][0]-coordinates[0][0]);
        for(int i=1;i<coordinates.length;i++)
        {
            if(coordinates[i][0]==0&&coordinates[0][0]==0)
                continue;
            double a = (coordinates[i][1]-coordinates[0][1]);
            double d = (coordinates[i][0]-coordinates[0][0]);
            if(b/c!=a/d)
                return false;
        }
        return true;
    }
}