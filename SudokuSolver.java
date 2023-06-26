public class SudokuSolver {
    public static boolean isSafe(int row,int col,int val,int [][]board)
    {
        for(int i = 0; i < 9; i++)
        {
            if(board[row][i]!=0 && board[row][i]==val) return false;
            if(board[i][col]!=0 && board[i][col]==val) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==val) return false;
        }
        return true;
    }
    public static boolean solve(int [][]board)
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j]==0)
                {
                    for(int val=1; val <= 9; val++)
                    {
                        if(isSafe(i,j,val,board)==true)
                        {
                            board[i][j] = val;
                            if(solve(board)== true) return true;
                            else board[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int board[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        if(solve(board)==false){
            System.out.println("solution doesn't found");
        }
        for (int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
