public class MinimumDepthOfBinaryTree {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        helper(1,root);
        return min;
    }
    public void helper(int dep , TreeNode root){
        if(root == null || dep > min) {
            return;
        }
        if(root.left == null && root.right == null){
            if(min > dep) min = dep;
            return;
        }
        helper(dep+1 , root.left);
        helper(dep+1 , root.right);
    }
}
