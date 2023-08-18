Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.

  class Solution {
    int findKRotation(int a[], int n) {
       int count=0;
       for(int i=0;i<n-1;i++)
       {
           if(a[i]>a[n-1])
           count++;
           else break;
       }
       return count;
    }
}
