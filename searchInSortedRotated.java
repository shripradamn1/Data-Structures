Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
l = 0 , h = 8
Output:
5
Explanation: 10 is found at index 5.


class Solution
{
    int search(int a[], int l, int h, int k)
    {
        int n=a.length;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==k)
            return mid;
          
          if(a[mid]>=a[0] )
          {
              if(k>=a[0] && k<a[mid])
              h=mid-1;
              else
              l=mid+1;
          }
          else
          {
              if(k>a[mid] && k<=a[n-1])
              l=mid+1;
              else
             h=mid-1;
          }
            
        }
        return -1;
    }
}
