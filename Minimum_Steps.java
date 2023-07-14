public class Minimum_Steps {

    static int steps(int d,int i,int j){
        if(i-d >= 0 && (i-d)%2==0)
        {
            return j;
        }
        j++;
        return steps(d,i+j,j);
    }
    static int minSteps(int D)
    {
        int res = steps(D,0,0);
        return res;
    }
    public static void main(String[] args) {
        /*Given an infinite number line. You start at 0 and can go either to the left or to the right. The condition is that in the ith move, youmust take i steps. Given a destination D , find the minimum number of steps required to reach that destination.

            Example 1:

            Input: D = 2
            Output: 3
            Explanation: The steps taken are +1, -2 and +3.
            Example 2:

            Input: D = 10
            Output: 4
            Explanation: The steps are +1, +2, +3 and +4.*/
        int D = 10;
        System.out.println(minSteps(D));
    }
}
