
import java.util.*;

public class asg {
    static boolean DuplicateInArray(int a[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i],i);
        }
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }
            else hm.put(a[i],1);
        }
        for(int i=0;i<a.length;i++){
            if(hm.get(a[i])==1) return false;
        }
        return true;
    }

    static int LargestElement(int a[]){
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<a.length;i++){
            tm.put(a[i],i);
        }
        return tm.lastEntry().getKey();
    }


    static boolean CanBeFormed(String r,String m){
        //TC=SC=O(m+n);
        HashMap <Character,Integer> hm=new HashMap<>();
        HashMap <Character,Integer> hr=new HashMap<>();
        for(int i=0;i<m.length();i++){
            
            if(hm.containsKey(m.charAt(i))) hm.put(m.charAt(i),hm.get(m.charAt(i))+1);
            else hm.put(m.charAt(i),1);
        }
        for(int i=0;i<r.length();i++){
            
            if(hr.containsKey(r.charAt(i))) hr.put(r.charAt(i),hr.get(r.charAt(i))+1);
            else hr.put(r.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> e: hr.entrySet()){
            if(!hm.containsKey(e.getKey())) return false;
            else{
                int count=e.getValue();
                if(count>hm.get(e.getKey()))  return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // System.out.println("Start entering the array elements: ");
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // System.out.println(LargestElement(a));
        System.out.println(CanBeFormed("a", "abc"));
    }
}
