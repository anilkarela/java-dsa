package lists.vetorAndStacks;

import java.util.Vector;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) throws Exception {
        Vector<Integer> vector= new Vector<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        System.out.println(stack);
        
        vector.add(45);vector.add(46);
        vector.add(78);
        System.out.println(vector);

        Stack<Integer> mStack= new Stack<>();
        mStack.push(450);

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(45);
        myStack.push(55);
        myStack.push(11);
        myStack.push(22);
        int result = myStack.pop();
        System.out.println(result);
        int seek=myStack.seek();
        System.err.println(seek);


    }
}
