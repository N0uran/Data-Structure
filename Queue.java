
package StackAndQueue;

/**
 *
 * @author Asus Group
 */
public class Queue {
    int maxSize;
    int[] myQueue;
    int front , rear ,num_element;
    
    Queue(int size){
        maxSize=size;
        myQueue=new int[maxSize];
        front = 0 ;
        rear =-1;
        num_element=0;
        
    }
    
    //=================EnQueue==================
    
    void EnQueue(int elm){
        if(rear ==maxSize-1)
            rear=-1;
        
        rear++;
        myQueue[rear]=elm;
        num_element++;
    }
    
    //=================DeQueue==================
    
    int DeQueue(){
        int elm=myQueue[front];
        front ++;
        if(front  == maxSize)
            front=0;
        
        num_element--;
        return  elm;
    }
    //================Peek=====================
    int Peek() {
        int elm = myQueue[front];
        return elm;
    }
    
    //===================Main Method=============
    public static void main(String[] args) {
        Queue q = new Queue(5);
      
        System.out.println(q.toString());
        q.EnQueue(55);
        q.DeQueue();
    }
}
