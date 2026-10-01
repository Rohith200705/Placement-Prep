class doubly {
    node head;
    public static void main(String[] args){
        doubly d=new doubly();
        d.add(10);
        d.add(20);
        d.add(30);
        d.showfront(d.head);
        d.showrev(d.head);

    }
    void add(int a){
        node newnode=new node(a);
        if(head==null){
            head=newnode;
        }
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            newnode.prev=temp;
            temp.next=newnode;
        }
    }
    void showfront(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void showrev(node head){
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
}
class node{
    int data;
    node next;
    node prev;
    node(int d){
        data=d;
        next=null;
        prev=null;
    }
}
