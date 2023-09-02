Input:
       1
     /   \
    4     3
   /  \
  5    N
Output: 0
Explanation: Here, 1 is the root node
and 4, 3 are its child nodes. 4 + 3 =
7 which is not equal to the value of
root node. Hence, this tree does not
satisfy the given conditions.
  

public static int isSumProperty(Node root)
    {
       if(root==null)
        return 1;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node cur=q.remove();
            if(cur==null)
            {
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else
            {
                
            if(cur.left==null && cur.right!=null||cur.left!=null && cur.right==null)
            {
              if(cur.left==null && cur.right!=null)
              {
                  if(cur.right.data!=cur.data)
                  return 0;
              }
              else if(cur.left!=null && cur.right==null)
              {
                  if(cur.left.data!=cur.data)
                  return 0;
              }
          }
          if(cur.left!=null && cur.right!=null)
          {
              if(cur.right.data+cur.left.data!=cur.data)
              return 0;
          }
          if(cur.left!=null)
          q.add(cur.left);
          if(cur.right!=null)
            q.add(cur.right);
          
        }
        }
        return 1;
        
    }
