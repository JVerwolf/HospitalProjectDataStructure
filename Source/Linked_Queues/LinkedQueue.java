package Linked_Queues;

import Stacks.EmptyCollectionException;
/**
 * 
 * @author John Verwolf
 * @param <T> Type of element to be stored
 */
public class LinkedQueue<T> implements QueueADT<T> {

    private int count;
    private LinearNode<T> front, rear;

    /**
     * Creates an empty queue.
     */
    public LinkedQueue() {
        count = 0;
        front = rear = null;
    }

    /**
     * Adds the specified element to the rear of this queue.
     *
     * @param element the element to be added to the rear of this queue
     */
    @Override
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<>(element);
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
        count++;

    }

    /**
     * Removes the element at the front of this queue and returns a reference to
     * it. Throws an EmptyCollectionException if the queue is empty.
     *
     * @return the element at the front of this queue
     * @throws EmptyCollectionException if an empty collection exception occurs
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }
        T result = front.getElement();
        front = front.getNext();
        count--;
        if (isEmpty()) {
            rear = null;
        }
        return result;

    }

    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public T first() {
        return front.getElement();
    }

    @Override
    public int size() {
        return count;
    }
}