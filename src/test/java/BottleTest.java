import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class BottleTest {

        Bottle wine;

        @Before
        public void before() {
        wine = new Bottle();
        }

        @Test
        public void drinkTest(){
            assertEquals(90, wine.drink());
        }

        @Test
         public void volumeTest(){
        assertEquals(100, wine.volumeCheck());
        }

        @Test
        public void emptyTest(){
        assertEquals(0, wine.empty());
         }

         @Test
        public void fillTest(){ wine.empty();
        assertEquals(100, wine.fill());
        }
}
