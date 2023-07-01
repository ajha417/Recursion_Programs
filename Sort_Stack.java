import java.util.Stack;

public class Sort_Stack {

    private static void insert(Stack<Integer> s,int temp)
    {
        if(s.size()==0 || temp>=s.peek())
        {
            s.push(temp);
            return;
        }
        int x = s.pop();
        insert(s,temp);
        s.push(x);
    }
    private static void sortedStack(Stack<Integer> s)
    {
        if (s.size()==0) return;
        int temp = s.pop();
        sortedStack(s);
        insert(s,temp);
    }
    private static Stack<Integer> sort(Stack<Integer> s)
    {
        sortedStack(s);
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(5);
        s.push(0);
        s.push(1);
        s.push(2);
        Stack<Integer> ans = sort(s);
        for (int val:ans)
            System.out.print(val+" ");
    }
}
