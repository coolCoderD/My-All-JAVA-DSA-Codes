#include<stdio.h>
#include<stdlib.h>

struct node{
    int coeff;
    int deg;
    struct node*next;
};

struct node* create(int d,int deg){
    struct node*n;
    n=(struct node*)malloc(sizeof(struct node));
    n->coeff=d;
    n->deg=deg;
    n->next=NULL;
    return n;

}

struct node* insertAtEnd(struct node*head,int coeff,int deg){
    struct node*n=create(coeff,deg);
    if(head==NULL){
        head=n;
        return head;
    }
    struct node*t=head;
    while(t->next!=NULL){
        t=t->next;
    }
    t->next=n;
    return head;
}


struct node* additionOfPoly(struct node*h1,struct node*h2){
    struct node*head=NULL;
    while(h1!=NULL && h2!=NULL){
        if(h1->deg==h2->deg){
            head=insertAtEnd(head,h1->coeff+h2->coeff,h1->deg);
            h1=h1->next;
            h2=h2->next;
        }
        else if(h1->deg>h2->deg){
            head=insertAtEnd(head,h1->coeff,h1->deg);
            h1=h1->next;
        }
        else {
            head=insertAtEnd(head,h2->coeff,h2->deg);
            h2=h2->next;
        }
    }
    while(h1!=NULL) {
        head=insertAtEnd(head,h1->coeff,h1->deg);
        h1=h1->next;
    }
    while(h2!=NULL){
        head=insertAtEnd(head,h2->coeff,h2->deg);
        h2=h2->next;
    }
    return head;
    
}



void traversal(struct node*head){
    while(head!=NULL){
        printf("%dx^%d  ",head->coeff,head->deg);
        head=head->next;
    }
    printf("\n");
}

int main(){
    struct node*h1=NULL;
    struct node*h2=NULL;
    h1=insertAtEnd(h1,5,5);
    h1=insertAtEnd(h1,3,2);
    h1=insertAtEnd(h1,1,0);
    h2=insertAtEnd(h2,4,4);
    h2=insertAtEnd(h2,2,2);
    h2=insertAtEnd(h2,1,1);
    traversal(h1);
    traversal(h2);
    struct node* head=additionOfPoly(h1,h2);
    traversal(head);


    

}
