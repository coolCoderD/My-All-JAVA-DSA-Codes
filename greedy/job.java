import java.util.ArrayList;
import java.util.Collections;

public class job {
    static class jobs{
        char id;
        int deadline,profit;
        // public jobs(){};
        public  jobs(char id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    static void  printJobSched(ArrayList<jobs> al,int maxdeadline){
        int n=al.size();
        Collections.sort(al,(a,b)-> b.profit-a.profit);
        boolean slot[]=new boolean[maxdeadline];
        char job[]=new char[maxdeadline];
        for(int i=0;i<al.size();i++){
            for(int j=Math.min(al.get(i).deadline-1,maxdeadline-1);j>=0;j--){
                if(slot[j]==false){
                    slot[j]=true;
                    job[j]=al.get(i).id;
                    break;
                }
            }
        }
        for(char id:job){
            System.out.print(id+" ");
        }
    }
    public static void main(String[]args){
        ArrayList<jobs> arr=new ArrayList<>();
        arr.add(new jobs('1', 5, 55));
        arr.add(new jobs('2', 2, 65));
        arr.add(new jobs('3', 7, 75));
        arr.add(new jobs('4', 3, 60));
        arr.add(new jobs('5', 2, 70));
        arr.add(new jobs('6', 1, 50));
        arr.add(new jobs('7', 4, 85));
        arr.add(new jobs('8', 5, 68));
        arr.add(new jobs('9', 3, 45));
        printJobSched(arr,7);
    }
}
