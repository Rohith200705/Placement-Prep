import java.util.*;
public class tree {
    static class node{
        int data;
        node left;
        node right;
        node(){}
        node(int d){
            data=d;
            left=null;
            right=null;
        }
        static void inorder(node root){
            if(root==null)
                return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        static void preorder(node root){
            if(root==null)
                return ;
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        static void postorder(node root){
            if(root==null)
                return ;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        static void levelorder(node root){
            if(root==null)
                return ;
            Queue<node> q =new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                node temp=q.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        public static void bst(int[] a){
            for(int i:a){
                binarytree(i);
            }
        }
        static node bstroot;
        public static void binarytree(int d){
            node newnode=new node(d);
            if(bstroot==null){
                bstroot=newnode;
            }
            else{
                node temp=bstroot;
                while(true){
                    if(d<temp.data){
                        if(temp.left==null){
                            temp.left=newnode;
                            break;
                        }
                        temp=temp.left;
                    }
                    else{
                        if(temp.right==null){
                            temp.right=newnode;
                            break;
                        }
                        temp=temp.right;
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] a={5,3,7,1,4,6,8};
        node.bst(a);
        node n=node.bstroot;
        node print=new node();
        print.inorder(n);
        System.out.println();
        print.preorder(n);
        System.out.println();
        print.postorder(n);
        System.out.println();
        print.levelorder(n);
    }
}