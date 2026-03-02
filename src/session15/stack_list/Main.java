package stack_list;

public class Main {
    public static void main(String[] args) {

        Stack2 outer = new Stack2();
        Stack2.Stack<Integer> stack = outer.new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        stack.display();
    }
}