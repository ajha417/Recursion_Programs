import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_Sum_II {

    static void helper(int ind,int []arr,List<List<Integer>> ans,List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for (int i = ind; i < arr.length; i++)
        {
            if(i > ind && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            helper(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3};
        Arrays.sort(arr);
//        we need to find subset which contains only unique elements

//        for example
//        [1,2,3] can be possible
//        but [1,2,2,3] cannot be possible
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,arr,ans,new ArrayList<>());
        for(List<Integer> value:ans)
        {
            System.out.println(value);
        }
    }
}
