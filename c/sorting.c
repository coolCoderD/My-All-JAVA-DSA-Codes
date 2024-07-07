#include <stdio.h>

void BubbleSorting(int a[],int n){
    int i,j,t;
    for(  i=0;i<n-1;i++){
        int f=0;
        for( j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                f=1;
            }
        }
        if(f==0) break;
    }
}
void InserationSorting(int a[],int n){
    int i,j,t;
    for(i=1;i<n;i++){
        j=i;
        while(j>0 && a[j-1]>a[j]){
            t=a[j-1];
            a[j-1]=a[j];
            a[j]=t;
            j--;
        }
    }
}


void SelectionSort(int a[],int n){
    for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(a[j]<a[min]) min=j;
        }
        if(min!=i){
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
    }
}
int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int a[n];
    printf("Start entering the elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    InserationSorting(a,n);
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;

}