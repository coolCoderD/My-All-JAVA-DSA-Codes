#include <stdio.h>
#include<stdlib.h>
struct node *root=NULL;

struct node{
    int data;
    struct node* left;
    struct node* right;
};

struct node* createNode(int d){
    struct node* n;
    n=(struct node*)malloc(sizeof(struct node));
    n->data=d;
    n->left=NULL;
    n->right=NULL;
    return n;
    
}

void preorder(struct node *p){
    if(p==NULL) return;
    printf("%d ",p->data);
    preorder(p->left);
    preorder(p->right);
    
}

void inorder(struct node *p){
    if(p==NULL) return;
    inorder(p->left);
    printf("%d ",p->data);
    inorder(p->right);
}

void postorder(struct node*p){
    if(p==NULL) return;
    postorder(p->left);
    postorder(p->right);
    printf("%d ",p->data);
}


int  isBST(struct node*p){
    if(p==NULL) return 1;
    if(p->left!=NULL && p->right!=NULL && p->data<=p->left->data && p->data>=p->right->data){
        return 0;
    }
    if(p->left!=NULL && p->data<=p->left->data) return 0;
    if(p->right!=NULL && p->data>=p->right->data) return 0;
    return isBST(p->left)==isBST(p->right);
}


int  searchinBST(struct node *ptr,int k){
    if(ptr==NULL) return 0;
    if(k==ptr->data) return 1;
    else if(k>ptr->data) return searchinBST(ptr->right,k);
    return searchinBST(ptr->left,k); 
}


int searchItr(struct node *p,int k){
    while(p!=NULL){
        if(p->data==k) return 1;
        else if(p->data>k) p=p->left;
        else p=p->right;
    }
    return 0;
}


//Insert in a binary Tree

// struct node* insert(int d){
//     if(root==NULL){
//         return createNode(d);
//     }
//     if(root->data==d) return;
//     else if(root->data>d){
//         root->left=insert(d);
//     }
//     else root->right=insert(d);
// }




int main(){
    struct node *root;
    struct node* l;
    struct node* r;
    root = createNode(1);
    root->left = createNode(1);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->left->right = createNode(5);
    root->right->left = createNode(6);
    root->right->right = createNode(7);
    printf("\nInorder: ");
    inorder(root);
    printf("\nPreorder: ");
    preorder(root);
    printf("\nPostorder: ");
    postorder(root);

}