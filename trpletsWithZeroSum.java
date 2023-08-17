Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.

public boolean findTriplets(int a[] , int n)
    {
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int h=n-1;
            while(l<h)
            {
                if(a[i]+a[h]+a[l]==0)
                return true;
                else if(a[i]+a[h]+a[l]<0)
                l++;
                else
                h--;
            }
        }
        return false;
    }
