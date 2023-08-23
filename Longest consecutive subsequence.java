N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.


class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int a[], int n)
	{
	    int  cursec=1;
	    int lsec=1;
	    Arrays.sort(a);
	    int last=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]-1==last)
	        {
	            cursec++;
	            last=a[i];
	        }
	     else if(a[i]==last)
	        continue;
	      else  if(a[i]-1!=last)
	        { 
	            cursec=1;
	            last=a[i];
	            
	        }
	        lsec=Math.max(lsec,cursec);
	    }
	    
	    return lsec; 
	}
}
