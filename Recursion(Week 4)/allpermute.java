import java.util.*;
public class allpermute {

    static String swap(String str,int i,int j){
        char temp;
        char[]chararray=str.toCharArray();
        temp=chararray[i];
        chararray[i]=chararray[j];
        chararray[j]=temp;
        return String.valueOf(chararray); 
    }


    public static void permute(String str,int l,int r){
        if(l==r) System.out.println(str);
        else{
            for(int i=l;i<=r;i++){
                str=swap(str,l,i);
                permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        permute(str,0,str.length()-1);

    }
}
