package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.assertEquals;


class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "51489185, M",
            "40727500, C",
            "29307703, E",
            "25016138, G",
            "86597229, K",
            "21650218, L",
            "50569842, H",
            "72473849, K",
            "24019866, T",
            "37564695, Z"
    })
    void letterShouldMatch(int dniNumber, char letter) {

        assertEquals(letter, CalculateDni.calculateDni(dniNumber));
    }

}