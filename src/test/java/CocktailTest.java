import at.campus02.at.Cocktail;
import at.campus02.at.Liquid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {
    Cocktail c;
    ArrayList<Liquid> liquids;

    @BeforeEach
    public void setup(){
        liquids = new ArrayList<>(Arrays.asList(new Liquid("test1",1,1),
                new Liquid("test2",2,2)));
        c = new Cocktail("test",liquids);
    }

    @Test
    public void testGetAlcoholPerecnt(){
        assertEquals(1.67,Math.round(c.getAlcoholPercent() * 100.0) / 100.0,"Für Cocktail sollte 1 rauskommen.");
    }
}
