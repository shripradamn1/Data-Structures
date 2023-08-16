Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  
2 5
Explanation: 
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 

ArrayList<Long> find(long a[], int n, int x)
    {
        ArrayList<Long> al=new ArrayList<>();
        
        long first=0L;
        long last=0L;
        if(a[0]==x)
        first=0;
        if(a[n-1]==x)
         last=n-1;
        for(int i=1;i<n;i++)
        {
            if(a[i]==x && a[i]!=a[i-1]){
            first=i;
            break;
            }
            
        }
        for(int i=n-2;i>=0;i--){
            if(a[i]==x &&a[i]!=a[i+1])
            {
                if(i>=first){
                    last=i;
                    break;
                }
            }
        }
        if(first==0 && last==0){
            al.add(-1L);
            al.add(-1L);
            return al;
        }
        al.add(first);
        al.add(last);
        return al;
    }
