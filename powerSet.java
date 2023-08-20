Input : str = "abc"
Output: a ab abc ac b bc c
Explanation : There are 7 subsequences that 
can be formed from abc.

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String> al=new ArrayList<>();
       
       solve(s,"",0,al);
       Collections.sort(al);
        return al;
    }
    
   static void solve(String s,String ans,int i,List<String> a)
   {
       if(i==s.length())
       {
           if(!ans.isEmpty())
         a.add(ans);
           return ;
       }
      
      
        solve(s,ans+s.charAt(i),i+1,a);
         solve(s,ans,i+1,a);
      
   }
}
