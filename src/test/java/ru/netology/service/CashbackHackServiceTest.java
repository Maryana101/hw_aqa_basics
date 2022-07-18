package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn1000ThenAmountIs0() {
        CashbackHackService cbs = new CashbackHackService();
        int actual = cbs.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0ThenAmountIs1000() {
        CashbackHackService cbs = new CashbackHackService();
        int actual = cbs.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500ThenAmountIs500() {
        CashbackHackService cbs = new CashbackHackService();
        int actual = cbs.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }
}