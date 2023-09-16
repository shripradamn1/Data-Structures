Input:
n1 = 3 , n2 = 4
           5    
          /    
         2  
        / \  
       3   4
Output: 2
Explanation:
LCA of 3 and 4 is 2. 

Node lca(Node root, int n1,int n2)
	{
	        if(root==null)
	        return null;
	        
	        if(root.data==n1|| root.data==n2)
	        return root;
	        
	        Node left =lca(root.left,n1,n2);
	        Node right=lca(root.right,n1,n2);
	        
	        if(right==null)
	        return left;
	        
	        if(left==null)
	        return right;
	        
	        return root;
	        
	}
