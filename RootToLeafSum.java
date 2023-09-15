Input:
Tree = 
            1
          /   \
        2      3
S = 4

boolean hasPathSum(Node root, int target) {
        Stack<Node> s=new Stack<>();
        Stack<Integer> sum=new Stack<>();
        
        s.add(root);
        sum.add(root.data);
        while(!s.isEmpty())
        {
            Node cur=s.pop();
            int su=sum.pop();
            if((cur.left==null && cur.right==null) && su==target)
            return true;
            else
            {
                if(cur.left!=null)
                {
                    s.push(cur.left);
                    sum.push(su+cur.left.data);
                }
                 if(cur.right!=null)
                {
                    s.push(cur.right);
                    sum.push(su+cur.right.data);
                }
            }
        }
        return false;
    }
