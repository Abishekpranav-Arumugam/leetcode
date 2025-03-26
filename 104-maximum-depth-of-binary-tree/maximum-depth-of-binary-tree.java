class Solution 
{
    public int maxDepth(TreeNode root) 
    {
        if (root == null) return 0;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int depth=0;
        while(!queue.isEmpty())
        {
            int l=queue.size();
            depth++;
            for(int i=0;i<l;i++)
            {
                TreeNode node=queue.poll();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
        return depth;
    }
}