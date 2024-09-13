import java.util.EmptyStackException;

public class MyStack implements MyStackInterface {

    private int[] array = new int[10];
    private int size = 0;

   /**
     * Returns the number of items currently 
     * in the stack. 
     */
    public int size() {
        return size;
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    /**
     * Adds the given item to the top of the stack.
     */
    public void push(int num) {
        // create new Array with same length
        int[] newArray = new int[array.length];

        // if array is full, create new Array
        if (size + 1 > newArray.length) {
            // create new Array with 2X length of the original array
            newArray = new int[array.length*2];
        }

        // copy the items in the array to the new array
        System.arraycopy(array, 0, newArray, 0, array.length);

        // add the given number to the end of the original array
        newArray[size] = num;

        //  increase size by 1
        size += 1;

        // copy newarray to array
        array = newArray;
    }

    /**
     * Returns the top item from the stack without
     * popping it. Throws EmptyStackException 
     * if the stack is empty.
     */
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return array[size-1];
    }

    /**
     * Removes the top item from the stack and 
     * returns it. Throws EmptyStackException if 
     * the stack is empty.
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        // remove the top item
        int topItem = array[size-1];
        array[size-1] = 0;

        // size decrease by 1
        size -= 1;

        // return the topItem
        return topItem;
    }

    /**
     * Returns the distance from the top of the
     * stack. The topmost item on the stack is 
     * considered to be at distance 1. For example,
     * if the stack contains {5, 3, 7, 5, 1} 
     * where 1 is the top of the stack and 
     * search(5) is called then the method should 
     * return 2. A -1 is returned if the item is 
     * not found in the stack.
     */
    public int search(int num) {
        // iterate through the array
        for (int i=size-1; i>=0; i--) {
            // if the item is found in the stack
            if (array[i] == num) {
                return size - i;
            }
        }

        // if item is not in stack, return -1
        return -1;
    }

    /**
     * Returns an array containing all of the 
     * elements in the stack in the correct
     * order. The first element pushed to the 
     * stack should be at index 0;
     */
    public int[] toArray() {
        // make new array
        int[] stack = new int[size];

        // copy items in the array to stack
        System.arraycopy(array, 0, stack, 0, size);

        // return array
        return stack;
    }

    
    
}
