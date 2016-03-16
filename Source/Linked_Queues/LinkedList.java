/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_Queues;

import Stacks.EmptyCollectionException;
import java.util.Iterator;

/**
 *
 * @author John Verwolf
 */
public class LinkedList<T> implements ListADT<T>, Iterable<T> {

    protected int count;
    protected LinearNode<T> head, tail;

    /**
     * Creates an empty list.
     */
    public LinkedList() {
        count = 0;
        head = tail = null;
    }

    /**
     * Adds an empty element to the beginning of the list
     */
    @Override
    public void addFirst() {
        addFirst(null);
    }

    /**
     * Adds an element to the beginning of the list
     */
    public void addFirst(T element) {
        if (isEmpty()) {
            head = new LinearNode<>(element);
            tail = head;
        } else {
            LinearNode<T> temp = head;              //hold the head Node from garbage collection by assigning temp pointer to it
            head = new LinearNode<>(element);       //head points to new node
            head.setNext(temp);                     //set the new node's next value to temp (previous head node)
        }
        count++;
    }

    /**
     * Adds an empty element to the end of the list
     */
    @Override
    public void addLast() {
        addLast(null);
    }

    /**
     * Adds an element to the end of the list
     */
    public void addLast(T element) {
        if (isEmpty()) {
            head = new LinearNode<>(element);
            tail = head;
        } else {
            tail.setNext(new LinearNode<>(element));        //attach new node to end of last node in list
            tail = tail.getNext();                          //update tail to point to new node
        }
        count++;
    }

    /**
     * Remove the first item from the list
     *
     * @return the first item from the list
     * @throws EmptyCollectionException if empty
     */
    @Override
    public T removeFirst() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Error in removeFirst()");
        }
        LinearNode<T> temp = head;
        head = head.getNext();
        count--;
        return temp.getElement();
    }

    /**
     * Remove the last item from the list
     *
     * @return the last item from the list
     * @throws EmptyCollectionException if empty
     */
    @Override
    public T removeLast() throws EmptyCollectionException {
//        if (isEmpty()) {
//            throw new EmptyCollectionException("queue");
//        }
//        T result = head.getElement();
//        head = head.getNext();
//        count--;
//        if (isEmpty()) {
//            tail = null;
//        }
//        return result;
//    }
        LinearNode<T> probe = head;
        LinearNode<T> returnNode;
        switch (count) {
            case 0:
                throw new EmptyCollectionException("Error in removeLast()");
            case 1:
                head = tail = null;
                count--;
                return probe.getElement();
            default:
                //traverse list until probe refers to second last element
                while (probe.getNext().getNext() != null) {
                    probe = probe.getNext();
                }
                returnNode = tail;          //set pointer to tail node that is going to be removed
                tail = probe;               //update tail point to second last node
                tail.setNext(null);         //chop tail node off of the list
        }
        count--;
        return returnNode.getElement();
    }

    /**
     * Check if list is empty
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Return the length of the list
     *
     * @return the length of the list
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Show the first element in the list
     *
     * @return the first element in the list
     */
    @Override
    public T first() {
        return head.getElement();
    }

    /**
     * Show the last element in the list
     *
     * @return the last element in the list
     */
    @Override
    public T last() {
        return tail.getElement();
    }

    /**
     * Define how to iterate over the list.
     *
     * @return Not implemented yet
     */
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
