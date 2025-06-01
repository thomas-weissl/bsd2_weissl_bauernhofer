package at.campus02.at;

import java.util.NoSuchElementException;

/**
 * A queue implementation for Drink objects with a fixed maximum size
 */
public interface IDrinkQueue {

    /**
     * Adds a Drink object to the end of the queue if the maximum size is not exceeded
     *
     * @param obj the Drink to be added
     * @return true if successfully added, false if queue is full
     */
    public abstract boolean offer(Drink obj);

    /**
     * Retrieves and removes the first Drink in the queue
     *
     * @return the first Drink, or null if the queue is empty
     */
    public abstract Drink poll();

    /**
     * Retrieves and removes the first Drink in the queue
     * Throws an exception if the queue is empty
     *
     * @return the first Drink in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract Drink remove();

    /**
     * Retrieves, but does not remove, the first Drink in the queue
     *
     * @return the first Drink, or null if the queue is empty
     */
    public abstract Drink peek();

    /**
     * Retrieves, but does not remove, the first Drink in the queue
     * Throws an exception if the queue is empty
     *
     * @return the first Drink in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract Drink element();

}
