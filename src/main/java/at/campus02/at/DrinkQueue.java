package at.campus02.at;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation for Drink objects with a fixed maximum size
 */
public class DrinkQueue implements IDrinkQueue {
    /**
     * Internal list to stroe Drink objects
     */
    private List<Drink> elements = new ArrayList<Drink>();

    /**
     * The maximum number of elements allowed in the queue
     */
    private int maxSize = 5;

    /**
     * Constructs a DrinkQueue with a custom maximum size
     * @param maxSize the maximum number of elements in the queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize; //fixed
    }

    /**
     * Adds a Drink object to the end of the queue if the maximum size is not exceeded
     *
     * @param obj the Drink to be added
     * @return true if successfully added, false if queue is full
     */
    @Override
    public boolean offer(Drink obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * Retrieves and removes the first Drink in the queue
     *
     * @return the first Drink, or null if the queue is empty
     */
    @Override
    public Drink poll() {
        Drink element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * Retrieves and removes the first Drink in the queue
     * Throws an exception if the queue is empty
     *
     * @return the first Drink in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public Drink remove() {
        Drink element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * Retrieves, but does not remove, the first Drink in the queue
     *
     * @return the first Drink, or null if the queue is empty
     */
    @Override
    public Drink peek() {
        if (elements.isEmpty()) return null;
        return elements.get(0);
    }

    /**
     * Retrieves, but does not remove, the first Drink in the queue
     * Throws an exception if the queue is empty
     *
     * @return the first Drink in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public Drink element() {
        if (elements.isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return elements.get(0);
    }
}
