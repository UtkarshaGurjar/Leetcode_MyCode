/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
     List<Integer> l1 = new ArrayList();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        check(root1);
        check(root2);
        Collections.sort(l1);
        return l1;
    }
    public void check(TreeNode t)
    {
        if(t==null)
        {return;} 
        else
        {l1.add(t.val);
        check(t.left);
        check(t.right);}
    }
}