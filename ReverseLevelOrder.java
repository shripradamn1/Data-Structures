Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10

  public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
      ArrayList<Integer> al=new ArrayList<Integer>();
      Stack<Integer> st=new Stack<>();
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
              st.push(cur.data);
              
              if(cur.right!=null)
              q.add(cur.right);
              if(cur.left!=null)
              q.add(cur.left);
          }
          
      }
      while(!st.isEmpty())
      {
          al.add(st.pop());
      }
      return al;
    }
