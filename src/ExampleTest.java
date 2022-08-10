import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @org.junit.jupiter.api.Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @org.junit.jupiter.api.Test
    public void testEquality() {
        assertTrue(Money.dollar(5). equals(Money.dollar(5)));
        assertFalse(Money.dollar(5). equals(Money.dollar(6)));
        assertTrue(new Franc(5). equals(new Franc(5)));
        assertFalse(new Franc(5). equals(new Franc(6)));
        assertFalse(new Franc(5). equals(Money.dollar(5)));
    }

    @org.junit.jupiter.api.Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1). currency());
        assertEquals("CHF", Money.franc(1). currency());
    }
}

/*
1 шаг
    1) определим класс Dollar
    2) Добавим конструктор в класс Dollar
    3) Добавим метод times в класс Dollar
    4) создать поле (переменную) amount в класс Dollar
    5) Добавить junit
2 шаг
    4) записать 10 в поле amount в класс Dollar
3 шаг
    5) переместим поле amount в метод times
4 шаг
    Рефакторинг класса Dollar
 */