
class MyStack<T> {

    Object[] stack = new Object[5];
    int top = -1;

    void push(T value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            stack[top--] = null;
        }
    }

    void display() {
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class Program8 {
    public static void main(String[] args) {

        MyStack<Integer> s = new MyStack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.display();
    }
}