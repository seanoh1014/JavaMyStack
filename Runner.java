import java.util.*;

public class Runner {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

    
        System.out.println(Arrays.toString(stack.toArray()));
        stack.push(5);
        stack.push(4);
        stack.push(3);
        System.out.println(stack.search(4)); 
        
    }
}
