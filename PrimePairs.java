import java.util.ArrayList;
import java.util.List;

public class PrimePairs {

    static boolean isPrime(int n)
    {
        if(n <= 1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
        {
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    static List<List<Integer>> findPrimePairs(int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(n==0 || n==2 || n==3) return ans;
        for(int i = 2; i <=n/2; i++)
        {
            List<Integer> ds = new ArrayList<>();
            if(isPrime(i) && isPrime(n-i))
            {
                ds.add(i);
                ds.add(n-i);
                ans.add(new ArrayList<>(ds));
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int n = 10;
        List<List<Integer>> ans = findPrimePairs(n);
        for (List<Integer> value:ans)
        {
            System.out.println(value);
        }
    }
}
