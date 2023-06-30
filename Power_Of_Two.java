public class Power_Of_Two {

    static boolean isPowerOfTwo(int n)
    {
        if(n==0) return false;
        while(n%2==0)
        {
            n/=2;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int n = 16;
        if(isPowerOfTwo(n))
            System.out.println("yes");
        else System.out.println("No");
    }
}
