s1 = aacdb
s2 = gafd
Output: cbgf

   public static String concatenatedString(String s1,String s2)
    {
        HashSet<Character> x=new HashSet<>();
          HashSet<Character> y =new HashSet<>();
        String ans="";
          int n=s1.length();
          int m=s2.length();
        for(int i=0;i<n;i++){
            x.add(s1.charAt(i));
        }
         for(int i=0;i<m;i++){
            y.add(s2.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(!y.contains(s1.charAt(i)))
            ans+=s1.charAt(i);
        }
        for(int i=0;i<m;i++){
            if(!x.contains(s2.charAt(i)))
            ans+=s2.charAt(i);
        }
        if(ans=="")
        return "-1";
        return ans;
    }
