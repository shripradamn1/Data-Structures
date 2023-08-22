Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch=='{'||ch=='('||ch=='[')
            s.push(ch);
          else if(s.isEmpty()&& (ch=='}'||ch==')'||ch==']'))
            return false;
           else if(!s.isEmpty() &&!compare(s.peek(),ch))
              return false;
            else
            s.pop();
        }
        if(s.isEmpty())
        return true;
        return false;
    }
    static boolean compare(char ch1,char ch2)
    {
        if(ch1=='[' && ch2==']')
        return true;
        
        else  if(ch1=='{' && ch2=='}')
        return true;
        else  if(ch1=='(' && ch2==')')
        return true;
        return false;
    }
}
