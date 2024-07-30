package Tutorial1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
         TreeNode root=new TreeNode(5);
         root.left=new TreeNode(9);
         root.right=new TreeNode(19);
         root.left.left=new TreeNode(29);
         root.left.right=new TreeNode(39);
         root.right.left=new TreeNode(49);
         root.right.right=new TreeNode(59);
         root.left.left.left=new TreeNode(789);
         root.left.left.left.right
         =new TreeNode(219);
        LevelOrderTraversal le=new LevelOrderTraversal();
        List<List<Integer>> li=le.levelOrder(root);
        List<Integer> check=le.rightView(root);
        for (List<Integer> list : li) {
            
            System.out.println(list);
            
        }
        for (Integer k : check) {
            System.out.println(k);
        }
   
        
    }

    public List<Integer> rightView(TreeNode root) {
        ArrayList<Integer> outer=new ArrayList<>();
        if(root==null) return outer;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int sz=q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode te=q.remove();
                if(te.left!=null) q.add(te.left);
                if(te.right!=null) q.add(te.right);
                if(i==sz-1) outer.add(te.val);
                
            }
        }
        

        return outer;
    }

    public  List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer=new ArrayList<>();
        if(root==null)return outer;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> inner=new ArrayList<>();
            int sz=q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode te=q.remove();
                if(te.left!=null)
                {
                    q.add(te.left);
                }
                if(te.right!=null)
                {
                    q.add(te.right);
                }
                inner.add(te.val);
            }
            outer.add(inner);
        }


        return outer;
    }
   
    
    
}

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
