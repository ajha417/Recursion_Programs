import java.util.Scanner;

public class Fibonacci_series {
    static int findFibonacci(int n)
    {
        if(n <= 1) return n;

        return findFibonacci(n-1) + findFibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int n = sc.nextInt();
        int result = findFibonacci(n);
        System.out.println("The result of fibonacci series is:"+result);
    }
}
