import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

    static void findCombination(int []arr,int ind,List<List<Integer>> ds,int target,List<Integer> lst)
    {
        if(ind == arr.length)
        {
            if(target == 0)
            {
                ds.add(new ArrayList<>(lst));

            }
            return;
        }

        if(arr[ind] <= target)
        {
            lst.add(arr[ind]);
            findCombination(arr,ind,ds,target-arr[ind],lst);
            lst.remove(lst.size()-1);
        }
        findCombination(arr,ind+1,ds,target,lst);
    }
    static void combination(int []candidates,int target)
    {
        List<List<Integer>> adj = new ArrayList<>();
        findCombination(candidates,0,adj,target,new ArrayList<>());
        for (List<Integer> val:adj)
        {
            for(int va:val)
            {
                System.out.print(va+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int candidates[] = {2,2,3,7};
        combination(candidates,7);
    }
}
