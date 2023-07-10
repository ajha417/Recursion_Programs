public class Transpose_Of_Matrix {
    static void findTranspose(int a[][],int n)
    {

        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = {{1,1,1,1},
                    {2,2,2,2},
                    {3,3,3,3},
                    {4,4,4,4}};
        findTranspose(a,a.length);
        for (int rows[]:a)
        {
            for(int i:rows)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
