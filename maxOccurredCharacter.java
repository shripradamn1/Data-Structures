public static char getMaxOccuringChar(String s)
    {
       HashMap<Character,Integer> x=new HashMap<>();
       int n=s.length();
       for(int i=0;i<n;i++)
       {
           char ch=s.charAt(i);
           if(!x.containsKey(ch))
           x.put(ch,1);
           else
           x.put(ch,x.get(ch)+1);
       }
       int max=0;
       char let='\0';
       for(int i=0;i<n;i++)
       {
           char ch=s.charAt(i);
           if(x.get(ch)>max)
           {
               max=x.get(ch);
               let=ch;
           }
           else if(x.get(ch)==max)
           {
               if((int)let>(int)ch)
               {
                   let=ch;
               }
           }
           
       }
       return let;
    }
