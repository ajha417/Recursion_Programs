public class Power_Of_Numbers {
    static long mod = 1000000007;
    static long reverse(int n,int r)
    {
        if(r==0) return 1;
        else if(r == 1) return n;
        if(r%2 != 0) {
            return (long) (n * reverse(n,r-1))%(mod);
        }
        long s = reverse(n,r/2);
        return (s*s)%(mod);

    }
    public static void main(String[] args) {
        int n = 21;
        int r = 12;
        long result = reverse(n,r);
        System.out.println(result);
    }
}
