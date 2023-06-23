import java.util.ArrayList;
import java.util.List;

public class Permutations_Approach_II {

    static void swap(int i,int j,int []arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void findPermute(int ind,int arr[],List<List<Integer>> ans)
    {
        if(ind == arr.length)
        {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++)
            {
                ds.add(arr[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i < arr.length; i++)
        {
            swap(i,ind,arr);
            findPermute(ind+1,arr,ans);
            swap(i,ind,arr);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        findPermute(0,a,ans);
        for (List<Integer> val:ans)
        {
            System.out.println(val);
        }
    }
}
