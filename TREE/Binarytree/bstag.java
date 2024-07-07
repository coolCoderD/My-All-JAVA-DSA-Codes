

public class bstag {
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int d){
            data=d;
            left=null;
            right=null;
        }
    }


    TreeNode  createBST(TreeNode root,int d){
        if(root==null){
            TreeNode n=new TreeNode(d);
            root=n;
            return  root;
        }
        else if(d>root.data){
            root.right=createBST(root.right,d);
        }
        else{
            root.left=createBST(root.left,d);
        }
        return root;
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    TreeNode search(TreeNode root,int d){
        while(root!=null){
            if(root.data==d){
                return root;
            }
            else if(d>root.data) root=root.right;
            else root=root.left;
        }
        return null;
    }



    static int max=0;
    static int count=0;
    static void dfs(TreeNode root,int k){
        if(root==null){
            return;
        }
        dfs(root.right,k);
        count++;
        if(count==k){
            max=root.data;
            return;
        }
        dfs(root.left,k);

        
    }
    
    public static void main(String[]args){
        bstag bs=new bstag();
        TreeNode root=null;
        root=bs.createBST(root,15);
        root=bs.createBST(root, 10);
        root=bs.createBST(root,20);
        root=bs.createBST(root, 8);
        root=bs.createBST(root, 12);
        root=bs.createBST(root, 16);
        root=bs.createBST(root, 25);
        TreeNode n=bs.search(root,25);
        bs.inorder(root);
        System.out.println();
        dfs(root,6);
        System.out.println(max);
    }
}
