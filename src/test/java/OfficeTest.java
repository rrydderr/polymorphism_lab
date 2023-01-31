import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.function.LongConsumer;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    void setUp(){
        office = new Office(24, LocalDate.of(2000, 7,24), "Lemon Street", "BNTA", 24);
    }

    @Test
    void canGetLocation__noArgument(){
        String expected = "This office is located on Lemon Street";
        assertThat(office.getLocation()).isEqualTo(expected);
    }

    @Test
    void canGetLocation__withArgument(){
        String expected = "This office has relocated to Lime Street";
        assertThat(office.getLocation("Lime Street")).isEqualTo(expected);
    }

    @Test
    void canCalculateNumberOfEmployees(){
        assertThat(office.numberOfEmployees()).isEqualTo(12);
    }

    @Test
    void canRentOfficeFromBookingWebsite(){
        String result = office.rent(7);
        assertThat(result).isEqualTo("You are able to rent this office for 7 days.");

    }




}
