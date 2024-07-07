
import java.util.*;


public class alpha{
    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    static class info{
        int hd;
        node node;

        public info(node node,int hd){
            this.hd=hd;
            this.node=node;
        }
    }

    static void topView(node root){
        Queue<info> q=new LinkedList<>();
        HashMap<Integer,node> map=new HashMap<>();
        int min=0,max=0;

        q.add(new info(root,0));

        while(!q.isEmpty()){
            info curr=q.remove();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null){
                q.add(new info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }


    //kth level
    static void kthlvl(node root,int lvl,int k){
        if(root==null) return;
        if(lvl==k){
            System.out.print(root.data+" ");
            return;
        }
        lvl++;
        kthlvl(root.left,lvl,k);
        kthlvl(root.right,lvl,k);
    }


    //Min distance between two nodes
    static int  dist(node root,int  n){
        if(root==null) return -1;
        if(root.data==n) return 0;
        int l=dist(root.left,n);
        int r=dist(root.right,n);
        if(l==-1 && r==-1) return -1;
        else if(l==-1) return r+1;
        else return l+1;
    }

    static node lca(node root,int p,int q){
        if(root==null || root.data==p || root.data==q) return root;
        node l=lca(root.left,p,q);
        node r=lca(root.right,p,q);
        if(l!=null && r!=null) return root;
        else if(l==null) return r;
        else return l;
    }


    static int minDistBwNodes(node root,int p,int q){
        node lca=lca(root,p,q);
        int dist1=dist(root,p);
        int dist2=dist(root,q);
        return dist1+dist2;
    }



    //kth ancestor
    static int kthAncestor(node root,int n,int k){
        if(root==null) return -1;
        if(root.data==n) return 0;
        int l=kthAncestor(root.left, n, k);
        int r=kthAncestor( root.right, n, k);
        if(l==-1 && r==-1) return -1;
        int max=Math.max(l,r);
        if(max+1==k) System.out.println(root.data);
        return max+1;
    }


    //Sum Tree
    static int func(node root){
        if(root==null) return 0;
        int l=func(root.left);
        int r=func(root.right);
        int lc= root.left==null? 0:root.left.data;
        int rc=root.right==null? 0:root.right.data;
        int data=root.data;
        root.data=l+r+lc+rc;
        return data;
    }
    


    //Root to leaf Paths
    static void printRoot2leaf(node root,ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null){
            System.out.println(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);

    }


    //Mirror
    public static node mirror(node root){
        if(root==null) return null;
        node left=mirror(root.left);
        node right=mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }


    
    
    
    
    static void inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }


    public static void main(String[] args) {


        /*
         *             1
         *            /  \
         *            2    3
         *          /  \  /  \
         *         4    5  6  7
         *        /
         *       8
         * 
         */
        node root = new node(1);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right = new node(3);  // Initialize root.right
        root.right.left = new node(6);
        root.right.right = new node(7);
        // root.left.left.left=new node(8);
    
        // inorder(root);
        // System.out.println();
        // func(root);
        // System.out.println();
        // inorder(root);

        ArrayList<Integer> al=new ArrayList<>();

        inorder(root);
        root=mirror(root);
        System.out.println();
        inorder(root);
    }
    
}