public class Find_Safe_Position {

    static int safePosition(int n,int k)
    {
        if(n==1) return 1;
        return (safePosition(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        int n = 4,k = 2;
        System.out.println(safePosition(n,k));
    }
}
