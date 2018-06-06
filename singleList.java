
package linkedList;

/**
 *
 * @author Asus Group
 */
public class singleList {
    Node first;
    
    // ====================== InsertFirst ======================
    void insertFirst ( int data){
        Node new_elenment= new Node();
        new_elenment.data=data;
        new_elenment.next=first;
        first = new_elenment.next;
    }
    //======================= DeleteFirst ======================
    
    void deletFirst(){
        
        first = first.next;
        
    }
    //=======================DisplayList=========================
    
    void printList(){
        Node current= first;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        singleList l = new singleList();
        l.insertFirst(35);
        
        l.deletFirst();
        l.printList();
    }
}
