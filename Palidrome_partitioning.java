import java.util.ArrayList;
import java.util.List;

public class Palidrome_partitioning {
    public static void main(String[] args) {
        String s = "aabb";
        List<List<String>> ans = partition(s);
        for (List<String> value:ans)
            System.out.println(value);
    }
    public static List<List<String>> partition(String s)
    {
        List<List<String>> ans = new ArrayList<>();
        findPartition(0,ans,new ArrayList<>(),s);
        return ans;
    }
    public static void findPartition(int index, List<List<String>> ans, List<String> path, String s)
    {
        if(index == s.length())
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++)
        {
            if(isPalidrome(s,index,i))
            {
                path.add(s.substring(index,i+1));
                findPartition(i+1,ans,path,s);
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean isPalidrome(String s,int i,int j)
    {
        while(i <= j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
