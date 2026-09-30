import java.util.*;
public class queuetostack {
    public static void main(String[] args){
        st s=new st();
        s.push(10);
        s.push(20);
        s.push(30);
        s.show();
        s.top();
        s.pop();
        s.show();
        s.top();
    }
}
class st{
    Queue<Integer> s= new LinkedList<Integer>();
    void push(int data){
        s.add(data);
        for(int i=0;i<s.size()-1;i++){
            s.add(s.poll());
        }
    }
    void show(){
        System.out.println(s);
    }
    void pop(){
        s.poll();
    }
    void top(){
        System.out.println(s.peek());
    }
}
