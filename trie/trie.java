public class trie {
    static class Node{
        Node[]child=new Node[26];
        boolean eow=false;
        public Node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
        }
    }


    public static Node root=new Node();

    //Insert
    public static void insert(String word){
        Node curr=root;
        for(int lvl=0;lvl<word.length();lvl++){
            int idx=word.charAt(lvl)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }


    //Search
    public static boolean search(String key){
        Node curr=root;
        for(int lvl=0;lvl<key.length();lvl++){
            int idx=key.charAt(lvl)-'a';
            if(curr.child[idx]==null) return false;
            curr=curr.child[idx];
        }
        return curr.eow==true;
    }
    


    //Word Break
    public static boolean wordBreak(String key){
        if(key.length()==0) return true;
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))) return true;
        }
        return false;
    }



    //StartsWith Prblm
    public static boolean startsWith(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null) return false;
            curr=curr.child[idx];
        }
        return true;
    }


    //ALL prefix prblm

    public static String ans="";
    public static void longestWord(Node root,StringBuilder str){
        if(root==null) return;
        for(int i=0;i<26;i++){
            if(root.child[i]!=null && root.child[i].eow==true){
                char ch=(char)(i+'a');
                str.append(ch);
                if(str.length()>ans.length()) ans=str.toString();
                longestWord(root.child[i], str);
                str.deleteCharAt(str.length()-1);
            }

        }
    }


    public static void main(String[]args){
        // String[]words={"a","banana","app","appl","ap","apply","apple"};
        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // longestWord(root, new StringBuilder(""));
        // System.out.println(ans);

        String words[]={"a"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key="b";
        System.out.println(wordBreak(key));
        // System.out.println(startsWith("jgj"));


    }
}
