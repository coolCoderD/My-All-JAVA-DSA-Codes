import java.util.*;

public class asg {
    public static void SwapEleAndSort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i]){
                int t=a[i];
                a[i]=a[i-1];
                a[i-1]=t;
                break;
            }
        }
    }

    static void separateNegAndPos(int a[]){
        int n=a.length;
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[j]<0){
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
                i++;
            }
        }
        
    }

    // static void sepPosAndNegSameRelativeOrder(int a[],int l,int h){
    //     if(l<h){
    //         int m=l+(h-l)/2;
    //         sepPosAndNegSameRelativeOrder(a, l, m);
    //         sepPosAndNegSameRelativeOrder(a, m+1, h);
    //         mergePro(a,l,m,h);
    //     }
    // }
    // static void mergePro(int a[],int l,int m,int h){
    //         int n1=m-l+1;
    //         int n2=h-m;
    //         int i=0,j=0,k=l;
    //         int []left=new int[n1];
    //         int right[]=new int[n2];
    //         for(i=0;i<n1;i++){
    //             left[i]=a[l+i];
    //         }
    //         for(j=0;j<n2;j++){
    //             right[j]=a[m+1+j];
    //         }
    //         i=j=0;

    // }


    static boolean isPossible(Integer a[], int b[], int n, int k){
    	// Sort the array a[] in decreasing order.
    	Arrays.sort(a, Collections.reverseOrder());
    
    	// Sort the array b[] in increasing order.
    	Arrays.sort(b);
    
    	// Checking condition on each index.
    	for (int i = 0; i < n; i++)
    	if (a[i] + b[i] < k)
    		return false;   
    
    	return true;
    }
    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++) a[i]=sc.nextInt();
        // int a[]={ 9, 20, -7, -4, 13, -11, -15, 3 };
        // System.out.println(Arrays.toString(a));
        // sepPosAndNegSameRelativeOrder(a, 0, a.length-1);
        // System.out.println(Arrays.toString(a));
        Integer a[]={1,2,2,1};
        int b[]={3,3,3,4};
        boolean ans=isPossible(a, b, a.length, 5);
        System.out.println(ans);
    }
    //
}
