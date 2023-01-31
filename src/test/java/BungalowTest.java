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


    @Test
    void canCalculateBungalowPrice__noArgument(){
        String expected = "The price of this Bungalow is £230";
        assertThat(bungalow.priceOfBungalow()).isEqualTo(expected);
    }

    @Test
    void canCalculateBungalowPrice__withArgument(){
        String expected = "The price of this Bungalow has reduced to £200";
        assertThat(bungalow.priceOfBungalow(200)). isEqualTo(expected);
    }

}
