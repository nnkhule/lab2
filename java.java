class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

   
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Top element: " + stack.peek());
    }
}// jjjjjjjjjjjjjjjjjjjjjjjjjjjjj
