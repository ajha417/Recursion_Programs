public class ReverseArray {

    private static void swap(int a[],int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
    private static void reverseIt(int a[],int n,int i)
    {
        if(i >= n/2) return;
        swap(a,i,n-i-1);
        reverseIt(a,n,i+1);
    }
    public static void main(String[] args) {
        int a[] = {4,5,6,7,8};
        reverseIt(a,a.length,0);

//        after reversing using recursion
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
}
