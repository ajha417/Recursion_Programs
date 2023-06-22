public class Count_Subsequence {
    static int findTotalNoOfSubsequence(int a[],int i,int s,int sum,int n)
    {
        if(i == n){
            if(s==sum) return 1;
            else return 0;
        }
        s+=a[i];
        int left = findTotalNoOfSubsequence(a,i+1,s,sum,n);
        s-=a[i];
        int right = findTotalNoOfSubsequence(a,i+1,s,sum,n);
        return left + right;
    }
    public static void main(String[] args) {
        int a[] = {1,2,1};
        int sum = 2;
        int result = findTotalNoOfSubsequence(a,0,0,sum,a.length);
        System.out.println("Total number of subsequence is: "+result);
    }
}
