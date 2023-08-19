Input:
n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        int ans=solve(0,n);
        return ans;
    }
    static int solve(int count,int n)
    {
        if(n==0)
        {
            return count;
        }
        

        return solve(count+n%10,n/10);
    }
}
