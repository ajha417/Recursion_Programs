import java.util.ArrayList;
import java.util.List;

public class Generate_Paranthesis {

    static void solve(List<String> ans,int n,int open,int close,String s)
    {
        if(s.length() == 2*n)
        {
            ans.add(s);
            return;
        }
        if(open < n)
        {
            solve(ans,n,open+1,close,s+"(");
        }
        if(close < open)
        {
            solve(ans,n,open,close+1,s+")");
        }
    }
    static List<String> allParenthesis(int n)
    {
        List<String> ans = new ArrayList<>();
        solve(ans,n,1,0,"(");
        return ans;
    }
    public static void main(String[] args) {

//        we need to generate balanced parenthesis

        int n = 3;
        List<String> ans = allParenthesis(n);
        for (String val:ans)
        {
            System.out.println(val);
        }
    }
}
