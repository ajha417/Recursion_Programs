import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Possible_Words_From_Digits {
    static List<String> keys = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");

    static void helper(int a[],List<String> ans,String temp,int i)
    {
        if(i == a.length)
        {
            ans.add(temp);
            return;
        }
        String curr = keys.get(a[i]);
        for (int j = 0; j < curr.length(); j++)
        {
            helper(a,ans,temp+curr.charAt(j),i+1);
        }
    }
    static List<String> possibleStringsFromDigits(int a[],int n)
    {
        List<String> ans = new ArrayList<>();
        helper(a,ans,"",0);
        return ans;
    }
    public static void main(String[] args) {
//        here we will be given array of digits we need to find the possible combination of string from those digits

//        for example
//        2 - abc, 3 -def and so on
//        if a[] = {2,3}
//        the possible string includes ad,ae,af,bd,bd,bf,cd,ce,cf

        int a[] = {2,3,4};
        List<String> ans = possibleStringsFromDigits(a,a.length);

        for (String val:ans)
        {
            System.out.print(val + " ");
        }
    }
}
