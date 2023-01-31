import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {
    Bungalow bungalow;

    @BeforeEach
    void setUp (){
        bungalow = new Bungalow(3, LocalDate.of(2012, 4,26), "First Avenue", true, 46);
    }

    @Test
    void canGetLocation(){
        assertThat(bungalow.getLocation()).isEqualTo("This property is located on First Avenue");
    }

//    @Test
//    void calculatePriceOfBungalow(){
//        bungalow.priceOfBungalow();
//
//    }

    @Test
    void canCalculateBungalowPrice(){
        assertThat(bungalow.priceOfBungalow()).isEqualTo(230);
    }


}
