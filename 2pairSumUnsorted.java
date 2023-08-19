Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


class Solution {
    public int[] twoSum(int[] a, int t) {
        int b[]=new int[2];
        HashMap<Integer,Integer> x=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(x.containsKey(t-a[i]))
            {
                b[0]=x.get(t-a[i]);
                b[1]=i;
            }
            else 
            x.put(a[i],i);
        }
        return b;
    }
}
