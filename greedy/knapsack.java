import java.util.*;


public class knapsack {
    // static double getMaxValue(ItemValue arr[],int capacity){
    //     Arrays.sort(arr,new Comparator<ItemValue>() {
    //         @Override
    //         public int compare(ItemValue item1,ItemValue item2){
    //             double cpr1=Double.valueOf(item1.profit/item1.weight);
    //             double cpr2=Double.valueOf(item2.profit/item2.weight);
    //             if(cpr1<cpr2) return 1;
    //             return -1;
    //         }
            
    //     });
    //     double totalvalue=0;
    //     for(ItemValue i:arr){
    //         int currwt=(int)i.weight;
    //         int currprofit=(int)i.profit;
    //         if(capacity-currwt>=0){
    //             capacity=capacity-currwt;
    //             totalvalue+=currprofit;
    //         }
    //         else{
    //             double fraction=((double)capacity/(double) currwt);
    //             totalvalue+=(fraction*currprofit);
    //             capacity=(int)(capacity-(currwt*fraction));
    //             break;
    //         }
    //     }
    //     return totalvalue;
    // }

    static double getMaxValue(ItemValue[] arr,int capacity){
        Arrays.sort(arr,new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1,ItemValue item2){
                double cpr1=item1.profit/item1.weight;
                double cpr2=item2.profit/item2.weight;
                if(cpr2>cpr1) return 1;
                else return -1;
            }
            
        });
        double ans=0;
        for(ItemValue i:arr){
            double currweight=i.weight;
            double currprofit=i.profit;
            if(capacity-currweight>=0){
                ans+=currprofit;
                capacity-=currweight;
            }
            else{
                double fraction=capacity/currweight;
                capacity-=fraction*currweight;
                ans+=fraction*currprofit;
                break;
            }
        }
        return ans;


    }



    static class ItemValue{
        int profit,weight;
        public ItemValue(int profit,int weight){
            this.profit=profit;
            this.weight=weight;
        }
    }
    public static void main(String []args){
        ItemValue []arr={ new ItemValue(25, 5),
                        new ItemValue(75, 10),
                        new ItemValue(100, 12),
                        new ItemValue(50, 4),
                        new ItemValue(45, 7),
                        new ItemValue(90, 9),
                        new ItemValue(30, 3)        
        };
        System.out.println(getMaxValue(arr, 37));
    }
}
