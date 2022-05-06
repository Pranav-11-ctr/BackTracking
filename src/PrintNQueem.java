import java.io.*;
import java.util.*;

public class PrintNQueem {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] chess = new int[n][n];
    printNQueens(chess, "", 0);


  }

  public static void printNQueens(int[][] chess, String qsf, int row) {
    if (row == chess.length)
    {
      System.out.println(qsf+".");
      return;
    }
    for (int i = 0; i < chess[row].length; i++)
    {
        if(isItSafeToPlace(chess,row,i)==true)
        {
      chess[row][i] = 1;
      printNQueens(chess, qsf + row + "-" + i + ", ", row + 1);
      chess[row][i] = 0;
        }
    }

  }
  public static boolean isItSafeToPlace(int[][] chess,int row,int col)
  {
      //first Vertically check
      for(int i=row-1;i>=0;i--)
      {
          if(chess[i][col]==1)
          {
              return false;
          }
      }
      //check in primary diagonal
      for(int i=row-1,j=col-1;i>=0&& j>=0;i--,j--)
      {
         if(chess[i][j]==1)
          {
              return false;
          } 
      }
      //check in secondary diagonal
      for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++)
      {
         if(chess[i][j]==1)
          {
              return false;
          }   
      }
      return true;
  }
}