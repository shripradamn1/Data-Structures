Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int sum = 0;
        if(s == 0) {
            res.add(-1);
            return res;
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == s) {
                res.add(i + 1);
                res.add(i + 1);
                return res;
            }
            sum += arr[i];
            if(sum == s) {
                res.add(1);
                res.add(i + 1);
                return res;
            }
            if(map.containsKey(sum - s)) {
                res.add(map.get(sum - s) + 2);
                res.add(i + 1);
                return res;
            }
            map.put(sum, i);
        }
        res.add(-1);
        return res;
    }
}
