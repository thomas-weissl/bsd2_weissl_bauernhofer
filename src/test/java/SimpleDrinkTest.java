import at.campus02.at.Liquid;
import at.campus02.at.SimpleDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDrinkTest {
    SimpleDrink drink1;
    SimpleDrink drink2;

    @BeforeEach
    public void setup(){
        drink1 = new SimpleDrink("test1", new Liquid("test1L",1,0));
        drink2 = new SimpleDrink("test2", new Liquid("test2L",2,1));
    }

    @Test
    public void testIsAlcohol(){
        assertEquals(false, drink1.isAlcoholic());
        assertEquals(true, drink2.isAlcoholic());
    }

}
