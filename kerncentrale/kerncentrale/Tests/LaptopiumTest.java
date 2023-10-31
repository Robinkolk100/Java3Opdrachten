import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopiumTest {

    @org.junit.jupiter.api.Test
    void testSplit(){
        Laptopium laptopium = new Laptopium();
        try {
            laptopium.split(350, 55);
        }
        catch (MeltdownException exception){};
        Assertions.assertEquals(2420, laptopium.getStoom());
        Assertions.assertEquals(100, laptopium.getRestpercentage());
        Assertions.assertEquals(12600, laptopium.getRestWarmte());
    }
}