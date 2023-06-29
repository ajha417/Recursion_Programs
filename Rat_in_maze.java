import java.util.ArrayList;
import java.util.List;

public class Rat_in_maze {
    static void findPath(int i,int j,List<String> ans,String s,int [][]maze)
    {
        if(i >= maze.length || j >= maze.length || i < 0 || j < 0 || maze[i][j]==0) return;
        if(i== maze.length-1 && j == maze.length-1)
        {
            ans.add(s);
            return;
        }
        maze[i][j] = 0;
        findPath(i+1,j,ans,s+"D",maze);
        findPath(i-1,j,ans,s+"U",maze);
        findPath(i,j+1,ans,s+"R",maze);
        findPath(i,j-1,ans,s+"L",maze);
        maze[i][j] = 1;
        return;
    }
    public static void main(String[] args) {
        int maze[][] = {
                        {1,0,0,0},
                        {1,1,0,1},
                        {1,1,0,0},
                        {0,1,1,1}
                       };
        List<String> ans = new ArrayList<>();
        findPath(0,0,ans,"",maze);
        for (String val:ans)
            System.out.println(val);
    }
}
