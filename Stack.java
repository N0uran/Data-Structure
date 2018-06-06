
package StackAndQueue;

/**
 *
 * @author Asus Group
 */
public class Stack {
    int maxSize;
    int[] myStack;
    int top;

    public Stack() {
        maxSize=100;
        myStack = new int [maxSize];
        top =-1;
    }
    
   //=================Push=================
    void push(int element){
        top++;
        myStack[top]= element;
    }
    //=================Pop=================
    int  pop(){
        
        int x = myStack[top];
        top--;
    return  x ;
    }
    //=================Peek=================
    int  peek(){
        
        int y = myStack[top];
       
    return  y;
    }
    
    //===============Main Method=========
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(98);
        s.peek();
        s.pop();
    }
    
}
