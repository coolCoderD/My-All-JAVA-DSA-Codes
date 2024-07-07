class Pair{
        int min;
        int max;
    public  Pair findMinMax(int a[],int i,int j){
        Pair minmax=new Pair();
        Pair minmaxL=new Pair();
        Pair minmaxR=new Pair();
        if(i==j){
            minmax.min=a[i];
            minmax.max=a[i];
            return minmax;
        }
        if(j-i+1==2){
            if(a[i]<a[j]){
                minmax.min=a[i];
                minmax.max=a[j];
            }
            else{
                minmax.min=a[j];
                minmax.max=a[i];
            }
            return minmax;
        }
        int m=i+(j-i)/2;
        minmaxL=findMinMax(a, i, m);
        minmaxR=findMinMax(a, m+1, j);
        if(minmaxL.min<minmaxR.min){
            minmax.min=minmaxL.min;
        }
        else{
            minmax.min=minmaxR.min;
        }
        if(minmaxL.max<minmaxR.max){
            minmax.max=minmaxR.max;
        }
        else{
            minmax.max=minmaxL.max;
        }
        return minmax;
    }
}


public class minmax {
    public static void main(String[]args){
        Pair m=new Pair();
        int a[]={1,2,100,90,0,87,34,21};
        Pair mm=m.findMinMax(a, 0, a.length-1);
        System.out.println(mm.max);
        System.out.println(mm.min);
    }
    
}
