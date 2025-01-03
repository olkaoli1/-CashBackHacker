package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900; // Покупка на 900 рублей
        int expected = 100; // Ожидаемое значение
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainOnBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000; // Покупка ровно на 1000 рублей
        int expected = 0; // Ожидаемое значение
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100; // Покупка на 1100 рублей
        int expected = 900; // Ожидаемое значение
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
