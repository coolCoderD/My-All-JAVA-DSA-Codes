#include <stdio.h>
#include<stdlib.h>


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

void inorder(struct node *p){
    if(p==NULL) return;
    inorder(p->left);
    printf("%d ",p->data);
    inorder(p->right);
}

struct node * search(struct node *root,int d){
    if(root==NULL) return NULL;
    if(root->data==d) return root;
    else if(root->data>d) return search(root->left,d);
    return search(root->right,d);
}


struct node* insert(struct node *root,int d){
    if(root==NULL) {
        root=createNode(d);
        return root;
    }
    else if(root->data < d){
        root->right=insert(root->right,d);
    }
    else root->left=insert(root->left,d);
    return root;
}




//Deletion of Nodes in BST
struct node * inorderPredecessor(struct node* root){
    root=root->left;
    while(root->right!=NULL){
        root=root->right;
    }
    return root;
}


struct node* Del(struct node* root,int d){
    struct node* ipre;
    if(root==NULL) return NULL;
    if(root->left==NULL && root->right==NULL){
        free(root);
        return NULL;
    }

    if(d>root->data){
        root->right=Del(root->right,d);
    }
    else if(d<root->data){
        root->left=Del(root->left,d);
    }
    else{
        ipre=inorderPredecessor(root);
        root->data=ipre->data;
        root->left=Del(root->left,ipre->data);
    }
    return root;
}
int max(int a,int b){
    if(a>b) return a;
    return b;
}


//Minimum Value
int min(struct node* root){
    if(root==NULL) return -1;
    if(root->left==NULL) return root->data;
    return min(root->left);
}


int minitr(struct node*n){
    if(n==NULL) return -1;
    while(n->left!=NULL){
        n=n->left;
    }
    return n->data;
}

int height(struct node* root){
    if(root==NULL) return 0;
    return 1+max(height(root->left),height(root->right));
}

int count=0;
void noOfNodes(struct node *root){
    if(root==NULL) return;
    count++;
    noOfNodes(root->left);
    noOfNodes(root->right);
}

int countleaves(struct node*root){
    if(root==NULL) return 0;
    if(root->left==NULL && root->right==NULL) return 1;
    return countleaves(root->left)+countleaves(root->right);
}



int symmetricTreeOrNOt(struct node *l,struct node *r){
    if(l==NULL && r==NULL) return 1;
    if(l==NULL || r==NULL) return 0;
    if(l->data!=r->data) return 0;
    return symmetricTreeOrNOt(l->left,r->right)==symmetricTreeOrNOt(l->right,r->left);
}






int main(){
    struct node *root;
    struct node* l;
    struct node* r;
    root = createNode(11);
    root->left = createNode(6);
    root->right = createNode(19);
    root->left->left = createNode(4);
    root->left->right = createNode(8);
    root->right->left = createNode(17);
    root->right->right = createNode(43);
    inorder(root);
    printf("\n");
    // struct node*n=Del(root,19);
    // if(n!=NULL){
    //     printf("%d\n",n->data);
    // }
    // else printf("NOT Inserted\n....");
    inorder(root);
    // printf("\n%d",min(root));
    // printf("\n%d",height(root));
    // height(root);

    printf("\n%d",minitr(root));


}






