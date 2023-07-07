public class Maximize_Confusion_Of_Exam {
    static int maximizeConfusion(String answerKey,int k)
    {
        int l = 0,r = 0, ans = Integer.MIN_VALUE;
        int count = 0;

        while (r < answerKey.length())
        {
            if(answerKey.charAt(r)=='T') count++;
            while (count > k)
            {
                if (answerKey.charAt(l)=='T') count--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }

        l = 0;
        r = 0;
        while (r < answerKey.length())
        {
            if(answerKey.charAt(r)=='F') count++;
            while (count > k)
            {
                if (answerKey.charAt(l)=='F') count--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
    public static void main(String[] args) {
//        here we will be given answer key and value of k
//        we can perform exactly k operation
//        either we can convert T to F k times or F to T k times

        String answerKey = "TTFF";
        int k = 2;
        System.out.println(maximizeConfusion(answerKey,k));
    }
}
