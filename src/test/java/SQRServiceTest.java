package ru.netology.sqr.packeges;
import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class SQRServiceTest {

    @Test
    public void borderNumberFirst() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.squaringCalculation(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderNumberSecond() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.squaringCalculation(100, 300);

        Assertions.assertEquals(expected, actual);

    }

}