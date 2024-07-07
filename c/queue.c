#include <stdio.h>

#define MAX_SIZE 100

int queue[MAX_SIZE];
int front = -1;
int rear = -1;

int is_empty() {
    return (front == -1 && rear == -1);
}

int is_full() {
    return rear == MAX_SIZE - 1;
}

void enqueue(int item) {
    if (is_full()) {
        printf("Queue is full.\n");
        return;
    }
    
    if (is_empty()) {
        front = 0;
    }
    
    queue[++rear] = item;
    printf("Enqueued: %d\n", item);
}

void dequeue() {
    if (is_empty()) {
        printf("Queue is empty.\n");
        return;
    }
    
    int item = queue[front];
    
    if (front == rear) {
        front = -1;
        rear = -1;
    } else {
        front++;
    }
    
    printf("Dequeued: %d\n", item);
}

void display() {
    if (is_empty()) {
        printf("Queue is empty.\n");
        return;
    }
    
    printf("Queue: ");
    for (int i = front; i <= rear; i++) {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    dequeue();
    display();
    
    return 0;
}