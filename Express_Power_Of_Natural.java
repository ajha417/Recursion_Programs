import java.util.Arrays;

public class Express_Power_Of_Natural {

    static int helper(int n,int x,int [][]dp,int i)
    {
        if(n < 0) return 0;
        if(n == 1) return 1;
        if(Math.pow(n,x) > n) return 0;
        if(dp[n][i]!=-1) return dp[n][i];
        int temp = (int)Math.pow(n,x);
        int case1 = helper(n-temp,x,dp,i+1);
        int case2 = helper(n,x,dp,i+1);
        return dp[n][i] = case1 + case2;
    }
    static int numOfWays(int n, int x)
    {
        int dp[][] = new int[n+1][n+1];
        for (int rows[]:dp)
        {
            Arrays.fill(rows,-1);
        }
        return helper(n,x,dp,1);

    }
    public static void main(String[] args) {
        int n = 100;
        int x = 2;
//        there are 3 ways to reach unto 100
//        no.1 : 10^2 = 100
//        no.2 : 6^2 + 8^2 = 100
//        no.3 : 1^2 + 3^2 + 4^2 + 5^2 + 7^2
        System.out.println(numOfWays(n,x));
    }
}
