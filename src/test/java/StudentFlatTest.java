import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat studentFlat;

    @BeforeEach
    void setUp(){
        studentFlat = new StudentFlat(8, LocalDate.of(1999,05,11), "Thyme Park", 11,"KCL");
        }

        @Test
        void canGetLocation(){
        assertThat(studentFlat.getLocation()).isEqualTo("This building is in a quiet cul-de-sac next to Thyme Park");}


        @Test
        void canHostAParty(){
            StudentFlat studentFlat = new StudentFlat(9,LocalDate.of(1990,9,25), "Thyme Park", 11,"KCL");
            studentFlat.hostParty();
            assertThat(studentFlat.numberOfPartiesHosted).isEqualTo(12);
            }
    }



