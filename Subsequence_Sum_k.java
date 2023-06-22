import java.util.ArrayList;
import java.util.List;

public class Subsequence_Sum_k {
//    static int k = 4;
    static void print_whose_sum_k(int a[],List<Integer> lst,int i,int sum,int n,int k)
    {
        if(i == n)
        {
            if(sum == k)
            {
                for (int val:lst){
                    System.out.print(val+" ");
                }
                System.out.println();
                return;
            }
        }
        lst.add(a[i]);
        sum+=a[i];
        print_whose_sum_k(a,lst,i+1,sum,n,k);
        sum-=a[i];
        lst.remove(lst.size()-1);
        print_whose_sum_k(a,lst,i+1,sum,n,k);
    }
    public static void main(String[] args) {
//        here we need to print the subsequence whose sum is equal to given sum
        int a[] = {1,2,3,1,1,2};
        int k = 4;
        List<Integer> lst = new ArrayList<>();
        print_whose_sum_k(a,lst,0,0,a.length,k);

    }
}
