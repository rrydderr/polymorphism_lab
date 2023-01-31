import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HotelTest {
    Hotel hotel;

    @BeforeEach
    void setUp(){
        hotel = new Hotel(25, LocalDate.of(1988,4,27), "Jupiter Close", 5, true);
    }

    @Test
    void canGetHotelLocation(){
        assertThat(hotel.getLocation()).isEqualTo("This Hotel is located on Jupiter Close");
    }

    @Test
    public void canRentHotelFromBookingWebsite(){
        String result = hotel.rent(5);
        assertThat(result).isEqualTo("You are able to rent a room in this hotel for 5 days.");
    }


}
