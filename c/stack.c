#include <stdio.h>
#define SIZE 6
int top=-1;
int Stack[SIZE];
void push(int ele){
    if(top==SIZE-1) printf("\nOVERFLOW");
    else{
        top+=1;
        Stack[top]=ele;
    }
}
int pop(){
    if(top==-1) {
        printf("\nUnderflow");
        return -1;
    }
    else{
        
        int ele = Stack[top];
        top--;
        return ele;

    }
    
}
void show(){
    if(top==-1 ) printf("\nUnderflow");
    else{
        for(int i=top;i>=0;i--) printf("%d ",Stack[i]);
    }
}
int main(){
    int n,ele,elePopped;
    while(1){
        printf("\n1-->Push");
        printf("\n2-->Pop");
        printf("\n3-->Show");
        printf("\n0-->Exit");
        printf("\nEnter you choice(1,2,3,0): ");
        scanf("%d",&n);
        if(n==0) break;
        else{
        switch(n){
            case(1):
                
                printf("\nEnter the element: ");
                scanf("%d",&ele);
                push(ele);
                break;
            
            case(2):
                elePopped=pop();
                if(top==-1) break;
                else{
                printf("\n%d is popped",elePopped);
                }
                break;
            
            case(3):
                show();
                break;
            
            default:
                printf("\nInvalid Choice! ");
        }
        }

    }
}


// #include<stdio.h>
// #include<stdlib.h>
 
// // void printk(int* arr3, int n3) {
// //  	for (int i = 0; i < n3; i++) {
// //  		printf("sorted array: %d\n", arr3[i]);
// // 	}
// // }
// // void sort(int* arr1,int* arr2,int n1,int n2){

// // int n3;
// // n3=n1+n2;
// // int* arr3=(int*)malloc(n3*sizeof(int));

// // int i1=0;
// // int i2=0;
// // int i3=0;

// //  while(i1 < n1 && i2 < n2 ){
// //  	if(arr1[i1]<arr2[i2]){
// //  	    arr3[i3++]=arr2[i2++];
// // 	 }
// // 	else {
// //         arr3[i3++]=arr1[i1++];
// // 	    } 
// //  } 	
       
// //        if(i1 < n1){
// //        	arr3[i3++]=arr1[i1++];
// // 	   }
// //       if(i2 < n2){
// //        	arr3[i3++]=arr2[i2++];
// // 	   }
// // 	   printk(arr3,n3);	
// //        free(arr3);
// //  }
 


// void mergeSort(int a[],int b[],int n,int m){
//     int res[n+m];
//     int i=0;
//     int j=0;
//     int k=0;
//     while(i<n && j<m){
//         if(a[i]<=b[j]) res[k++]=a[i++];
//         else res[k++]=b[j++];
//     }
//     while(i<n) res[k++]=a[i++];
//     while(j<m) res[k++]=b[j++];
//     for(int i=0;i<10;i++){
//         printf("%d ",res[i]);
//     }
// }
// int main(){
	
// 	int arr1[5]={1,2,3,4,5};
// 	int arr2[5]={6,7,8,9,10};
//     mergeSort(arr1,arr2,5,5);

	
	
// }


