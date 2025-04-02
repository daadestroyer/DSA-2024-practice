package Stack_Queue_10.Implementation;

class MyStackk {
    int[] stack;
    int top = -1;


    // size
    int size() {
        return top + 1;
    }

    // isEmpty
    boolean isEmpty() {
        return top == -1 ? true : false;
    }

    // push
    void push(int val) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = val;
        }
    }

    // pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    // peek
    public int peek() {
        if (stack.length >= 0) {
            int val = stack[top];
            return val;
        }
        return -1;
    }

    // print
    void print() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]+" ");
            }
        }
    }

}

public class App01_ImplementStackUsingArrays {
    public static void main(String[] args) {
        MyStackk stack = new MyStackk();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println("stack size : "+stack.size());

        System.out.println("pop : "+stack.pop() );

        stack.print();
        System.out.println("stack size : "+stack.size());

        System.out.println("stack peek : "+stack.peek());

        stack.print();
        System.out.println("stack size : "+stack.size());

        System.out.println("stack is empty : "+stack.isEmpty());
    }
}
