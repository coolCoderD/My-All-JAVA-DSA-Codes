#include<stdio.h>
#include<stdlib.h>
struct node*head;
struct node{
    int data;
    struct node*prev;
    struct node*next;
};

struct node*create(int d){
    struct node *n;
    n=(struct node*)malloc(sizeof(struct node));
    n->data=d;
    n->prev=NULL;
    n->next=NULL;
    return n;
}




//Insertion
void insertBeg(int d){
    struct node*n=create(d);
    if(head==NULL){
        head=n;
        return;
    }
    n->next=head;
    head->prev=n;
    head=n;
}

void insertEnd(int d){
    struct node *n=create(d);
    if(head==NULL){
        head=n;
        return;
    }
    struct node*p=head;
    while(p->next!=NULL){
        p=p->next;
    }
    p->next=n;
    n->prev=p;
    return;
}


void delLast(){
    struct node*h=head;
    if(h==NULL) return;
    else if(h->next==NULL){
        free(h);
        h=NULL;
        return;
    }

    while(h->next->next!=NULL){
        h=h->next;
    }
    struct node* p=h->next;
    h->next=NULL;
    free(p);
}


void display(){
    struct node *p=head;
    while(p!=NULL){
        printf("%d  ",p->data);
        p=p->next;
    }
    printf("\n");
    return;
}
void reverse(){
    struct node*curr=head;
    struct node*temp=NULL;
    while(curr!=NULL){
        temp=curr->prev;
        curr->prev=curr->next;
        curr->next=temp;
        curr=curr->prev;
    }
    if(temp!=NULL) head=temp->prev;
    printf("\n");
    return;
}

int main(){
    head=create(1);
    display();
    insertBeg(6);
    display();
    insertEnd(8);
    insertBeg(90);
    insertEnd(89);
    display();
    reverse();
    display();
    delLast();
    display();
    
}