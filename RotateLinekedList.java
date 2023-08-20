Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        Node cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        Node cur1=head;
       int count=0;
       while(count<k)
       {
           Node temp=cur1;
           
           cur1=cur1.next;
           temp.next=null;
           cur.next=temp;
            cur=temp;
            count++;
           
       }
       return cur1;
    }
}
