import java.util.Stack;

public class GetMinFromStack {

    static int minEle;
    static Stack<Integer> s;

    // Constructor
    GetMinFromStack()
    {
        s = new Stack<>();
        minEle = Integer.MAX_VALUE;
    }

    /*returns min element from stack*/
    static int getMin()
    {
        // Your code here
        if(s.isEmpty())
        {
            return -1;
        }
        return minEle;
    }

    /*returns poped element from stack*/
    static int pop()
    {
        // Your code here
        if(s.isEmpty()) return -1;
        int poppedElement = s.pop();
        if(poppedElement == minEle)
        {
            minEle = s.pop();
        }
        return poppedElement;
    }

    /*push element x into the stack*/
    static void push(int x)
    {
        // Your code here
        if(x <= minEle)
        {
            s.push(minEle);
            minEle = x;
        }
        s.push(x);
    }
    public static void main(String[] args) {
        GetMinFromStack obj1 = new GetMinFromStack();
        obj1.push(2);
        obj1.push(3);
        obj1.push(1);
        obj1.push(5);
        obj1.pop();
        System.out.println(getMin());
    }
}
