public class Tower_Of_Hanoi {
    static long toh(int n,int from,int to,int aux)
    {
        long steps = 0;
        if(n == 0) return steps;

        steps += toh(n-1,from,aux,to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        steps++;

        steps += toh(n-1,aux,to,from);
        return steps;
    }
    public static void main(String[] args) {
        int N = 3;
        int from = 1;
        int to = 3;
        int aux = 2;
        long ans = toh(N,from,to,aux);
        System.out.println(ans);
    }
}
