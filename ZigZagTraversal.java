import java.util.*;

class TreeNode{
    TreeNode left,right;
    int val;
    public TreeNode(){}
    public TreeNode(int va)
    {
        this.val = val;
    }
    public TreeNode(int val,TreeNode left,TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
public class ZigZagTraversal {

    public static void main(String[] args) {


//        core program to find zig-zag traversal

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        while (q.size() > 0)
        {
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < size; i++)
            {
                TreeNode node = q.poll();
                sublist.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            if(flag)
            {
                ans.add(sublist);
            }
            else {
                Collections.reverse(sublist);
                ans.add(sublist);
            }

        }

    }
}
