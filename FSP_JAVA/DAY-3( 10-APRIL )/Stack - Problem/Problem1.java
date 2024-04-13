//  Create Push , Pop,  Peek , Show Operation ...?


import java.util.*;

class StackOp {
    int arr[] = new int[100];
    int size, top;

    public StackOp() {
        top = -1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of stack:");
        size = input.nextInt();
    }

    public void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack is Overflow");
        } else {
            top++;
            arr[top] = val;
            System.out.println("Element Pushed");
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is Underflow");
            return -404;
        } else {
            int temp=arr[top];
            top--;
            return temp;
        }
    }

    public int peek() {
        if(top==-1){
            System.out.println("The Stack is Empty");
            return -404;
        } else {
            return this.arr[this.top];
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void show() {
        if (top == -1) {
            System.out.println("Empty Stack ");
        } else {
            System.out.println("Stack");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}

public class Problem1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        StackOp obj = new StackOp();
        while (true) {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. CHECK EMPTY");
            System.out.println("5. SHOW");
            System.out.println("0. EXIT");
            System.out.println("Enter your choice:");
            int ch = input.nextInt();
            if (ch == 0) {
                break;
            } 
            else if (ch == 1) {
                System.out.print("Enter stack element:");
                int val = input.nextInt();
                obj.push(val);
            } 
            else if (ch == 2) {
                int temp = obj.pop();
                if (temp != -404) {
                    System.out.println("Popped element is " + temp);
                }
            } 
            else if(ch == 3){
                int temp = obj.peek();
                if(temp != -404){
                    System.out.println("The top element is " + temp);
                }
            } 
            else if(ch == 4){
                System.out.println(obj.isEmpty() ? "The Stack is Empty" : "The Stack is not Empty");
            } 
            else if(ch == 5){
                obj.show();
            }
        }
    }
}
