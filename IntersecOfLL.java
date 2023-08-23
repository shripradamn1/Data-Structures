input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         HashSet<Node> x=new HashSet<>();
        Node cur=head1;
        while(cur!=null)
        {
            x.add(cur);
            cur=cur.next;
        }
        cur=head2;
        while(cur!=null)
        {
            if(x.contains(cur))
            return cur.data;
            cur=cur.next;
            
        }
        return -1;
	}
}
