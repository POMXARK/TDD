import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @org.junit.jupiter.api.Test
    public void testEquality() {
        assertTrue(new Dollar(5). equals(new Dollar(5)));
        assertFalse(new Dollar(5). equals(new Dollar(6)));
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