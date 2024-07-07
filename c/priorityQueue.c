#include <stdio.h>

#define MAX_SIZE 100

int values[MAX_SIZE];
int priorities[MAX_SIZE];
int size = 0;

void enqueue(int value, int priority) {
    if (size >= MAX_SIZE) {
        printf("Priority queue is full. Cannot enqueue.\n");
        return;
    }
    
    if (size == 0) {
        values[0] = value;
        priorities[0] = priority;
        size++;
        return;
    }
    
    int i = size - 1;
    while (i >= 0 && priorities[i] < priority) {
        values[i + 1] = values[i];
        priorities[i + 1] = priorities[i];
        i--;
    }
    
    values[i + 1] = value;
    priorities[i + 1] = priority;
    size++;
}

int dequeue() {
    if (size <= 0) {
        printf("Priority queue is empty. Cannot dequeue.\n");
        return -1;
    }
    
    int value = values[size-1];

    size--;
    
    return value;
}

int main() {
    enqueue(10, 2);
    enqueue(20, 1);
    enqueue(30, 3);
    
    printf("Dequeued element: %d\n", dequeue());
    printf("Dequeued element: %d\n", dequeue());
    printf("Dequeued element: %d\n", dequeue());
    printf("Dequeued element: %d\n", dequeue());
    
    return 0;
}







