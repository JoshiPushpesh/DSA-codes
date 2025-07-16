import java.util.*;
class Nodee{
    String data;
    Nodee left,right;
    Nodee(String item){
        this.data = item;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    Nodee root;
    BinaryTree(){
        root = null;
    }

    void inorder(Nodee root){
        if(this.root==null)
        {
            System.out.println("Tree Empty");
        }

        else if(root==null)
        {
            return ;
        }
          else
        {
            inorder(root.left);
            System.out.print(" "+root.data);
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        obj.root = new Nodee("A");
        obj.root.left = new Nodee("B");
        obj.root.right = new Nodee("C");
        obj.root.left.left = new Nodee("D");
        obj.root.left.right = new Nodee("E");
        obj.root.right.left = new Nodee("F");
        obj.root.right.right = new Nodee("G");
        obj.inorder(obj.root);
    }
}
