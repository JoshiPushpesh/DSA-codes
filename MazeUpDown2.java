public class MazeUpDown2 {
   
    static int rows,cols;

    static void findPaths(int[][] maze, int row,int col,String path )
    {
        if(row<0 || row>=rows || col<0 || col>=cols || maze[row][col]==0){
            return;
        }

        if(row == rows-1 && col == cols-1)
        {
            System.out.println(path);
            return;
        }
           maze[row][col] = 0;


         findPaths(maze, row, col + 1, path + "R");
         findPaths(maze, row + 1, col, path + "D");
          findPaths(maze, row - 1, col, path + "U");
          maze[row][col] = 1;
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,1,0},
            {1,1,1},
            {0,1,1}
        };
        rows = maze.length;
        cols = maze[0].length;

        findPaths(maze, 0, 0, "");
    }
}
