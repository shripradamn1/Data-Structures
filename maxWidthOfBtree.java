Input:
       1
     /    \
    2      3
Output: 2
On the first level there is only
one node 1
On the second level there are
two nodes 2, 3 clearly it is the 
maximum number of nodes at any level


class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=0;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            Node cur=q.remove();
            if(cur==null)
            {
                max=Math.max(max,count);
                count=0;
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else{
                count++;
            if(cur.left!=null)
            q.add(cur.left);
            if(cur.right!=null)
            q.add(cur.right);
            }
           
            
        }
        return max;
    }
}
