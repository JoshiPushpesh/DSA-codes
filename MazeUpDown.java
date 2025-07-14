public class MazeUpDown {
    static int[] rowDir = {0,1,-1};
    static int[] colDir = {1,0,0};
    static String[] moveChar = {"R","D","U"};
    static int rows,cols;

    static void findPaths(int[][] maze, int row,int col,String path,boolean[][] visited )
    {
        if(row<0 || row>=rows || col<0 || col>=cols || maze[row][col]==0 || visited[row][col]){
            return;
        }

        if(row == rows-1 && col == cols-1)
        {
            System.out.println(path);
            return;
        }
        visited[row][col]=true;

        for(int i = 0;i<3;i++)
        {
            int nextRow = row + rowDir[i];
            int nextCol = col + colDir[i];
            findPaths(maze, nextRow, nextCol, path+moveChar[i], visited);
        }
        visited[row][col] = false;
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,1,0},
            {1,1,1},
            {0,1,1}
        };
        rows = maze.length;
        cols = maze[0].length;

        boolean[][] visited = new boolean[rows][cols];
        findPaths(maze, 0, 0, "", visited);
    }
}
