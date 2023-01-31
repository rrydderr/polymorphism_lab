import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TownTest {

    Town town;

    @BeforeEach
    void setUp(){
        town = new Town();
    }

    @Test
    void canCountBuildings(){
        assertThat(town.countBuildings()).isEqualTo(0);
    }

    @Test
    void canAddBuilding(){
        Bungalow bungalow = new Bungalow(4, LocalDate.of(2002,7,13),"Hunter Street", true, 12 );
        town.addBuilding(bungalow);
        assertThat(town.countBuildings()).isEqualTo(1);
    }



}
