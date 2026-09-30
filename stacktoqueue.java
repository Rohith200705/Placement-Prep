import java.util.*;
public class stacktoqueue{
    public static void main(String[] args) {
        queue q=new queue();
        for(int i=0;i<10;i++){
            q.enqueue(i);
        }
        q.size();
    }
}
class queue{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    void enqueue(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    void dequeue(){
        s1.pop();
    }
    void top(){
        System.out.println(s1.peek());
    }
    void size(){
        System.out.println(s1.size());
    }
}