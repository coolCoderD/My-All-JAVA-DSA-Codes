#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
struct node*top=NULL;


struct node*create(int d){
    struct node*n;
    n=(struct node*)malloc(sizeof(struct node));
    n->data=d;
    n->next=NULL;
    return n;
}

int isFull(){
    struct node*n=(struct node*)malloc(sizeof(struct node));
    if(n==NULL) {
        return 1;
    }
    return 0;
}

int isEmpty(){
    if(top==NULL){;
        return 1;
    }
    return 0;
}

void push(int d){
    if(isFull()) {
        printf("\nStack Overflow");
        return;
    }
    struct node*n=create(d);
    n->next=top;
    top=n;
}

int pop(){
    if(isEmpty()){
        printf("\nStack Underflow");
        return -1;
    }
    struct node*p=top;
    top=top->next;
    int d=p->data;
    free(p);
    return d;
}

void traversal(){
    struct node*p=top;
    if(isEmpty()) {
        printf("\nUnderflow");
    }
    while(p!=NULL){
        printf("%d--",p->data);
        p=p->next;
    }
    printf("\n");
}


int main(){
    // top=create(1);
    push(2);
    push(7);
    // traversal();
    // pop();
    // pop();
    // pop();
    // pop();
    traversal();
    
}

