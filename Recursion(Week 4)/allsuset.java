import java.util.Iterator;
import java.util.*;

public class allsuset {
    static void allsubset(int a[],int i,ArrayList <Integer>ll){
        if(i==a.length) {
            if(ll.size()>0){
                System.out.println(ll);

            }
            return ;
        }
        allsubset(a,i+1,ll);
        ll.add(a[i]);
        allsubset(a,i+1,ll);
        ll.remove(ll.size()-1);

    }


    public static void main(String [] args)
    {

        ArrayList<Integer> ll=new ArrayList<Integer>();
        int a[]={1,2,5,6};
        allsubset(a, 0, ll);

    }
}
