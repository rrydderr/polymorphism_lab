
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookingWebsiteTest {
    BookingWebsite bookingWebsite;
    Hotel hotel;
    Office office;
    Bungalow bungalow;

    @BeforeEach
    public void setUp(){
        bookingWebsite = new BookingWebsite("Airbnb");
        hotel = new Hotel(25, LocalDate.of(2002,8,23), "Simpson Road", 4, true);
        office = new Office(3, LocalDate.of(1999, 6, 13),"Hampton Ave", "Bright Network", 12);
        bungalow = new Bungalow(2, LocalDate.of(1989, 7,25), "Jarvis Street", false, 12);
    }

    @Test
    public void canAddHotelsOfficesAndBungalowsToBookingWebsite(){
        bookingWebsite.addbuilding(hotel);
        bookingWebsite.addbuilding(office);
        bookingWebsite.addbuilding(bungalow);
        System.out.println(bookingWebsite.getBuildings());
        assertThat(bookingWebsite.getBuildings().size()).isEqualTo(3);
    }
}
