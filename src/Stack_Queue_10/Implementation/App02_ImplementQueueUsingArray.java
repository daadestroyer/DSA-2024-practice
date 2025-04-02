package Stack_Queue_10.Implementation;

public class App02_ImplementQueueUsingArray {
    public static void main(String[] args) {
        /*
            class Queue {
                int[] arr;
                int front, rear, size, capacity;

                public Queue(int cap) {
                    this.capacity = cap;
                    arr = new int[capacity];
                    front = 0;
                    rear = -1;
                    size = 0;
                }

                // Check if the queue is empty
                boolean isEmpty() {
                    return size == 0;
                }

                // Check if the queue is full
                boolean isFull() {
                    return size == capacity;
                }

                // Enqueue (push an element)
                void push(int data) {
                    if (isFull()) {
                        System.out.println("Queue is full");
                        return;
                    }
                    rear = (rear + 1) % capacity; // Circular increment
                    arr[rear] = data;
                    size++;
                }

                // Dequeue (pop an element)
                int pop() {
                    if (isEmpty()) {
                        System.out.println("Queue is empty");
                        return -1;
                    }
                    int val = arr[front];
                    front = (front + 1) % capacity; // Circular increment
                    size--;
                    return val;
                }

                // Get the front element
                int top() {
                    if (isEmpty()) {
                        System.out.println("Queue is empty");
                        return -1;
                    }
                    return arr[front];
                }

                // Get the size of the queue
                int size() {
                    return size;
                }

                // Print the queue
                void print() {
                    if (isEmpty()) {
                        System.out.println("Queue is empty");
                        return;
                    }
                    System.out.print("Queue: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[(front + i) % capacity] + " ");
                    }
                    System.out.println();
                }
            }

// Test the queue
public class QueueImplementation {
    public static void main(String[] args) {
                Queue queue = new Queue(5);

                queue.push(10);
                queue.push(20);
                queue.push(30);
                queue.push(40);
                queue.push(50);
                queue.print(); // Output: Queue: 10 20 30 40 50

                queue.pop();
                queue.print(); // Output: Queue: 20 30 40 50

                System.out.println("Front element: " + queue.top()); // Output: 20

                queue.push(60);
                queue.print(); // Output: Queue: 20 30 40 50 60

                queue.pop();
                queue.pop();
                queue.print(); // Output: Queue: 40 50 60
    }
}
        */
    }
}
