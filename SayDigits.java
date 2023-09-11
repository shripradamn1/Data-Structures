class HelloWorld {
    public static void main(String[] args) {
        int n=500;
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
      
      solve(n,a);
    }
    static void solve (int n,String a[])
    {
        if(n<=0)
        return;
        
         int dig=n%10;
         solve(n/10,a);
          System.out.print(a[dig]+" ");
    }
}
