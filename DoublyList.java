package linkedList;

/**
 *
 * @author Asus Group
 */
public class DoublyList {

    Node first;
    Node last;

    //=====================insertFirst ====================
    void insertFirst(int data) {
        
        Node new_node = new Node();
        new_node.data = data;

        if (first == null) 
            last = new_node;
        else 
            first.prev=new_node.next;
        
        new_node.next=first;
        first=new_node;
        
    }
    
    //==================DeleteFirst ========================
    Node deleteFirst(){
        Node temp=first;
        
        if(first.next == null)
            last=null;
        else
            first.next.prev=null;
        
        first=first.next;
        return temp;
    }
    
    //====================DisplayForward =====================
    void displayForward() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    //====================DisplayBackward =====================
    void displayBackward() {
        Node current = last;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }
    //========================main Method==============
    public static void main(String[] args) {
        DoublyList x = new DoublyList();
        x.insertFirst(11);
        x.insertFirst(30);
        System.out.print("Display backward : ");
        x.displayBackward();
        System.out.println("");
        System.out.print("Display forward : ");
        x.displayForward();
    }
}


