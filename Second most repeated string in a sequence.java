N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.

class Solution
{
    String secFrequent(String a[], int n)
    {
        HashMap<String,Integer> x=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            x.put(a[i],x.getOrDefault(a[i],0)+1);
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(x.get(a[i])>max)
            max=x.get(a[i]);
            
        }
        String sec="";
        int se=0;
        for(int i=0;i<n;i++)
        {
            if(x.get(a[i])<max && x.get(a[i])>se)
            {
                sec=a[i];
                se=x.get(a[i]);
            }
        }
        return sec;
    }
}
