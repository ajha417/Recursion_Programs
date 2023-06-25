import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {

    static boolean isSafe(int row,int col,int [][] board)
    {
        int duprow = row;
        int dupcol = col;
        while(col >= 0)
        {
            if(board[row][col]==1) return false;
            col--;
        }
        row = duprow;
        col = dupcol;
        while(row >= 0 && col >= 0)
        {
            if(board[row][col]==1) return false;
            row--;
            col--;
        }
        row = duprow;
        col = dupcol;
        while(row < board.length && col >= 0)
        {
            if(board[row][col]==1) return false;
            row++;
            col--;
        }
        return true;
    }
    static boolean findSolution(int col,int[][] board)
    {

        if(col >= board.length)
        {
            return true;
        }
        for(int rows = 0; rows < board.length; rows++)
        {
            if(isSafe(rows,col,board)==true)
            {
                board[rows][col] = 1;
                if(findSolution(col+1,board)==true){
                    return true;
                }
                board[rows][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int board[][] = new int[4][4];
        for(int rows[]:board)
        {
            Arrays.fill(rows,0);
        }
//        List<int[][]> ans =  new ArrayList<>();
        if(findSolution(0,board)==false){
            System.out.println("Solution doesn't exist");
        }
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                if(board[i][j]==1)
                    System.out.print("Q"+ " ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
