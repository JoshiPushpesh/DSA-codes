public class MazeExample {
    static int maze(int sr,int sc, int er, int ec)
    {

        if(sr>er || sc>ec)
        {
            return 0;
        }
        if(sr == er && sc == ec)
        {
            return 1;
        }
        int downways = maze(sr+1,sc,er,ec);
        int rightways = maze(sr,sc+1,er,ec);

        int totalways = downways + rightways;
        return totalways;
    }
    
    public static void main(String[] args) {
        int row = 2;
        int col = 2;

        int wayscount = maze(1,1,row,col);
        System.out.println(wayscount);
    }
}
