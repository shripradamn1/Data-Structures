Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
       int count=0;
       while(!q.isEmpty()){
           Node cur=q.remove();
          
           if(cur==null)
           {
               if(q.isEmpty())
               break;
               else
               {
                   count=0;
                   q.add(null);
               }
           }
           else
           {
            if(count==0)
           {
               al.add(cur.data);
               count=1;
           }
           
           
           if(cur.right!=null)
           q.add(cur.right);
           if(cur.left!=null)
           q.add(cur.left);
           }
           
       }
       return al;
    }
}
