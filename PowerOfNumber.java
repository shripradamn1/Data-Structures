a= 2, b = 4
Output: 16

class Solution
{
         long ans=1;
    long power(int a,int b)
    {
      ans=solve(a,b);
        
        return ans;
    }
    static long solve(int a,int b)
    {
        if(b==0)
        return 1;
        if(b==1)
        return a;
        
        long ans=solve(a,b/2);
        if(b%2==0)
        return ans*ans;
        else
        return ans*ans*a;
       
    }

}
