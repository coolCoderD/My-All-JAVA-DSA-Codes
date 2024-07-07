#include<stdio.h>
#include<string.h>
int main(){
    char A[15];
    char B[10];
    printf("Start entering array A\n");
    for(int i=0;i<15;i++){
        printf("\nEnter the element: ");
        scanf("%c",&A[i]);
    }
    printf("Start entering array B\n");
    for(int i=0;i<10;i++){
        printf("\nEnter the element: ");
        scanf("%c",&B[i]);
    }
    printf("\n");
    int res[10];
        for(int k=0;k<10;k++){
        res[k]=0;
    }
    for(int i=0;i<15;i++){
        for(int j=0;j<10;j++){
            if(A[i]==B[j]){
                res[j]+=1;
            }
        }
    }
    int flag=1;
    for(int k=0;k<10;k++){
        if(res[k]==0){
            flag=0;
            break;
        }
    }
    if(flag==1){
        printf("True\n");
    }
    else{
        printf("False\n");
    }
}