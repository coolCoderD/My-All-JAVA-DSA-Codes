import java.util.ArrayList;

import javax.xml.transform.Source;

class LL{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void inserting(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
        return;
    }
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class Assignment extends LL{

    static boolean Que1_searching(int d){
        Node temp=head;
        while(temp!=null){
            if(temp.data==d) return true;
            temp=temp.next;
        }
        return false;
    }


    static void Que2_insertAtGivenPos(int pos,int d){
        if(pos==0) return ;
        else if(pos==1){
            Node newNode=new Node(d);
            newNode.next=head;
            head=newNode;
            return;
        }
        else{
            Node newNode=new Node(d);
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            if(temp==null) return;
            newNode.next=temp.next;
            temp.next=newNode;

        }
    
    }

    static Node Que3_RemoveDuplicate(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
            curr=curr.next;
            }
        }
        return head;
    }

    static boolean Que4_Pallindrome(Node head){
        ArrayList<Integer> al=new ArrayList<>();
        Node temp=head;
        while(temp!=null) {
            al.add(temp.data);
            temp=temp.next;
        int i=0;
        int j=al.size()-1;
        while(j>i) {
            if(al.get(i)!=al.get(j)) return false;
            i++;
            j--;
        }
        
    }
    return true;
}


    static Node Que5_add(Node h1,Node h2){
        Node head=new Node(0);
        Node d=head;
        int carry=0;
        while(h1!=null || h2!=null || carry!=0){
            int sum=0;
            if(h1!=null){
                sum+=h1.data;
                h1=h1.next;
            }
            if(h2!=null){
                sum+=h2.data;
                h2=h2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node n=new Node(sum%10);
            d.next=n;
            d=d.next;
        }
        return head.next;
    }
    public static void main(String []args){
        LL ll=new LL();
        ll.inserting(1);
        ll.inserting(1);
        ll.inserting(1);
        ll.inserting(1);
        ll.inserting(1);
        System.out.println("Linked List is: ");
        ll.Display();
        System.out.println();
        Que3_RemoveDuplicate(head);
        ll.Display();
    }
}

