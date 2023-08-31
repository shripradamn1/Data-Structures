
Input:
    1
  /   \ 
 3     2
Output:1 3 2
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList <Integer> al=new ArrayList <Integer>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node cur=q.remove();
            al.add(cur.data);
            if(cur.left!=null)
            q.add(cur.left);
            if(cur.right!=null)
            q.add(cur.right);
        }
        return al;
        
    }
}
