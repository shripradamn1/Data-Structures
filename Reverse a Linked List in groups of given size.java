LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output: 4 2 2 1 8 7 6 5 
Explanation: 
The first 4 elements 1,2,2,4 are reversed first 
and then the next 4 elements 5,6,7,8. Hence, the 
resultant linked list is 4->2->2->1->8->7->6->5.

class Solution
{
    public static Node reverse(Node head, int k)
    {
        
        Node cur=head;
        Node prev=null;
        int count=0;
        Node temp=null;
        
        while(cur!=null && count<k)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
            count++;
        }

        if(temp!=null)
        {
           head.next=reverse(temp,k); 
        }
        return prev;
    }
}
