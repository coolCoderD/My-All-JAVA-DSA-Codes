#include<stdio.h>
#define MAX 100

int main(){
    // int n;
    // printf("Enter the size of the array: ");
    // scanf("%d",&n);
    // int a[n][n];
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         scanf("%d",&a[i][j]);
    //     }
    // }
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         printf("%d ",a[i][j]);
    //     }
    //     printf("\n");
    // }


   // Inserting an element in the array: 
    int n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int a[MAX];
    printf("Start entering the elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int ele,pos;
    printf("Enter the element to insert: ");
    scanf("%d",&ele);
    printf("\nEnter the position of the elemetn(0 based indexing): ");
    scanf("%d",&pos);
     // Shift the elements to the right from the position
    for(int i=n-1;i>=pos;i--) a[i+1]=a[i];
    a[pos]=ele;
    for(int i=0;i<=n;i++) printf("%d ",a[i]);



    //Delete the element for the array: 
    int n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int a[n];
    printf("Start entering the elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int ele,found=0;
    printf("Enter the element to be deleted: ");
    scanf("%d",&ele);
    for(int i=0;i<n;i++){
        if(a[i]==ele){
            found=1;
            for(int j=i;j<n-1;j++){
                a[j]=a[j+1];
            }
            n--;
            i--;
            
        }
    }
    if(found==1){
        for(int i=0;i<n;i++){
            printf("%d ",a[i]);
        }
    }
    else printf("Number is not present int the array");




}