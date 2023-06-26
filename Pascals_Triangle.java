public class Pascals_Triangle {

    static int findValue(int n,int r)
    {
        int res = 1;
        for(int i = 0; i < r; i++)
        {
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
//        this program will be used to find nCr

//        where we need to select r candidates out of n candidates
        int n = 10;
        int r = 2;
        int result = findValue(n,r);
        System.out.println(result);
    }
}
