Input:
LinkedList: 2->2->2->2->2
Output: 2
Explanation: In the given linked list 
2 ->2 ->2 ->2 ->2, 2 is the only element
and is repeated 5 times. So we need to remove
any four 2.


class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	
	    Node cur=head;
	  
	    while(cur!=null && cur.next!=null)
	    {
	        if(cur.data==cur.next.data)
	        cur.next=cur.next.next;
	        else
	        cur=cur.next;
	    }
	    return head;
    }
}
