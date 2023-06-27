import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}


public class Union_Of_LinkedList {

    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head,tail;
        int val;
        val = sc.nextInt();
        head = tail = new Node(val);
        size--;
        while(size-- > 0)
        {
            val = sc.nextInt();
            tail = new Node(val);
            tail = tail.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int  t = sc.nextInt();
        while(t-- > 0)
        {
            int n,m;
            n = sc.nextInt();
            Node head1 = inputList(n);
            m = sc.nextInt();
            Node head2 = inputList(m);
            Solution obj = new Solution();
            obj.findSolution(head1,head2);
        }
    }
}
class Solution
{

    public static Node sort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node mid = slow;
        Node nextToMid = slow.next;
        mid.next = null;

        Node first = sort(head);
        Node second = sort(nextToMid);

        Node ans = merge(first,second);
        return ans;
    }
    public static Node merge(Node a,Node b)
    {
        if(a==null)
        {
            return b;
        }
        if(b == null)
        {
            return a;
        }
        Node ans = null;
        if(a.data < b.data)
        {
            ans = a;
            ans.next = merge(a.next,b);
        }
        else if(b.data < a.data)
        {
            ans = b;
            ans.next = merge(a,b.next);
        }
        else {
            ans = a;
            ans.next = merge(a.next,b.next);
        }
        return ans;
    }
    public static Node findSolution(Node head1,Node head2)
    {
        Node merged = merge(head1,head2);
        Node sorted = sort(merged);
        return sorted;
    }
}
