Input:
n = 5
arr[] = {10,2,-2,-20,10}
sum = -10
Output: 3
Explanation: Subarrays with sum -10 are: 
[10, 2, -2, -20], [2, -2, -20, 10] and 
[-20, 10].

class Solution
{
    //Function to count the number of subarrays which adds to the given sum.
    
    static int subArraySum(int a[], int n, int k)
{
    int count = 0;
    int sum = 0;
    HashMap<Integer, Integer> x = new HashMap<>();
    x.put(0, 1);
    for (int i = 0; i < n; i++)
    {
        sum += a[i];
        
        if (x.containsKey(sum - k))
        {
            count+=x.get(sum-k);
        }
        x.put(sum, x.getOrDefault(sum, 0) + 1);
    }
    return count;
}

}
