Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.

class GfG
{
    int maxLen(int a[], int n)
    {
        HashMap<Integer,Integer> x=new HashMap<>();
        int ans=0;
        int sum=0;
        x.put(0,-1);
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(!x.containsKey(sum))
            x.put(sum,i);
            else
            {
                ans=Math.max(ans,i-x.get(sum));
            }
        }
        return ans;
    }
}
