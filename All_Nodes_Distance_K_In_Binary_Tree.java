import java.util.*;

class TreeNodes {
      int val;
      TreeNodes left;
      TreeNodes right;
      TreeNodes(int x) { val = x; }
  }

public class All_Nodes_Distance_K_In_Binary_Tree {

    private static void markParents(TreeNodes root,Map<TreeNodes,TreeNodes> parent_track)
    {
        Queue<TreeNodes> queue = new LinkedList<TreeNodes>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            TreeNodes current = queue.poll();
            if(current.left != null)
            {
                queue.offer(current.left);
                parent_track.put(current.left,current);
            }
            if(current.right != null)
            {
                queue.offer(current.right);
                parent_track.put(current.right,current);
            }
        }
    }
    private static List<Integer> distanceK(TreeNodes root,TreeNodes target,int k)
    {
        Map<TreeNodes,TreeNodes> parent_track = new HashMap<>();
        Map<TreeNodes,Boolean> vis = new HashMap<>();
        markParents(root,parent_track);
        Queue<TreeNodes> q = new LinkedList<>();
        q.offer(target);
        vis.put(target,true);
        int currLevel = 0;
        while (!q.isEmpty())
        {
            if(currLevel == k) break;
            currLevel++;
            int size = q.size();
            for (int i = 0; i < size; i++)
            {
                TreeNodes current = q.poll();
                if(current.left != null && vis.get(current.left)==null)
                {
                    q.offer(current.left);
                    vis.put(current.left,true);
                }
                if(current.right != null && vis.get(current.right) == null)
                {
                    q.offer(current.right);
                    vis.put(current.right,true);
                }
                if(parent_track.get(current) != null && vis.get(parent_track.get(current))==null)
                {
                    q.offer(parent_track.get(current));
                    vis.put(parent_track.get(current),true);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty())
        {
            TreeNodes curr = q.poll();
            res.add(curr.val);
        }
        return res;

    }

    public static void main(String[] args) {

        TreeNodes root = new TreeNodes(3);
        TreeNodes firstleft = new TreeNodes(5);
        TreeNodes firstright = new TreeNodes(1);
        TreeNodes secondleft = new TreeNodes(6);
        TreeNodes secondRight = new TreeNodes(2);
        TreeNodes thirdLeft = new TreeNodes(7);
        TreeNodes thirdRight = new TreeNodes(4);


        root.left = firstleft;
        root.right = firstright;

        firstright.left = null;
        firstright.right = null;

        firstleft.left = secondleft;
        firstleft.right = secondRight;

        secondleft.left = null;
        secondleft.right = null;

        secondRight.left = thirdLeft;
        secondRight.right = thirdRight;

        thirdLeft.left = null;
        thirdLeft.right = null;

        thirdRight.left = null;
        thirdRight.right = null;

        List<Integer> ans = distanceK(root,firstleft,2);
        for (int val:ans)
            System.out.print(val+" ");
    }
}
