import java.util.ArrayList;
import java.util.List;


class node{
    int val;
    node left=null;
    node right=null;
    node(int v) {
        val=v;
    }

}

public class DFS  {
    static List<Integer> ll=new ArrayList<>();
    public List<Integer> preorderTraversal(node  root) {
        if(root==null) return ll;
        ll.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ll;
        
    }

    public static void lvlorder(node root){
        int  lvl=1;
        while(printlvl(root,lvl)){
            lvl++;
        }
        // return;
    }
    public static boolean printlvl(node root,int lvl){
        if(root==null) return false;
        if(lvl==1) {
            System.out.print(root.val+" ");
            return true;
        }
        boolean left = printlvl(root.left, lvl - 1);
        boolean right = printlvl(root.right, lvl - 1);
        return left || right;
    }

    public static void main(String [] args){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);

        lvlorder(root);

    }
    
}
