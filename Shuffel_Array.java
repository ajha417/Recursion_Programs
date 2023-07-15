import java.util.ArrayList;

public class Shuffel_Array {

    static void shuffleArray(int a[],int n)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            if(i < n/2)
            {
                l1.add(a[i]);
            }
            else l2.add(a[i]);
        }
        for(int i = 0; i < n; i++)
        {
            if(i%2==0)
            {
                a[i] = l1.get(i/2);
            }
            else
            {
                a[i] = l2.get(i/2);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 9, 15};
        int n = 4;
        shuffleArray(arr,n);
        for (int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}
