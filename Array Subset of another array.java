Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long> x=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!x.containsKey(a1[i]))
            x.put(a1[i],1L);
            else
            x.put(a1[i],x.get(a1[i])+1L);
        }
        for(int i=0;i<m;i++)
        {
            if(!x.containsKey(a2[i]))
            return "No";
            else if(x.containsKey(a2[i]))
            {
                if(x.get(a2[i])>1L)
                x.put(a2[i],x.get(a2[i])-1L);
                else if(x.get(a2[i])==1L)
                x.remove(a2[i]);
            }
        }
        return "Yes";
        
    }
}
