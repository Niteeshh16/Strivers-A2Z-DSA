package linkedlist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class InsertAtAnyPos {

    Node head;

    void insert(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){

            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos -1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("invalid position");
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        InsertAtAnyPos list = new InsertAtAnyPos();

        list.insert(10, 1); // 10
        list.insert(20, 2); // 10->20
        list.insert(30, 3); // 10->20->30
        list.insert(15, 2); // 10->15->20->30

        list.display();

    }
}
