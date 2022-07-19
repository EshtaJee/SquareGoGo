import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.eshta_jee.maven.sqr.SQRServise;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/DataTest.csv")
    public void testSquareRoot(int expected, int minBorder, int maxBorder) {
        SQRServise servise = new SQRServise();
        int actual = servise.calcSquareRoot(minBorder, maxBorder);

        Assertions.assertEquals(expected, actual);
    }

}
