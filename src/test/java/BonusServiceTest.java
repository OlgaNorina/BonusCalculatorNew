import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculatedForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
// вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculatedForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 2_000_000_60;
        boolean registered = true;
        long expected = 500;
// вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForNonRegisteredAndOverLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 10_000_000_00;
        boolean registered = false;
        long expected = 500;
// вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForNonRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 10_000_00;
        boolean registered = false;
        long expected = 100;
// вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForRegisteredAnd0() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;
// вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForNonRegisteredAnd0() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;
// вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForRegisteredAndNearUnderLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 16_633_34;
        boolean registrated = true;
        long expected = 499;
// вызываем целевой метод:
        long actual = service.calculate(amount, registrated);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForRegisteredAndNearOverLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 16_700_00;
        boolean registrated = true;
        long expected = 500;
// вызываем целевой метод:
        long actual = service.calculate(amount, registrated);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForNonRegisteredAndNearUnderLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 49_900_00;
        boolean registrated = false;
        long expected = 499;
// вызываем целевой метод:
        long actual = service.calculate(amount, registrated);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForNonRegisteredAndNearOverLimit() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = 50_100_00;
        boolean registrated = false;
        long expected = 500;
// вызываем целевой метод:
        long actual = service.calculate(amount, registrated);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculatedForRegisteredAndNegativAmount() {
        BonusService service = new BonusService();
// подготавливаем данные:
        long amount = - 1_000_00;
        boolean registrated = true;
        long expected = 0;
// вызываем целевой метод:
        long actual = service.calculate(amount, registrated);
        assertEquals(expected, actual);
    }
}