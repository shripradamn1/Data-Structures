
      10
     /  \
    20   30
   /  \
  40  60
Output: 30 10 60 20 40
Explanation: The tree is
      10               10
    /    \  (mirror) /    \
   20    30    =>   30    20
  /  \                   /   \
 40  60                 60   40
The inroder traversal of mirror is
30 10 60 20 40.
  
class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
     if(root==null)
     return;
     mirror(root.left);
     mirror(root.right);
     Node temp=root.left;
     root.left=root.right;
     root.right=temp;
    }
}
