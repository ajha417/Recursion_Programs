public class Longest_SubArrayOne {
    static int longestSubArray(int nums[])
    {
        int prevCount = 0,count = 0,res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]==1) count++;
            else {
                res = Math.max(res,count + prevCount);
                prevCount = count;
                count = 0;
            }
        }
        return res== nums.length?res:res-1;
    }
    public static void main(String[] args) {
//        we must have to delete one element
//        we need to find longest subarray of 1's after deleting one element
        int nums[] = {0,1,1,1,0,1,1,0,1};
        int ans = longestSubArray(nums);
        System.out.println(ans);
    }
}
