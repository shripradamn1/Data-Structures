Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

class Solution {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
        if(n==2)
        return 2;

     int a=climbStairs(n-1);
        int b=climbStairs(n-2);
int c=a+b;
return c;
    }
}
