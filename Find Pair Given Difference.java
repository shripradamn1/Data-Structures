5 -60
1 8 30 40 100


class Solution
{
    public boolean findPair(int a[], int n, int k)
    {
        Arrays.sort(a);
        int i=0;
        int j=1;
        
        while(i<n && j<n)
        {
            if(i!=j && (Math.abs(a[i]-a[j])==Math.abs(k)))
            return true;
          else  if(a[j]-a[i]<k)
            j++;
            else
            i++;
            
        }
        return false;
    }
}
