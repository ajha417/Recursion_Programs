import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subset_Sum_I {
    static void findSubsetSum(int ind,int arr[],int sum,List<Integer> ans)
    {
        if(ind == arr.length)
        {
            ans.add(sum);
            return;
        }
        sum+=arr[ind];
        findSubsetSum(ind+1,arr,sum,ans);
        sum-=arr[ind];
        findSubsetSum(ind+1,arr,sum,ans);
    }
    public static void main(String[] args) {
        int candidates[] = {3,1,2};
        List<Integer> ans = new ArrayList<>();

        findSubsetSum(0,candidates,0,ans);
        Collections.sort(ans);
        for(int val:ans)
        {
            System.out.print(val+" ");
        }
    }
}
