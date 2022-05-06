
public class Solution {
	
	public static void main(String[] args)
	{
		int [][]arr= {{1 ,0 ,1},{1 ,1, 1},{1, 0,1}};
		ratInAMaze(arr,3);
	}


	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
         printAllPath(maze,0,0,new int[n][n]);
        

	}
    private static void printAllPath(int[][] maze,int i,int j,int[][] path)
    {
        if(i<0 || i>=maze.length||j<0||j>=maze.length||maze[i][j]==0||path[i][j]==1)
        {
            return;
        }
        path[i][j]=1;
        if(i==maze.length-1 && j==maze.length-1)
        {
            for(int r=0;r<maze.length;r++)
            {
                for(int c=0;c<maze.length;c++)
                {
                    System.out.print(path[r][c]+" ");
                }
            }
            System.out.println();
            path[i][j]=0;
            return;
        }
        
        printAllPath(maze,i-1,j,path);
        printAllPath(maze,i,j+1,path);
        printAllPath(maze,i+1,j,path);
        printAllPath(maze,i,j-1,path);
        path[i][j]=0;
        
    }

}
//1 0 0 1 1 0 0 1 1 
//1 1 0 0 1 0 0 1 1