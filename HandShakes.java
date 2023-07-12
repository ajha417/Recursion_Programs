public class HandShakes {
    static int count(int N)
    {
        int dp[] =  new int[N+1];
        dp[0] = 1;
        dp[2] = 1;
        for(int i = 4; i <= N; i+=2)
        {
            int a = 0;
            int num = i/2;
            int x = 2;
            int y = 0;
            while (num-- > 0)
            {
                a+=(dp[i-x]*dp[y]);
                x+=2;
                y+=2;
            }
            dp[i] = a;
        }
        return dp[N];
    }
    public static void main(String[] args) {

        /*We have N persons sitting on a round table. Any person can do a handshake with any other person.

        1
        2         3
        4

        Handshake with 2-3 and 1-4 will cause cross.

                In how many ways these N people can make handshakes so that no two handshakes cross each other. N would be even.*/

        /*Input:
            N = 2
            Output:
            1
            Explanation:
            {1,2} handshake is
            possible.
            */
        System.out.println(count(8));
    }
}
