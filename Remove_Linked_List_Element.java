class ListNode
{
    ListNode next;
    int data;
    public ListNode(int data)
    {
        this.data = data;
        next = null;
    }
}
public class Remove_Linked_List_Element {
    public static void main(String[] args) {
        ListNode head = null;
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;


//        here we need to remove the nodes whose value matches with the given value
        int val = 6;
        removeLinkedList(head,val);
    }
    static ListNode removeLinkedList(ListNode head,int val)
    {
        if(head == null) return null;
        head.next = removeLinkedList(head.next,val);
        return head.data == val ? head.next:head;
    }
}
