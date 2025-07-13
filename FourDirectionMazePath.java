public class FourDirectionMazePath {
    static void maze(int sr, int sc, int er,int ec,String s ,boolean[][] isVisited)
    {
        if(sr<0 || sc<0)
        {
            return;
        }
        if(sr > er || sc > ec)
        {
            return;
        }
        if(sr==er && sc == ec)
        {
            System.out.println(s);
        }
        if(isVisited[sr][sc]==true)
        {
            return;
        }
        //rightways
        isVisited[sr][sc] = true;

        maze(sr,sc+1,er,ec,s+"R",isVisited);
        //lownways
        maze(sr+1, sc, er, ec, s+"D", isVisited);

        //leftways
        maze(sr,sc-1,er,ec,s+"L",isVisited);

        //upways
        maze(sr-1,sc,er,ec,s+"U",isVisited);

        isVisited[sr][sc] = false; 
    }
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        boolean[][] isVisited = new boolean[row][col];
        maze(0,0,row-1,col-1,"",isVisited);
        }
}
