/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author Asus Group
 */
public class Tree {

    Node root;

    //-------------------------Search Method -------------------
    Node Search(int searchKey) {

        Node current = root;
        while (current.data != searchKey) {
            if (searchKey < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }

            if (current == null) {
                return null;
            }
        }
        return current;
    }

    //----------------- Inseert Function ---------------
    void insert(int value) {
        Node new_node = new Node();
        new_node.data = value;

        if (root == null) {
            root = new_node;
        } else {
            Node current = root;
            Node parent;

            while (true) {

                parent = current;
                if (current.data> value){
                    current =current.left;
                    if(current == null)
                        current.left=new_node;
                        return;
                }
                else{
                    
                    current=current.right;
                    if (current == null )
                        current.right=new_node;
                        return;
                }
            }

        }

    }
    //------------ find Min ---------
    
    Node Min(){
        Node current=root;
        while(current.left != null){
            current=current.left;
    }
        return current;
    }
    
    //-------------- find Max--------------
    
    Node Max(){
        Node current= root;
        while(current.right != null){
            current=current.right;
            
        }
        return current;
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.Search(4);
    }

}
