public int numIslands(char[][] grid) {
        int count=0;
        boolean flag=true;
        while(flag)
        flag=false;
        for(int i=0;i<grid.length;i++)
        {   
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    solve(grid,i,j);
                    flag=true;
                    count++;
                }
                
            }
        }
        return count;
        
    }
    static void solve(char[][] a,int row,int col)
    {
        Queue<Integer []> q=new LinkedList<>();
        q.add(new Integer[]{row,col});
          
        while(!q.isEmpty())
        {
            int size=q.size();
            
            while(size-->0)
            {Integer v[]=q.remove();
                int i=v[0];
                int j=v[1];
              a[i][j]='0';
                if(i-1>=0 && a[i-1][j]=='1')
                {
                    a[i-1][j]='0';
                    q.add(new Integer[]{i-1,j});
                }
                if(j-1>=0&& a[i][j-1]=='1')
                {
                    a[i][j-1]='0';
                     q.add(new Integer[]{i,j-1});
                }
                if(j+1<a[i].length&& a[i][j+1]=='1')
                {
                    a[i][j+1]='0';
                     q.add(new Integer[]{i,j+1});
                }
                if(i+1<a.length && a[i+1][j]=='1')
                {
                    a[i+1][j]='0';
                     q.add(new Integer[]{i+1,j});
                }
                 if((i-1>=0 && j-1>=0) &&a[i-1][j-1]=='1')
                {
                    a[i-1][j-1]='0';
                    q.add(new Integer[]{i-1,j-1});
                }
                 if((i-1>=0 &&j+1<a[i].length) && a[i-1][j+1]=='1')
                {
                    a[i-1][j+1]='0';
                    q.add(new Integer[]{i-1,j+1});
                }
                 if((i+1<a.length && j-1>=0) &&a[i+1][j]=='1')
                {
                    a[i+1][j-1]='0';
                    q.add(new Integer[]{i+1,j-1});
                }
                 if((i+1<a.length && j+1<a[i].length)&& a[i+1][j+1]=='1')
                {
                    a[i+1][j+1]='0';
                    q.add(new Integer[]{i+1,j+1});
                }
                
                
            }
        }
    }
