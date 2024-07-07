#include<stdio.h>
#include<stdlib.h>



int partition(int a[],int l,int h){
    int i=l;
    int j=l;
    for(int j=l+1;j<=h;j++){
        if(a[j]<a[l]){
            i++;
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
    int t=a[i];
    a[i]=a[l];
    a[l]=t;
    return i;
}

void QuickSort(int a[],int l,int h){
    if(h>l){
        int m=partition(a,l,h);
        QuickSort(a,l,m-1);
        QuickSort(a,m+1,h);
    }
    return;
}


void mergeProcedure(int a[],int l,int m,int h){
    int n1=m-l+1;
    int n2=h-m;
    int x[n1];
    int y[n2];
    int i=0;
    int j=0;
    int k=l;
    for(i=0;i<n1;i++){
        x[i]=a[l+i];
    }
    for(j=0;j<n2;j++) y[j]=a[m+1+j];
    i=0;
    j=0;
    while(i<n1 && j<n2){
        if(x[i]<y[j]){
            a[k++]=x[i++];
        }
        else a[k++]=y[j++];
    }
    while(i<n1) a[k++]=x[i++];
    while(j<n2) a[k++]=y[j++];
}

void mergeSort(int a[],int l,int h){
    if(h>l){
        int m=l+(h-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        mergeProcedure(a,l,m,h);
    }
}



//Selection Sort

void SelectionSort(int a[],int n){
    int min;
    for(int i=0;i<n;i++){
        min=i;
        for(int j=i+1;j<n;j++){
            if(a[min]>a[j]){
                min=j;
            }
        }
        if(min!=i){
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
    }
}


//Inseration
void insertionSort(int a[],int n){
    for(int i=0;i<n;i++){
        int j=i+1;
        while(j>0 && a[j-1]>a[j]){
            int t=a[j];
            a[j]=a[j-1];
            a[j-1]=t;
            j--;
        }
    }
}




int main(){
    int a[]={7,6,85,94,1,2,1};
    insertionSort(a,7);
    for(int i=0;i<=6;i++) printf("%d ",a[i]);
    return 0;
}