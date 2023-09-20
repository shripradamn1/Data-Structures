grid =
[[2,1,1],[1,1,0],[0,1,1]]
Output
4
Expected
4

class Solution {
    public int orangesRotting(int[][] a) {
        Queue<Integer[]> q = new LinkedList<>();
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a[i].length;j++)
           {
               if(a[i][j]==2)
               q.add(new Integer[]{i,j});
           }
       }
       int count3=0;
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a[i].length;j++)
           {
               if(a[i][j]==1)
                count3++;
           }
       }
       
       int count=0;
        int count2=0;
       while(!q.isEmpty())
       {
           int size=q.size();
           while(size-->0)
           {
               Integer[] v=q.poll();
               int i=v[0];
               int j=v[1];
               a[i][j]=2;
              
               if(i-1>=0 && a[i-1][j]==1)
               {
                   count2++;
               a[i-1][j]=2;
               q.add(new Integer[]{i-1,j});
               }
               if(i+1<a.length && a[i+1][j]==1)
               {
                   count2++;
                   a[i+1][j]=2;
                   q.add(new Integer[]{i+1,j});
               }
               if(j-1>=0 && a[i][j-1]==1)
               {
                   count2++;
               a[i][j-1]=2;
               q.add(new Integer[]{i,j-1});
               }
               
               if(j+1<a[i].length && a[i][j+1]==1)
               {
                   count2++;
               a[i][j+1]=2;
               q.add(new Integer[]{i,j+1});
               }
               
           }
           if(!q.isEmpty())
           count++;
           
       }
       if(count2!=count3)
       return -1;
       if(count2==0)
       return 0;
       if(count==0)
       return -1;
       return count;
    }
}
