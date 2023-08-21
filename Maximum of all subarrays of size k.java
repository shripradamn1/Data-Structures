N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6



static ArrayList <Integer> max_of_subarrays(int a[], int n, int k)
    {
        ArrayList<Integer> al=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            
            while(!dq.isEmpty() && a[i]>=a[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.add(i);
        }
        for(int i=k;i<n;i++)
        {
            al.add(a[dq.peek()]);
            while(!dq.isEmpty() && dq.peek()<=(i-k))
            {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && a[i]>=a[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.add(i);
            
        }
        al.add(a[dq.peek()]);
        return al;
    }
