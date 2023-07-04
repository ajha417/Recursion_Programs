import java.util.ArrayList;
import java.util.List;

public class Print_Pattern {
    static void solve(int n,List<Integer> ans)
    {
        if(n <= 0)
        {
            ans.add(n);
            return;
        }
        ans.add(n);
        solve(n-5,ans);
        ans.add(n);
    }
    public static void main(String[] args) {
        int n = 16;
        List<Integer> ans = new ArrayList<>();
        solve(n,ans);
        for(int val:ans)
        {
            System.out.print(val+" ");
        }
    }
}
