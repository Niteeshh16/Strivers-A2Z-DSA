package linkedlist;

public class Inserting {

    Node head = null;
    void insertAtbeginning(int data){
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    void insertAtend(int data){
        Node newnode = new Node(data);
        Node temp = head;

        while (temp.next != null){
                temp = temp.next;
        }
        temp.next = newnode;
    }

    void inserAtPos(int data, int pos){
        Node newnode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos-1; i++){
            if(temp == null){
                System.out.println("NOt a valid position");
            }
            temp = temp.next;

        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println();
    }
}
