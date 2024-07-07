#include <stdio.h>
#define n 5
int q[n];
int front=-1,rear=-1;
void enqueue(int x){
    if(front==-1 && rear==-1) {
        front=rear=0;
        q[rear]=x;
    }
    else if (front==(rear+1)%n) {
        printf("\nQueue is full...");
    }
    else {
        rear=(rear+1)%n;
        q[rear]=x;
    }
}

void dequeue(){
    if(front==-1 && rear==-1 ) printf("\nQueue is empty..");
    else if(front==rear) {
        printf("\nDequeued element is: %d",q[front]);
        front=rear=-1;
    }
    else{
        printf("%d",q[front]);
        front=(front+1)%n;
    }
}

void display(){
    int i=front;
    if(front ==-1 && rear==-1) printf("\nQueue is empty: ");
    else{
        printf("\nQueue is: ");
        while(i!=rear){
            printf("%d ",q[i]);
            i=(i+1)%n;
        }
        printf(" %d ",q[i]);
    }
}

int main()
{
	enqueue(5);
	enqueue(10);
	enqueue(15);
	enqueue(20);
	display();
	dequeue();
	display();

	
	
}


