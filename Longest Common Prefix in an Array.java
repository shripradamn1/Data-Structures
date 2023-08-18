N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.

class Solution{
    String longestCommonPrefix(String a[], int n){
       String ans="";
       int count=1;
       int len=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
           if(a[i].length()<len)
           len=a[i].length();
       }
       for(int i=0;i<len;i++)
       {
           count=1;
           char ch=a[0].charAt(i);
           for(int j=1;j<n;j++)
           {
               
               if(a[j].charAt(i)==ch)
                count++;
               
           }
           if(count==n)
           ans+=ch;
       }
       if(ans=="")
       return "-1";
       return ans;
    }
}
