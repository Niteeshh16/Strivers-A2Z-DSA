package linkedlist;

public class MiddleOfTheLIst {

    Node findMiddle(){
        Node head = null;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }


}
