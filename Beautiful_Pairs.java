public class Beautiful_Pairs {
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
     static int countBeautifulPairs(int[] nums) {
         int count = 0;
         int n = nums.length;
         for (int i = 0; i < n - 1; i++) {
             while (nums[i] >= 10) {
                 nums[i] = nums[i] / 10;
             }
             int fd = nums[i];
             int j = i + 1;
             while (j < n) {
                 int sd = nums[j] % 10;
                 if (gcd(fd, sd) == 1) count++;
             }
         }
         return count;
     }
    public static void main(String[] args) {
        int a[] = {11,21,12};
        int count1 = countBeautifulPairs(a);
        System.out.println(count1);
    }
}
