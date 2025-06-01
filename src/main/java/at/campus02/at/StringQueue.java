
package at.campus02.at;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation for storing String elements with a fixed maximum size
 * Implements the IQueue interface
 */
public class StringQueue implements IQueue {

  /**
   * Internal list to store queue elements
   */
  private List<String> elements = new ArrayList<String>();

  /**
   * The maximum size of the queue
   */
  private int maxSize = 5;

  /**
   * Constructs a new StringQueue with the specified maximum size
   *
   * @param maxSize the maximum number of elements the queue can hold
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize; //fixed
  }

  /**
   * Adds a string to the queue if it's not full
   *
   * @param obj the string to be added
   * @return true if the element was added, false if the queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Retrieves and removes the first element of the queue or returns null if queue is empty
   *
   * @return the first element, or null if the queue is empty
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() == 0) {
      elements.remove(0);
    }

    return element;
  }

  /**
   * Retrieves and removes the first element of the queue
   * Throws NoSuchElementException if the queue is empty
   *
   * @return the first element in the queue
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * Retrieves, but does not remove, the first element of the queue or returns null if queue is empty
   *
   * @return the first element, or null if the queue is empty
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * Retrieves, but does not remove, the first element of the queue
   * Thros NoSuchElementException if the queue is empty
   *
   * @return the first element
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}