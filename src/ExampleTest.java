import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @org.junit.jupiter.api.Test
    public void testEquality() {
        assertTrue(Money.dollar(5). equals(Money.dollar(5)));
        assertFalse(Money.dollar(5). equals(Money.dollar(6)));
        assertFalse(Money.franc(5). equals(Money.dollar(5)));
    }


    @org.junit.jupiter.api.Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1). currency());
        assertEquals("CHF", Money.franc(1). currency());
    }

    @org.junit.jupiter.api.Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @org.junit.jupiter.api.Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @org.junit.jupiter.api.Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
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