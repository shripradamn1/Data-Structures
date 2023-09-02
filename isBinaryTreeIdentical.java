Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.

boolean isIdentical(Node root1, Node root2)
	{
	    Queue<Node> q1=new LinkedList<>();
	     Queue<Node> q2=new LinkedList<>();
	     q1.add(root1);
	     q2.add(root2);
	  
	     while(!q1.isEmpty() && !q2.isEmpty())
	     {
	         Node curr1=q1.remove();
	          Node curr2=q2.remove();
	        if(curr1.data!=curr2.data)
	        return false;
	        if(curr1!=null && curr2==null||curr1==null && curr2!=null)
	        return false;
	        if (curr1.left != null && curr2.left == null || curr1.left == null && curr2.left != null) {
               
                return false;
            }
	       if (curr1.right != null && curr2.right == null||curr1.right == null && curr2.right != null) {
                return false;
            }
 
            if (curr1.left != null && curr2.left != null) {
                q1.add(curr1.left);
                q2.add(curr2.left);
            }
            
            if (curr1.right != null && curr2.right != null) {
                q1.add(curr1.right);
                q2.add(curr2.right);
            }
	         
	     }
	     return true;
	}
