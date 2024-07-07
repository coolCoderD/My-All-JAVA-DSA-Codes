#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
struct node* adj[10];

void createAnEmptyGraph(){
    for(int i=1;i<=9;i++){
        adj[i]=NULL;
    }
}

struct node* createNode(int d){
    struct node*n;
    n=(struct node*)malloc(sizeof(struct node));
    n->data=d;
    n->next=NULL;
    return n;
}

void enteringData(){
    struct node*ptr;
    struct node* last;
    int n,d;
    for(int i=1;i<=4;i++){
        printf("\nEnter the number nodes in the list in %d: ",i);
        scanf("%d",&n);
        last=NULL;
        for(int j=1;j<=n;j++){
            printf("\nEnter the value of the node %d : ",j);
            scanf("%d",&d);
            ptr=createNode(d);
            if(adj[i]==NULL){
                adj[i]=last=ptr;
            }
            else{
                last->next=ptr;
                last=ptr;
            }

        }

    }
}

void traversalOfGraph(){
    struct node*ptr;
    for(int i=1;i<=4;i++){
        ptr=adj[i];
        printf("\n%d-> ",i);
        while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr=ptr->next;
        }
        printf("\n");
    }
}


void delTheGraph(){
    struct node*ptr,*temp;
    for(int i=1;i<=4;i++){
        ptr=adj[i];
        while(ptr!=NULL){
            temp=ptr;
            ptr=ptr->next;
            free(temp);
        }
        adj[i]=NULL;
    }
    printf("\nGraph is Deleted....");
}
int main(){
    createAnEmptyGraph();
    enteringData();
    traversalOfGraph();
    return 0;
}
