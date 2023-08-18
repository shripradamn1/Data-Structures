N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.


int[] findTwoElement(int a[], int n) {
        int b[]=new int[2];
        HashMap<Integer,Integer> x=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            x.put(a[i],x.getOrDefault(a[i],0)+1);
        }
        int count=1;
        int one=0,two=0;
        for(int i=1;i<=n;i++)
        {
            if(x.containsKey(i))//if we dont put this condition we will get null pointer exception
            {
            if(x.get(i)>1)
            two=i;
            }
            else if(!x.containsKey(i))
            one=i;
        }
        b[0]=two;
        b[1]=one;
        return b;
    }
