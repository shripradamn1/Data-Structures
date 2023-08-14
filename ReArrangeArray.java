public static int[] sortA1ByA2(int a1[], int n, int a2[], int m)
    {
       int b[]=new int[n];
       int count=0;
       HashMap<Integer,Integer> x=new HashMap<>();
       for(int i=0;i<n;i++){
           
           if(!x.containsKey(a1[i]))
           x.put(a1[i],1);
           else
           x.put(a1[i],x.get(a1[i])+1);
       }
       for(int i=0;i<m;i++){
           
           if(x.containsKey(a2[i])){
               
               while(x.get(a2[i])>0){
                  
                  b[count]=a2[i];
                  count++;
                  x.put(a2[i],x.get(a2[i])-1);
               }
           }
       }
       
       
      Arrays.sort(a1);
       for(int i=0;i<n;i++){
           if(x.containsKey(a1[i]) && x.get(a1[i])>0)
           {
               b[count]=a1[i];
               count++;
               x.put(a1[i],x.get(a1[i])-1);
           }
       }
       if(count==0){
           Arrays.sort(a1);
           return a1;
       }
       
       return b;
    }
