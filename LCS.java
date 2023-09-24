3 3 
ABC
ACB
Your Output: 
2
Expected Output: 
2

static int lcs(int n, int m, String s1, String s2)
    {
      int dp[][]=new int[n+1][m+1];
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=m;j++)
          {
              if(s1.charAt(i-1)==s2.charAt(j-1))
              dp[i][j]=dp[i-1][j-1]+1;
              else
              dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
          }
      }
      return dp[n][m];
    }
