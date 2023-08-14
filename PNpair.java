import java.util.ArrayList;
import java.util.HashSet;

public class PNpair {
    public static ArrayList<Integer>findPairs(int a[], int n) 
    { 
            HashSet<Integer> x=new HashSet<>();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
               
                if(a[i]<0){
                    if(x.contains(Math.abs(a[i]))){
                        al.add(a[i]);
                        al.add(Math.abs(a[i]));
                        x.remove(a[i]);
                        x.remove(Math.abs(a[i]));
                    }
                }
                if(a[i]>=0){
                    if(x.contains(-a[i])){
                        al.add(-a[i]);
                        al.add(a[i]);
                         x.remove(a[i]);
                        x.remove(-a[i]);
                    }
                }
                 x.add(a[i]);
            }
            if(al.isEmpty())
            {
                al.add(0);
                return al;
            }
            return al;
    }
}
