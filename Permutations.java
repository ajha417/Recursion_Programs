import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void helper(int []a,List<List<Integer>> ans,List<Integer> ds,boolean []freq)
    {
        if(ds.size() == a.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < a.length; i++)
        {
            if(!freq[i])
            {
                freq[i] = true;
                ds.add(a[i]);
                helper(a,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[a.length];
        helper(a,ans,ds,freq);
        for (List<Integer> val:ans)
        {
            System.out.println(val);
        }
    }
}
