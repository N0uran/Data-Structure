
package linkedList;

/**
 *
 * @author Asus Group
 */
public class DoubleList {
    
    Node first;
    Node last;
    
    //====================== insertFirst=================
    
    void insertFirst(int data){
        Node new_node = new Node();
        new_node.data = data;
        
        if(first == null)
            last = new_node;
        
       new_node.next=first;
       first= new_node;
    }
    
    //======================= DeleteFirst =================
    
   int deleteFirst (){
       int oldData= first.data;
       if(first.next==null)
           last=null;
       first=first.next;
       
       return oldData;
       
   }
   //====================DisplayList=======================
   
   void printList(){
        Node current= first;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
   
   //==================Main method =========================
   
    public static void main(String[] args) {
        DoubleList d= new DoubleList();
        d.insertFirst(35);
        //d.deleteFirst();
        d.printList();
    }
}
