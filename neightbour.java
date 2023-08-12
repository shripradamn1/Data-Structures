class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int n, int a[]){
        
      // int b[]=new int[n-1];
       int count=0;
       for(int i=0;i<n-1;i++){
           if(a[i]<=a[i+1]){
               a[count]=a[i+1];
               count++;
           }
           else
           {
               a[count]=a[i];
               count++;
           }
       }
       for(int i=0;i<a.length-1;i++){
           System.out.print(a[i]+" ");
       }
        
    }
}