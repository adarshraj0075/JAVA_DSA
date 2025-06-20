public class RecurMazeObstacl {
    public static void main(String[] args) {
        boolean maze[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        mazeObstacls(0, 0, maze, "");
    }

    static void mazeObstacls(int i,int j,boolean maze[][],String p){
        if(i==maze.length-1&&j==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(i>=maze.length||j>=maze[0].length||maze[i][j]==false){
            return;
        }
        mazeObstacls(i+1, j, maze, p+"R");
        mazeObstacls(i, j+1, maze, p+"D");
    }
    
}
