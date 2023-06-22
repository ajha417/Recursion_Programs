import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    static void findSub(int a[],int i,List<Integer> lst,int n)
    {
        if(i==n)
        {
            for(int val:lst){
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }
        lst.add(a[i]);
        findSub(a,i+1,lst,n);
        lst.remove(lst.size()-1);
        findSub(a,i+1,lst,n);
    }
    public static void main(String[] args) {

        int a[] = {1,2,3};
        List<Integer> list = new ArrayList<>();
        findSub(a,0,list,a.length);
    }
}
