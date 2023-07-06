public class Min_SubArray_Sum {
    static int findMinSubArraySum(int target,int arr[])
    {
        int i = 0,j = 0, sum = 0, min = Integer.MAX_VALUE;
        while(j < arr.length)
        {
            sum+=arr[j++];
            while(sum >= target)
            {
                min = Math.min(min,j-i);
                sum-=arr[i++];
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int target = 7;
        int ans = findMinSubArraySum(target,arr);
        System.out.println(ans);
    }
}
