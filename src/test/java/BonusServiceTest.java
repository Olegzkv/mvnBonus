import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int expected = 30;
        int actual = (int) service.calculate(1_000, true);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        int actual = (int) service.calculate(1_000_000, true);
        //System.out.println("2. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int expected = 10;
        int actual = (int) service.calculate(1_000, false);
        //System.out.println("3. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        int actual = (int) service.calculate(1_000_000, false);
        //System.out.println("4. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}