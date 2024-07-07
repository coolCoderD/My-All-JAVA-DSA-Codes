// #include <stdio.h>
// int main(){
//     int n;
//     scanf("%d",&n);
//     int a[n];
//     for(int i=0;i<n;i++){
//         scanf("%d",&a[i]);
//     }
//     int mean=0,median=0,sum=0;
//     for(int i=0;i<n;i++) sum+=a[i];
//     printf("Mean of this array is %d",sum/n);
//     if(n%2!=0){
//         median=a[(n-1)/2];
//     }
//     else{
//         int b=(n-1)/2;
//         int c=b+1;
//         median=(a[b]+a[c])/2;
//     }
//     printf("\nMedian of this array is %d ",median);

// }
#include <stdio.h>
#include <stdlib.h>
#define MAX_VERTICES 100
#define QUEUE_SIZE 100
// Structure for a graph
struct Graph {
    int numVertices;
    int adjacencyMatrix[MAX_VERTICES][MAX_VERTICES];
};
// Structure for a queue
struct Queue {
    int items[QUEUE_SIZE];
    int front;
    int rear;
};
// Function to create a graph with a given number of vertices
struct Graph* createGraph(int numVertices) {
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
    if (graph == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    graph->numVertices = numVertices;
    int i, j;
    for (i = 0; i < numVertices; i++) {
        for (j = 0; j < numVertices; j++) {
            graph->adjacencyMatrix[i][j] = 0;
        }
    }
    return graph;
}
// Function to add an edge to the graph
void addEdge(struct Graph* graph, int src, int dest) {
    if (src >= 0 && src < graph->numVertices && dest >= 0 && dest < graph->numVertices) {
        graph->adjacencyMatrix[src][dest] = 1;
        graph->adjacencyMatrix[dest][src] = 1; // Uncomment for an undirected graph
    } else {
        printf("Invalid vertices!\n");
    }
}
// Function to initialize a queue
struct Queue* createQueue() {
    struct Queue* queue = (struct Queue*)malloc(sizeof(struct Queue));
    if (queue == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    queue->front = -1;
    queue->rear = -1;
    return queue;
}
// Function to check if the queue is empty
int isEmpty(struct Queue* queue) {
    return queue->front == -1;
}
// Function to check if the queue is full
int isFull(struct Queue* queue) {
    return queue->rear == QUEUE_SIZE - 1;
}
// Function to add an element to the queue
void enqueue(struct Queue* queue, int item) {
    if (isFull(queue)) {
        printf("Queue is full!\n");
    } else {
        if (queue->front == -1)
            queue->front = 0;
        queue->rear++;
        queue->items[queue->rear] = item;
    }
}
// Function to remove an element from the queue
int dequeue(struct Queue* queue) {
    int item;
    if (isEmpty(queue)) {
        printf("Queue is empty!\n");
        item = -1;
    } else {
        item = queue->items[queue->front];
        queue->front++;
        if (queue->front > queue->rear) {
            queue->front = -1;
            queue->rear = -1;
        }
    }
    return item;
}
// Function to calculate the distance between two vertices in a graph using BFS
int calculateDistance(struct Graph* graph, int startVertex, int endVertex) {
    struct Queue* queue = createQueue();
    int visited[MAX_VERTICES] = {0};
    int distance[MAX_VERTICES] = {0};
    visited[startVertex] = 1;
    enqueue(queue, startVertex);
    while (!isEmpty(queue)) {
        int currentVertex = dequeue(queue);
        for (int i = 0; i < graph->numVertices; i++) {
            if (graph->adjacencyMatrix[currentVertex][i] && !visited[i]) {
                visited[i] = 1;
                distance[i] = distance[currentVertex] + 1;
                enqueue(queue, i);
            }
        }
    }
    return distance[endVertex];
}
int main() {
    int numVertices, numEdges, i, src, dest;
    int startVertex, endVertex;
   printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);
    struct Graph* graph = createGraph(numVertices);
    printf("Enter the number of edges: ");
    scanf("%d", &numEdges);
    for (i = 0; i < numEdges; i++) {
        printf("Enter edge %d (source destination): ", i + 1);
        scanf("%d %d", &src, &dest);
        addEdge(graph, src, dest);
    }
    printf("Enter the start vertex: ");
    scanf("%d", &startVertex);
    printf("Enter the end vertex: ");
    scanf("%d", &endVertex);
    int distance = calculateDistance(graph, startVertex, endVertex);
    printf("The distance between vertex %d and vertex %d is %d.\n", startVertex, endVertex, distance);
    return 0;
}

