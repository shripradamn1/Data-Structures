Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

class Solution {
    public int fib(int n) {
        
        if(n==0)
        return 0;

        if(n==1)
        return 1;

      int a=fib(n-1);
      int b=fib(n-2);
     int c= a+b;
      return c;
    }
}
