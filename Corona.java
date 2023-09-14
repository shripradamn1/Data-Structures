{{0,0},{0,0},{0,1},{0,0}};
3 days


import java.util.*;
class HelloWorld {
    static int count=0;
    public static void main(String[] args) {
       int[][] grid={{0,0},{0,0},{0,1},{0,0}};
     
       solve(grid,2,1);
      System.out.println(count);
    }
    static void solve(int a[][],int row,int col)
    {
          Queue<Integer []> q=new LinkedList<>();
        q.add(new Integer[]{row,col});
        
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                Integer v[]=q.remove();
            int i=v[0];
            int j=v[1];
          
                if(i-1>=0 && a[i-1][j]==0)
                {
                    a[i-1][j]=1;
                    q.add(new Integer[]{i-1,j});
                }
                if(j-1>=0&& a[i][j-1]==0)
                {
                    a[i][j-1]=1;
                     q.add(new Integer[]{i,j-1});
                }
                if(j+1<a[i].length&& a[i][j+1]==0)
                {
                    a[i][j+1]=1;
                     q.add(new Integer[]{i,j+1});
                }
                if(i+1<a.length && a[i+1][j]==0)
                {
                    a[i+1][j]=1;
                     q.add(new Integer[]{i+1,j});
                }
                
            }
            if(!q.isEmpty())
                  count++;
          
        }
    }
}
