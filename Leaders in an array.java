Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n){
        ArrayList<Integer> al=new ArrayList<>();
        
        int l=a[n-1];
        al.add(a[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>=l)
            {
                l=a[i];
                al.add(l);
            }
        }
        Collections.reverse(al);  //to reverse the arraylist use this method
        return al;
      
    }
}
