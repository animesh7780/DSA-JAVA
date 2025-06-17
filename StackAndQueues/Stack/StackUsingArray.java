public class StackUsingArray{
    private int[] arr;
    private int top;
    private int capacity;

    public StackUsingArray() {
        this.capacity = 10;  // default size
        this.arr = new int[capacity];
        this.top = -1;  // indicates empty stack
    }

    public void push(int x) {
       if(isFull()) return;
       arr[top++] = x;
    }

    public int pop() {
      if(isEmpty()){
        System.out.println("Stack is Empty");
      }
      return arr[top--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }
}