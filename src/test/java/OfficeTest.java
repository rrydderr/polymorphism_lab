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
    void canGetLocation(){
        assertThat(office.getLocation()).isEqualTo("This building is located on Lemon Street");
    }


//    @Test
//    void canCalculateNumberOfEmployees(){
//        office.numberOfEmployees();
//        assertThat(office.employeeCount()).isEqualTo(12);
//    }

    @Test
    void canCalculateNumberOfEmployees(){
        assertThat(office.numberOfEmployees()).isEqualTo(12);
    }
}
