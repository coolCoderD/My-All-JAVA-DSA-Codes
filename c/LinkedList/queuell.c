#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
};

struct node* f = NULL;
struct node* r = NULL;

struct node* create(int d) {
    struct node* n = (struct node*)malloc(sizeof(struct node));
    n->data = d;
    n->next = NULL;
    return n;
}

int isEmpty() {
    if (f == NULL)
        return 1;
    return 0;
}

int isFull() {
    struct node* n = (struct node*)malloc(sizeof(struct node));
    if (n == NULL)
        return 1;
    return 0;
}

void enqueue(int d) {
    if (isFull()) {
        printf("\nQueue is Full...");
        return;
    }
    struct node* n = create(d);
    if (isEmpty()) {
        f = r = n;
        return;
    }
    else {
        r->next = n;
        r = n;
        return;
    }
}

int dequeue() {
    if (isEmpty()) {
        printf("\nQueue is Empty...");
        return -1;
    }
    if (f == r) {
        int d = f->data;
        f = r = NULL;
        return d;
    }
    else {
        struct node* n = f;
        int d = n->data;
        f = f->next;
        free(n);
        return d;
    }
}

void traversal() {
    struct node* p = f;
    if (isEmpty()) {
        printf("\nUnderflow");
    }
    while (p != NULL) {
        printf("%d--", p->data);
        p = p->next;
    }
    printf("\n");
}

int main() {
    dequeue();
    enqueue(9);
    dequeue();
    dequeue();
    
    return 0;
}


