import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

    static void combinationsum2(int ind,int []arr,int target,List<List<Integer>> ds,List<Integer> lst)
    {
        if(target == 0)
        {
            ds.add(new ArrayList<>(lst));
            return;
        }
        for(int i = ind;i < arr.length; i++)
        {
            if(i > ind && arr[i] == arr[i-1])  continue;
            if(arr[i] > target) break;
            lst.add(arr[i]);
            combinationsum2(ind+1,arr,target-arr[i],ds,lst);
            lst.remove(lst.size()-1);
        }
    }
    static void findCombination(int []candidates,int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationsum2(0,candidates,target,ans,new ArrayList<>());
        for (List<Integer> val:ans)
        {
            for(int value:val)
            {
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int candidates[] = {1,1,1,2,2};
        int target  = 4;
        findCombination(candidates,target);
    }
}
