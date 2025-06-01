import at.campus02.at.DrinkQueue;
import at.campus02.at.Liquid;
import at.campus02.at.SimpleDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrinkQueueTest {
    private DrinkQueue drinkQueue;

    @BeforeEach
    public void setup(){
        drinkQueue = new DrinkQueue(2);
    }

    @Test
    public void testOffer(){
        assertEquals(true, drinkQueue.offer(new SimpleDrink("test1",
                new Liquid("test1L", 1, 1))));
        assertEquals(true, drinkQueue.offer(new SimpleDrink("test2",
                new Liquid("test2L", 1, 1))));
        assertEquals(false, drinkQueue.offer(new SimpleDrink("test3",
                new Liquid("test3L", 1, 1))));
    }

    @Test
    public void testPoll(){
        drinkQueue.offer(new SimpleDrink("test1",
                        new Liquid("test1L", 1, 1)));
        drinkQueue.offer(new SimpleDrink("test2",
                new Liquid("test2L", 1, 1)));
        assertEquals("test1", drinkQueue.remove().getName());
        assertEquals("test2", drinkQueue.remove().getName());
        assertThrows(NoSuchElementException.class, drinkQueue::remove);
    }

}
