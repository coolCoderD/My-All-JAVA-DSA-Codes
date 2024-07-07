#include <stdio.h>
#include <stdlib.h>
struct node *head=NULL;
struct node{
    int data;
    struct node* next;

};
//Create a node
struct node* create(int d){
    struct node* n;
    n=(struct node*)malloc(sizeof(struct node));
    n->data=d;
    n->next=NULL;
    return n;

}

void insertAtBeginning(int d){
    struct node* n;
    n=create(d);
    n->next=head;
    head=n;
    
}

void insertAtEnd(int d){
    struct node* n=create(d);
    if(head==NULL){
        head=n;
    }
    struct node* t=head;
    while(t->next!=NULL) t=t->next;
    t->next=n;
    return;

}

void insertAtIndex(int i,int d){
    struct node* n= create(d);
    if(i==0){
        n->next=head;
        head=n;
        return ;
    }
    struct node* ptr=head;
    while(i>1 && ptr->next!=NULL){
        ptr=ptr->next;
        i--;
    }
    n->next=ptr->next;
    ptr->next=n;
    return;
}

//Deletion of first node
void delFirst(){
    struct node *ptr=head;
    head=head->next;
    free(ptr);
}


void delIndex(int i){
    struct node* t=head;
    if(i==0 && t->next==NULL ){
        head=NULL;
        return;
    }
    if(i==0){
        head=t->next;
    }
    while(i>1 && t->next!=NULL){
        t=t->next;
        i--;
    }
    if(t==NULL || t->next==NULL) return;
    t->next=t->next->next;
    return;

}


void reverse(){
    struct node*curr=head;
    struct node*prev=NULL;
    struct node*nextptr=NULL;
    while(curr!=NULL){
        nextptr=curr->next;
        curr->next=prev;
        prev=curr;
        curr=nextptr;
    }
    head=prev;
    return;
}

void delLast(){
    struct node* t=head;
    while(t->next->next!=NULL) t=t->next;   
    t->next=NULL;
}


void delValue(int d){
    if(head==NULL) return;
    struct node*t=head;
    struct node*prev=NULL;
    while(head->data==d ){
        head=t->next;
        return;
    } 
    while(t->next!=NULL){
        if(t->data==d){
            prev->next=t->next;
        }
        prev=t;
        t=t->next;
    }
    if(t->data==d) prev->next=NULL;

    return;
}


//Traversal
void traversal(struct node* ptr){
    while(ptr!=NULL){
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
    printf("\n");
}


//Creation of circular LinkedList
void createCircualrLinkedList(){
    struct node* t=head;
    while(t->next!=NULL) t=t->next;
    t->next=head;
    printf("\nYour Linked List Is Now Circualr...\n");
}

void traversalCircularLinkedList(){
    struct node*t=head;
    do{
        printf("%d ",t->data);
        t=t->next;
    }
    while(t!=head);
    return;
}

//Insert in a circular linkedlist

//Beginning

void insertAtBegCircualr(int d){
    struct node* n=create(d);
    if(head==NULL){
        n->next=n;
        head=n;
        return;
    }
    struct node *p=head;
    while(p->next!=head) p=p->next;
    p->next=n;
    n->next=head;
    head=n;
    return;
}


//Last

void insertAtLastCirular(int d){
    struct node*n=create(d);
    if(head==NULL){
        n->next=n;
        head=n;
        return;
    }
    struct node*p=head;
    while(p->next!=head) p=p->next;
    p->next=n;
    n->next=head;
    return;
}

//Deletion


//First
void delFirstCircular(){
    if(head==NULL) return;
    struct node *p=head;
    struct node *ptr=head;
    while(p->next!=head) p=p->next;
    head=head->next;
    p->next=head;
    free(ptr);
}

//Last

void delLastCircualr(){
    if(head==NULL) return;
    struct node*p=head;
    while(p->next->next!=head) p=p->next;
    struct node*ptr=p->next;
    p->next=head;
    free(ptr);
    return;
}






// int main(){
//     struct node* first;
//     struct node * second;
//     struct node* third;
//     head=(struct node*)malloc(sizeof(struct node));
//     first=(struct node*)malloc(sizeof(struct node));
//     second=(struct node*)malloc(sizeof(struct node));
//     third=(struct node*)malloc(sizeof(struct node));
//     head->data=1;
//     head=create(1);
//     first=create(2);
//     second=create(3);
//     third=create(4);
//     head->next=first;
//     // first->data=2;
//     first->next=second;
//     // second->data=3;
//     second->next=third;
//     // third->data=4;
//     third->next=NULL;
//     insertAtBeginning(8);
//     insertAtBeginning(89);
//     insertAtEnd(100);
//     insertAtIndex(1,23);
//     traversal(head);
//     createCircualrLinkedList();
//     // traversalCircularLinkedList();
//     printf("\n");
//     insertAtBegCircualr(560);
//     insertAtBegCircualr(1);
//     insertAtLastCirular(56);
//     traversalCircularLinkedList();
//     printf("\n");
//     delFirstCircular();
//     traversalCircularLinkedList();
//     printf("\n");
//     delLastCircualr();
//     printf("\n");
//     traversalCircularLinkedList(head);
// }

// #include <stdio.h>
// #include <stdlib.h>
 
// struct Node
// {
//     int data;
//     struct Node *next;
// };
 
// void linkedListTraversal(struct Node *ptr)
// {
//     while (ptr != NULL)
//     {
//         printf("Element: %d\n", ptr->data);
//         ptr = ptr->next;
//     }
// }
 
// int main()
// {
//     struct Node *head;
//     struct Node *second;
//     struct Node *third;
//     struct Node *fourth;
 
//     // Allocate memory for nodes in the linked list in Heap
//     head = (struct Node *)malloc(sizeof(struct Node));
//     second = (struct Node *)malloc(sizeof(struct Node));
//     third = (struct Node *)malloc(sizeof(struct Node));
//     fourth = (struct Node *)malloc(sizeof(struct Node));
 
//     // Link first and second nodes
//     head->data = 7;
//     head->next = second;
 
//     // Link second and third nodes
//     second->data = 11;
//     second->next = third;
 
//     // Link third and fourth nodes
//     third->data = 41;
//     third->next = fourth;
 
//     // Terminate the list at the third node
//     fourth->data = 66;
//     fourth->next = NULL;
 
//     linkedListTraversal(head);
//     return 0;
// }


int main(){
    head=create(1);
    insertAtEnd(2);
    insertAtBeginning(8);
    insertAtIndex(1,6);
    insertAtBeginning(89);
    printf("\nLinked List\n");
    traversal(head);
    // delFirst();
    // printf("\nLinked list after deletion of first node: \n");
    // traversal(head);
    // printf("\nLinked list after deletion of last node: \n");
    // delLast();
    // traversal(head);
    // delIndex(3);
    // printf("\nLinked list after deletion of 4th position node: \n");
    // traversal(head);
    // printf("\n");
    reverse2(head);
}
