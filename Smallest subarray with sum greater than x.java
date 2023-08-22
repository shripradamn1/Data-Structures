Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}

class Solution {

    public static int smallestSubWithSum(int a[], int n, int x)
    {
       int start=0;
       int sum=0;
       int count=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
           sum+=a[i];
           while(sum>x && start<=i)
           {
               count=Math.min(count,i-start+1);
               sum-=a[start++];
           }
       }
      if(count==Integer.MAX_VALUE)
       count=0;
       return count;
    }
}
