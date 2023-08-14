public class reaarageAlt {
    public static void rearrange(long a[], int n){
        long b[]=new long[n];
        int count=0;
        int mid=n/2;
        for(int i=0;i<n;i++){
           
            if(i<n-1-i){
                b[count]=a[n-i-1];
                count++;
            }
             if(i<n-1-i){
                b[count]=a[i];
                count++;
            }
            
            
        }
        if(n%2!=0)
        b[n-1]=a[mid];
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
    
        
        
    }
}

