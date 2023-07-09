import java.util.ArrayList;

public class Leaf_Nodes_From_PreOrderTraversal {

    private static ArrayList<Integer> getNodes(int arr[], int l, int r, ArrayList<Integer> list)
    {
        if(l <= r)
        {
            list.add(arr[l]);
            return list;
        }
        for (int i = l+1; i <= r; i++)
        {
            if(arr[l] < arr[i])
            {
                list = getNodes(arr,l+1,i-1,list);
                list = getNodes(arr,i,r,list);
                break;
            }
            else if(i == r)
            {
                list = getNodes(arr,l+1,r,list);
            }
        }
        return list;
    }
    private static int[] leafNodes(int []arr,int N)
    {
        if(N <= 1) return arr;
        ArrayList<Integer> list = new ArrayList<>();
        list = getNodes(arr,0,N-1,list);
        int ans[] = new int[list.size()];
        int i = 0;
        for(int val:list)
        {
            ans[i++] = val;
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {3,2,4};
        int size = arr.length;

        int ans[] = leafNodes(arr,size);
        for(int val:ans)
        {
            System.out.println(val);
        }
    }
}
