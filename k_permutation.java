import java.util.ArrayList;
import java.util.List;

public class k_permutation {
    static String findKthPermutation(int n,int k)
    {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++)
        {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);
        k = k-1;
        String ans = "";
        while (true)
        {
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if (numbers.size()==0) break;
            k = k % fact;
            fact = fact/numbers.size();

        }
        return ans;

    }
    public static void main(String[] args) {

        int n = 4;
        int k = 17;
        String ans = findKthPermutation(n,k);
        System.out.println(ans);
    }
}
