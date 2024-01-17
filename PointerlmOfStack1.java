import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){data=d;}
}
class PointerlmOfStack1{
    private Node top;
    public void push(int x){Node N=new Node(x);
    N.next=top;
    top=N;
    }
    public boolean isEmpty(){return top==null;}
    public int Top(){if(!isEmpty())return top.data;else return -11111;}
    public void pop()
    {if(!isEmpty())
        top=top.next;
    
    else
    System.out.println("Stack is Empty");
        }
    void makeNull(){top=null;}
}
 class PointerlmOfStack11 {

    public static void main(String[] args) {
     PointerlmOfStack1 s = new PointerlmOfStack1();
      s.push(1);
       s.push(9);
        s.push(2);
         s.push(10);
         while(!s.isEmpty())
         {System.out.println(s.Top());
         s.pop();
         }
    }
    
}
