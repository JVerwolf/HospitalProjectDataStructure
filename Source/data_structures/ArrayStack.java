package data_structures;

import io_utils.DataStructure;
import java.io.Serializable;

/**
 * ArrayStack generates a stack using an array.
 *
 * @author John Verwolf
 *
 * @param <T> The generic type that the stack will be set to operate on
 */
public class ArrayStack<T> implements StackADT<T>, DataStructure<T>, Serializable {

    /**
     * constant to represent the default capacity of the array
     */
    private final int DEFAULT_SIZE = 10;

    /**
     * int that represents both the number of elements and the next available
     * position in the array
     */
    private int top;

    /**
     * array of generic elements to represent the stack
     */
    private T[] stackArray;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        top = 0;
        stackArray = (T[]) (new Object[DEFAULT_SIZE]);
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialSize represents the specified capacity
     */
    public ArrayStack(int initialSize) {
        top = 0;
        stackArray = (T[]) (new Object[initialSize]);
    }

    /**
     * Private constructor for factory method copy(). Generates a copy of the
     * instance.
     *
     * @param passedTop   The pointer to the top of the arrayStack.
     * @param passedArray the array that the stack uses as it's underlying data
     *                    container.
     */
    private ArrayStack(int passedTop, T[] passedArray, int passedSize) {
        this.top = passedTop;
        this.stackArray = (T[]) (new Object[passedTop]);
        /**
         * manual copy of passed array into instance variable this.stackArray
         */
        for (int i = 0; i < stackArray.length; i++) {
            this.stackArray[i] = passedArray[i];
        }
    }

    /**
     * Adds the specified element to the top of this stack, expanding the
     * capacity of the stack array if necessary.
     *
     * @param element generic element to be pushed onto stack
     */
    @Override
    public void push(T element
    ) {
        if (size() == stackArray.length) {
            expandCapacity();
        }
        stackArray[top] = element;
        top++;
    }

    /**
     * Returns reference, for modification.
     *
     * @param n
     * @return
     * @throws data_structures.EmptyCollectionException
     */
    public T get(int n) throws EmptyCollectionException {
        int i = top - n;
        try {
            return stackArray[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyCollectionException();
        }
    }

    /**
     * removes and returns element at specified index
     *
     * @param n indeex from head of list
     * @return element at index
     * @throws EmptyCollectionException
     */
    public T remove(int n) throws EmptyCollectionException {
        try {
            int i = top - n;
            T temp = stackArray[i];
            while (i < stackArray.length - 1) {
                stackArray[i] = stackArray[i + 1];
                stackArray[i + 1] = null;
                i++;
            }
            top--;
            return temp;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyCollectionException();
        }
    }

    /**
     * Creates a new array to store the contents of this stack with a length of
     * the original plus the value stored in DEFAULT_SIZE
     * <p>
     */
    private void expandCapacity() {
        T[] larger = (T[]) (new Object[stackArray.length + DEFAULT_SIZE]);
        System.arraycopy(stackArray, 0, larger, 0, stackArray.length);

        /*
         * //the above line replaces the for loop. (TODO: test) for (int index
         * = 0; index < stack.length; index++) { larger[index] = stack[index]; }
         */
        stackArray = larger;
    }

    /**
     * Removes the element at the top of this stack and returns a reference to
     * it. Throws an EmptyCollectionException if the stack is empty.
     *
     * @return T element removed from top of stack
     * @throws EmptyCollectionException if a pop is attempted on empty stack
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }
        top--;
        T result = stackArray[top];
        stackArray[top] = null;
        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack. The element
     * is not removed from the stack. Throws an EmptyCollectionException if the
     * stack is empty.
     *
     * @return T element on top of stack
     * @throws EmptyCollectionException if peek is attempted on empty stack
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }
        return stackArray[top - 1];
    }

    /**
     * Check if stack is empty
     *
     * @return true if this stack contains no elements
     */
    @Override
    public Boolean isEmpty() {
        return (top == 0); //returns true if top == 0, false otherwise
    }

    /**
     * find the current size of the stack
     *
     * @return length of stack array
     */
    @Override
    public int size() {
        return top;
    }

    /**
     * returns string representation of the object, including size and number of
     * objects
     *
     * @return string representation of the object, including size and number of
     *         objects
     */
    @Override
    public String toString() {
        return "ArrayStack: " + "size=" + size() + ", number_of_objects=" + top;

    }

    /**
     * Factory method to return a new copy instance of the current arrayStack
     * instance.
     *
     * @return a copied instance of the original array instance.
     */
    public ArrayStack<T> copy() {
        return new ArrayStack<>(this.top, this.stackArray, this.size());
    }
}
