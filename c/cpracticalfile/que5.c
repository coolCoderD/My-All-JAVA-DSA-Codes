#include<stdio.h>
int main(){
    int n;
    printf("Enter the size of first array: ");
    scanf("%d",&n);
    int a[n];
    printf("\nStart entering the elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int m;
    printf("\nEnter the size of second array: ");
    scanf("%d",&m);
    int b[m];
    printf("\nStart entering the elements: ");
    for(int i=0;i<m;i++){
        scanf("%d",&b[i]);
    }
    int ans[m+n];
    int i=0,j=0,k=0;
    while(i<n && j<m){
        if(a[i]>b[j]){
            ans[k++]=b[j++];
        }
        else {
            ans[k++]=a[i++];
        }
    }
    while (i<n)
    {
        ans[k++]=a[i++];
    }
    while(j<m){
        ans[k++]=b[j++];
    }
    for(int h=0;h<m+n;h++){
        printf("%d ",ans[h]);
    }
    

    
}