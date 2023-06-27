public class Remove_Adjacent_Duplicates {
    public static void main(String[] args) {
//        here we need to remove adjacent duplicates
//        for example
//        s = geeksforgeeks
//        ans = gksforgks
        String s = "geeksforgeeks";
        String result = rremove(s);
        System.out.println(result);
    }
    static String rremove(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            char prev = s.charAt(i-1);
            if(i == 0 && s.charAt(i) != s.charAt(i+1))
            {
                str.append(curr);
            }
            else if (i == s.length()-1 && curr != prev) {
                str.append(curr);
            }
            else if(i > 0 && i < s.length()-1 && curr != prev && curr != next)
            {
                str.append(curr);
            }
        }
        if(s.length() == str.length())
        {
            return str.toString();
        }
        return rremove(str.toString());
    }
}
