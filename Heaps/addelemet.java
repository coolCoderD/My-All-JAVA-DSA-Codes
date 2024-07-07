import java.util.*;
//min heap
public class addelemet {
    static class Heap{
    ArrayList<Integer> arr=new ArrayList<>();
    public void add(int data){
        arr.add(data); //add at last 
        int x=arr.size()-1;  // x is child index
        int par=(x-1)/2;
        while( x>0 && arr.get(x) < arr.get(par)){  //0(logn )
            int t=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,t);
            x=par;
            par=(x-1)/2;
        }
    }
    private void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int minidx=i;

        //may be a leaf node
        if(left<arr.size() && arr.get(minidx)>arr.get(left) ){
            minidx=left;
        }

        if(right<arr.size() && arr.get(minidx)>arr.get(right)){
            minidx=right;
        }

        if(minidx!=i){
            //swap
            int t=arr.get(i);
            arr.set(i,arr.get(minidx));
            arr.set(minidx,t);

            heapify(minidx);
        }
    }

    public int peek(){
        return arr.get(0);
    }

    public int remove(){
        int data=arr.get(0);
        
        //swap first and last
        int t=arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,t);


        //del last
        arr.remove(arr.size()-1);


        //heapify
        heapify(0);
        return data;
    }

    public boolean isEmpty(){
        return arr.size()==0;
    }

}

    public static void main(String args[]){
        Heap h=new Heap();
        h.add(10);
        h.add(11);
        h.add(14);
        h.add(18);
        h.add(21);
        h.add(24);
        h.add(26);
        h.add(100);



        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }

}
