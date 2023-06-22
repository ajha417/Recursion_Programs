public class Check_Palidrome {
    static boolean isPalidrome(String str,int i)
    {
        if(i >= str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isPalidrome(str,i+1);
    }
    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalidrome(str,0);
        if(result){
            System.out.println("The given string is palidrome");
        }
        else{
            System.out.println("It is not palidrome");
        }
    }
}
