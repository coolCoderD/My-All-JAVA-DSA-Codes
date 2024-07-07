#include <Stdio.h>
#define n 5
int s1[n];
int s2[n];
int top1=-1,top2=-1;
int count=0;
void push1(int d){
    if(top1==n-1) printf("Queue is full..");
    else s1[++top1]=d;
}
void push2(int d){
    if(top2==n-1) printf("Queue is full..");
    else s2[++top2]=d;
}

int pop1(){
    return s1[top1--];
}
int pop2(){
    return s2[top2--];
}

void enqueue(int d){
    push1(d);
    count++;
    
}

void  dequeue(){
    int b,a;
    if(top1==-1||top2==-1){
        printf("\nQueue is empty..");
    }
    else{
        for(int i=0;i<count;i++){
            a=pop1();
            push2(a);
        }
        b=pop2();
        count--;
        printf("Dequeued element is: %d",b);
        for(int i=0;i<count;i++){
            a=pop2();
            push1(a);
        }
    }
}

void display(){
    printf("\nQueue is:");
    for(int i=0;i<count;i++){
        printf("%d ",s1[i]);
    }
}


int main(){
    enqueue(34);
	enqueue(134);
	enqueue(4);
	enqueue(334);
	display();
	dequeue();
	display();
	enqueue(90);
	display();	
}

