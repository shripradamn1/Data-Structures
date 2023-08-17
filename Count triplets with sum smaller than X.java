Input: N = 4, sum = 2
arr[] = {-2, 0, 1, 3}
Output:  2


  class Solution
{
    long countTriplets(long a[], int n,int sum)
    {
        long  count=0L;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int h=n-1;
            while(l<h)
            {
                if(a[i]+a[l]+a[h]<sum){
                count+=h-l;
                l++;
                }
                else 
                h--;
            }
        }
        return count;
    }
}

  
