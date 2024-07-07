class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        // linkedlist is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    //  implementation of insertion of a node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // implementation of insertion of a node after any node
    public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The previous node cannot contain the null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }

    // implementation of deletion of a node in a linkedlist
    void deleteNode(int position){
        //linkedlist is empty
        if(head == null){
            return;
        }

        Node temp = head;
        // deletion is in the beginning of the node
        if(position == 0){
            head = temp.next;
            return;
        }

        // deletion is not in the beginning of the node
        for(int i=0; temp!=null && i< position-1; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }

        temp.next = temp.next.next;
    }

    // implementation of reversal of a linkedlist using an iterative approach
    public void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while(curr != null){
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        head = prev;
        return;
    }

    // implementation of reversal of a linked list using recursive approach
    public void reversalRec(Node curr, Node prev){
        // last node of a linked list
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        // recusive function call
        reversalRec(nextPtr, curr);
    }
    
    // implementation of finding of middle data in a linked list
    // what is the time and space complexity of below method
    // two pointer approach
    public void middleNode(){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle data of a given linked list is: "+slow.data);
    }

    // implementation of finding out the cycle in a linked list
    // floyd's cycle detection algorithm - interview based question
    // what is the time complexity and space complexity
    public void detectLoop(){
        Node slow=head, fast=head;
        int flag = 0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("No loop detected");
        }
        else{
            System.out.println("Loop is detected");
        }

    }


    // implementation of displaying the linkedlist
    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        

        System.out.println("Before insertion of 10, 1 and 19");
        //llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

    
        System.out.println("After insertion of 10, 1 and 19");
        //llist.displayLL();
        System.out.println();

       llist.insertAfter(llist.head.next.next.next, 13);
       llist.displayLL();
        System.out.println();

        /* 
        llist.deleteNode(0);
        System.out.println("Deletion of a node from a linkedlist");
        llist.displayLL();
        System.out.println();
        */

        //llist.reverseLL();
        //llist.reversalRec(llist.head, null);
    
        //System.out.println("Reversal of a Linked List is");
        //llist.displayLL();
        //llist.middleNode();

        // circular linked list
        
        Node temp = llist.head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = llist.head;
        
        llist.detectLoop();
        System.out.println();
    }
}