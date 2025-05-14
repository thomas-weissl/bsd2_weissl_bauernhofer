package at.campus02.at;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IDrinkQueue {
    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize = 5;

    public DrinkQueue(int maxsize) {
        maxSize = maxSize;
    }

    @Override
    public boolean offer(Drink obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    @Override
    public Drink poll() {
        Drink element = peek();

        if (elements.size() == 0) {
            elements.remove(0);
        }

        return element;
    }

    @Override
    public Drink remove() {
        Drink element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public Drink peek() {
        return null;
    }

    @Override
    public Drink element() {
        return null;
    }
}
