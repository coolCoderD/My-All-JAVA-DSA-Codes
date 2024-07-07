#include<stdio.h>
int q1[50];
int q2[50];
int s[50];
int top=-1;
int f1=-1;
int r1=-1;
int f2=-1;
int r2=-1;


void enqueu1(int d){
    if(f1==49)  {
        printf("\nStack is Full");
        return;
    }
    if(f1==-1 && r1==-1){
        f1=r1=0;
        q1[r1]=d;
        return;
    }
    else {
        q1[r1++]=d;
        return;
    }
}
void enqueu2(int d){
    if(f2==49)  {
        printf("\nStack is Full");
        return;
    }
    if(f2==-1 && r2==-1){
        f2=r2=0;
        q2[r2]=d;
        return;
    }
    else {
        q1[r2++]=d;
        return;
    }
}


int deque1(){
    if(f1==-1 && r1==-1){
        printf("Stack is empty");
        return -1;
    }
    if(f1==r1){
        int d=q1[f1];
        f1=r1=-1;
        return d;
    }
    else{
        return q1[f1++];
    }
}

int deque1(){
    if(f2==-1 && r2==-1){
        printf("Stack is empty");
        return -1;
    }
    if(f2==r2){
        int d=q2[f2];
        f2=r2=-1;
        return d;
    }
    else{
        return q2[f2++];
    }
}

void push(int d){
    if(f1==49){
        printf("Stack is full");
        return;
    }
    if(f1==-1) {
        enqueu1(d);
    }
    else{
        
    }
}