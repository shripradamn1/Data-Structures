Input: N = 4, K = 0
Output: No
Explanation: Binary representation of 4 is 100, 
in which 0th index bit from LSB is not set. 
So, return false.

  
static boolean checkKthBit(int x, int k)
    {
       String s=Integer.toBinaryString(x);
     int n=s.length();
     if(k>n)
     return false;
        for(int i=n-1;i>=0;i--){
            if((n-i-1)==k){
                if(s.charAt(i)=='1')
                return true;
            }
        }
        return false;
    }
