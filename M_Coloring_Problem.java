import java.util.Arrays;

public class M_Coloring_Problem {
    public static void main(String[] args) {
//        here we will be given graph having some nodes
//        we need to color each node and we have option of M colors
//        we need to color those nodes in such a way that no adjacent nodes should have same color
        /* if we can then return true or return false*/
        boolean [][]graph = {
                {true,true},
                {false,true},
                {true,true}
        };
        int n = 3;
        int m = 2;
        graphColoring(graph,m,n);
    }
    public static boolean graphColoring(boolean [][]graph,int m,int n)
    {
        int colors[] = new int[n];
        Arrays.fill(colors,0);
        if(fillColors(0,graph,m,n,colors)==true) return true;
        return false;
    }

    public static boolean fillColors(int curr,boolean [][]graph,int m,int n,int []colors)
    {
        if(curr == n) return true;
        for(int i = 1; i <= m; i++)
        {
            if(isSafe(graph[curr],i,colors))
            {
                colors[curr] = i;
                if(fillColors(curr+1,graph,m,n,colors)==true)
                {
                    return true;
                }
                colors[curr] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(boolean graph[],int fill,int []colors)
    {
        for(int i = 0; i < graph.length; i++)
        {
            if(graph[i] == true && fill == colors[i])
            {
                return false;
            }
        }
        return true;
    }
}
