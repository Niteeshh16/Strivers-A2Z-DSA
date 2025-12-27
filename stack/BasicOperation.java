package stack;


class Stack{
    int[] arr;
    int top;
    int size;


    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;

    }
    void  push(int x){
        if (top == size-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop(){
        if (top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }


int peek() {
    if (top == -1) {
        System.out.println("Stack is Empty");
        return -1;
    }
    return arr[top];
}

// check if stack is empty
boolean isEmpty() {
    return top == -1;
    }
}

public class BasicOperation {
    public static void main(String[] args) {

        Stack s  = new Stack(5);
        s.push(40);
        System.out.println(s.peek());
    }
}
