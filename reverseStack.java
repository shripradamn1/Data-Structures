St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
Explanation:
Input stack after reversing will look like the stack in the output.

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        return ;
        
        int temp=s.pop();
        reverse(s);
        pushB(s,temp);
        
    }
    static void pushB(Stack<Integer> s, int temp)
    {
         if(s.isEmpty())
         {
             s.push(temp);
             return ;
         }
         int t=s.pop();
         pushB(s,temp);
         s.push(t);
    }
}
