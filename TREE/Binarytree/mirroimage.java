


public class mirroimage {
    static class node{
        int val;
        node left;
        node right;
        public node(int v){
            val=v;
            left=null;
            right=null;
        }
    }


    static node mirror(node root){
        if(root==null) return null;
        node l=mirror(root.left);
        node r=mirror(root.right);
        node t=root.left;
        root.left=root.right;
        root.right=t;
        return root;

    }


    static void inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }



    public static void main(String []args){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        inorder(root);
        root=mirror(root);
        System.out.println();
        inorder(root);



    
    }
}
