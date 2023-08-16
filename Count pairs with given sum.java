N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

  class Solution {
    int getPairsCount(int[] a, int n, int k) {
       HashMap<Integer,Integer>x=new hashMap<>();
       int count=0;
       for(int i=0;i<n;i++){
           if(x.containsKey(k-a[i]))
           count+=x.get(k-a[i]);
           if(x.containsKey(a[i]))
           x.put(a[i],x.get(a[i])+1);
           else
           x.put(a[i],1);
       }
    }
}
