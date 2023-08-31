For example, if below is given tree and k is 2. Output should be 4 5 6.

          1
       /     \
     2        3
   /         /   \
  4        5    6 
     \
      8

  class Tree
{
     // Recursive function to print right view of a binary tree.
      ArrayList<Integer> al=new  ArrayList<Integer>();
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         if(root==null)
         return al;
        
             if(k==0)
             al.add(root.data);
             
         
          Kdistance(root.left,k-1);
          Kdistance(root.right,k-1);
          return al;
          
     }
}
