import java.util.*;

class LinkedListmy {
    Node head;
    class Node{
        int data;
        Node next;
        Node (int d){
            data=d;
            next=null;
        }
    }
        //Inseration at the end
        void insertAtEnd(int newData){
            Node newNode=new Node(newData);


            if(head==null){
                head=newNode;
                return ;
            }
            // newNode.next=null;
            Node temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=newNode;
            return;
        }


        //Insert at the beginning
        void insertAtBeginning(int d){
            Node newNode=new Node(d);
            newNode.next=head;
            head=newNode;
        }


        //Insert at any given node
        void insertAtAnyNode(Node prev_node,int d){
            if(prev_node==null){
                System.out.println("Previous node cannot be empty");
                return;
            }
            Node newNode=new Node( d);
            newNode.next=prev_node.next;
            prev_node.next=newNode;
        }


        //Deletion of a node
        void DeleteNode(int pos){

            if(head==null) return;
            Node temp=head;
            if(pos==0){
                head=temp.next;
                return;
            }
            for(int i=0;temp!=null && i<pos-1;i++){
                temp=temp.next;
            }
            if(temp==null && temp.next==null) return;

            temp.next=temp.next.next;

        }

        //Reversal of linked list iterative
        void LinlkedListReversalIterative(){
            Node curr=head;
            Node prev=null;
            Node nextptr=null;
            while(curr!=null){
                nextptr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextptr;
            }
            head=prev;
            return ;
        }

        //Reversal by recurrsion
        void ReversalRecc(Node curr,Node prev){
            if(curr.next==null){
                head=curr;
                curr.next=prev;
                return;
            }
            Node nextptr=curr.next;
            curr.next=prev;
            ReversalRecc(nextptr,curr);
        }


        //Middle of the linked list
        void MiddleOfTheLinkedList(){
            Node fast=head,slow=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println();
            System.out.println(slow.data);
        }


        //Dectection of loop in the linked list
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
    
        void createLoop() {
            if (head == null) {
                return;
            }
            
            // Find the last node
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            
            // Make the last node point to a specific node in the list to create a loop
            lastNode.next = head.next;
        }
    void display(){
        Node  curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }


    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        // LinkedListmy ll=new LinkedListmy();
        // int choice=1;
        // while(choice!=0){
        //     System.out.println("1-->To Enter More Data \n0-->To Quit");
        //     System.out.print("\nEnter your choice: ");
        //     choice=sc.nextInt();
        //     System.out.println("*************************************");

        //     if(choice==1){
        //         System.out.print("Enter the data: ");
        //         int d=sc.nextInt();
        //         ll.insertAtEnd(d);
        //     }
        //     else break;
        // }

        LinkedListmy ll = new LinkedListmy();
        ll.insertAtEnd(89);
        ll.insertAtEnd(78);
        ll.insertAtEnd(12);
        ll.insertAtEnd(67);
        ll.insertAtBeginning(2);
        ll.insertAtAnyNode(ll.head.next.next.next,34);;
        Node temp = ll.head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = ll.head;

        ll.detectLoop();

        
    }
}
