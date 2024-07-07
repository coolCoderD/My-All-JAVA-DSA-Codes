// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Stack;

// public class previoussmaller{
//     static void previousSmaller(int a[]){
//         int []res=new int[a.length];
//         Stack<Integer> st=new Stack<>();
//         for(int i=a.length-1;i>=0;i--){
//             if(st.empty()) st.push(i);
//             else if(a[i]>=a[st.peek()]){
//                 while(!st.empty() && a[i]>=a[st.peek()]){
//                     if(a[i]<a[st.peek()] && res[i]>a[st.peek()]){
//                         res[st.pop()]=a[i];
//                     }
//                     else  res[st.pop()] = res[i];
//                 }
//                 st.push(i);
//             }
//             else st.push(i);
//         }
//     }

//         static void nextSmallerEle(int a[]) {
//             int n = a.length;
//             int res[] = new int[n];
//             int i = 0;
//             Stack<Integer> st = new Stack<>();
    
//             while (i < n) {
                
//                 if (st.empty()) {
//                     st.push(i);
//                 } else if (a[i] <=a[st.peek()]) {
//                     while (!st.empty() && a[i] <= a[st.peek()]) {
//                         int idx = st.pop();
//                         res[idx] = a[i];
//                     }
//                     st.push(i);
//                 } else if (a[i] > a[st.peek()]) {
//                     st.push(i);
//                 }
//                 i++;
//             }
//             while(!st.empty()){
//                 int idx=st.pop();
//                 res[idx]=-1;
//             }
//             System.out.println(Arrays.toString(a));
//             System.out.println(Arrays.toString(res));
//         }


//         // while(!st.empty()){
//         //     res[st.pop()]=-1;
//         // }
//         // System.out.println(Arrays.toString(a));
//         // System.out.println(Arrays.toString(res));
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         nextSmallerEle(a);
        
//     }

// }
    



ListNode curr=head,prev=null,nextptr=null;
while(curr.next!=null){
    nextptr=curr.next;
    curr.next=prev;
    prev=curr;
    curr=nextptr;
}
head=prev;
return head;
}
public ListNode removeNthFromEnd(ListNode head, int n) {
if(head.next==null && n==1 ) return null;
reverse(head);
ListNode temp=head;
for(int i=1;i<n;i++){
    temp=temp.next;
}
if(temp==null||temp.next==null ){
    return reverse(head);
}
temp.next=temp.next.next;
return  reverse(head);
