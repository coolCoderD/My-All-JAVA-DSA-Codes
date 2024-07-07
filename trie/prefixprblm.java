

public class prefixprblm {
    static class Node{
        Node child[]=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            else curr.child[idx].freq++;
            curr=curr.child[idx];
        }
        curr.eow=true;
    }

    public static void findPrefix(Node root,String ans){
        if(root==null) return ;
        if(root.freq==1) {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<root.child.length;i++){
            if(root.child[i]!=null){
                findPrefix(root.child[i],ans+(char)(i+'a'));
            }
        }
    }



    public static void main(String []args){
        String words[]={"zebra","dog","duck","dove"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        root.freq=-1;
        findPrefix(root, "");
    }
}

