package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn0ThenAmountIs1000() {
        CashbackHackService cbh = new CashbackHackService();
        int amount = 1000;
        int actual = cbh.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000ThenAmountIsZero() {
        CashbackHackService cbh = new CashbackHackService();
        int amount = 0;
        int actual = cbh.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500ThenAmountIs500() {
        CashbackHackService cbh = new CashbackHackService();
        int amount = 500;
        int actual = cbh.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}



