Input: 
N = 4 
arr[] = {1, 5, 3, 2}
Output: 2 
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5

class Solution {
    int countTriplet(int a[], int n) {
        HashSet<Integer> x=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            x.add(a[i]);
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(x.contains(a[i]+a[j]))
                count++;
            }
        }
        return count;
    }
}
