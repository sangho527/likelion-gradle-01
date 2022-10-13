import domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {
    //art + insert


    @Test
    @DisplayName("test doing well parse id")
    void name() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse("eee");
        Assertions.assertEquals("1", hospital.getId());
    }
}