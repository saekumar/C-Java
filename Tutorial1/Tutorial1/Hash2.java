package Tutorial1;

import java.util.*;


 
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

class Entry{
	TreeNode n; int vl; Entry(TreeNode n, int l){this.n = n; this.vl = l;}
}
class Hash2{
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
		if(root == null) return ans;
 
		Queue<Entry> q = new LinkedList<>();
		q.add(new Entry(root, 0));
		Map<Integer, List<Integer>> mp = new TreeMap<>();
 
		while(!q.isEmpty()){
			Entry e = q.remove();
 
			if(mp.containsKey(e.vl)){
				mp.get(e.vl).add(e.n.val);
			} else {
				mp.put(e.vl, new ArrayList<>());
				mp.get(e.vl).add(e.n.val);
			}
 
			if(e.n.left != null)
				q.add(new Entry(e.n.left, e.vl - 1));
			if(e.n.right != null)
				q.add(new Entry(e.n.right, e.vl + 1));			
		}
 
		System.out.println(mp.size());
		return ans;
    }
}