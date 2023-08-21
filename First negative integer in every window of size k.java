N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output : 
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6

class Compute {
    
    public long[] printFirstNegativeInteger(long a[], int n, int k)
    {
     //   int n=a.length;
        long b[]=new long[n-k+1];
        Deque<Integer> dq=new LinkedList<>(); 
        int ind=0;
        for(int i=0;i<k;i++)
        {
            if(a[i]>=0)
            continue;
         
         dq.addLast(i);
        }
        if(!dq.isEmpty())
        b[ind++]=a[dq.peekFirst()];
        else 
         b[ind++]=0;
        for(int i=k;i<n;i++)
        {
            int start=i-k+1;
            while(!dq.isEmpty() && dq.peekFirst()<start)
            dq.removeFirst();
            if(a[i]<0)
             dq.addLast(i);
             
             if(dq.isEmpty())
              b[ind++]=0;
              else
                b[ind++]=a[dq.peekFirst()];
        }
        return b;
    }
}
