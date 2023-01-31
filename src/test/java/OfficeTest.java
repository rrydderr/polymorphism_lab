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
        office = new Office(24, LocalDate.of(2000, 7,24), "Lemon Street");
    }

    @Test
    void canGetLocation(){
        assertThat(office.getLocation()).isEqualTo("This building is located on Lemon Street");
    }


//    @Test
//    void canCalculateNumberOfEmployees(){
//        Office office1 = new Office (24, LocalDate.of(2000, 7,24), "lemon Street", "BNTA", 12);
//        office1.numberOfEmployees();
//        assertThat(office1.employeeCount()).isEqualTo(12);
//    }
}
