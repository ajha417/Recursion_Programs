import java.util.Stack;

public class Decode_String {
    static String getMultiplierString(String numString, String ans)
    {
        int nTimes = Integer.parseInt(numString);
        String res = "";
        for (int i = 0; i < nTimes; i++)
        {
            res+=ans;
        }
        return res;
    }
    static String decodedString(String s)
    {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch==']')
            {
                String ans = "";
                while(!stack.isEmpty() && stack.peek().charAt(0)!='[')
                {
                    ans = stack.peek()+ans;
                    stack.pop();
                }
                stack.pop();
                String numString = "";
                while (!stack.isEmpty() && stack.peek().charAt(0) >='0' && stack.peek().charAt(0) <= '9')
                {
                    numString = stack.peek() + numString;
                    stack.pop();
                }
                stack.push(getMultiplierString(numString,ans));
            }
            else stack.push(""+ch);

        }
        String ans = "";
        while (!stack.isEmpty()){
            ans += stack.peek();
            stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        String ans = decodedString(s);
        String res = "";
        for (int i = ans.length()-1; i>=0; i--)
        {
            res+=ans.charAt(i);
        }
        System.out.println(ans);
        System.out.println(res);
    }
}
