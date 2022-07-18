package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn800ThenAmountIs1200() {
        CashbackHackService cbh = new CashbackHackService();
        int amount = 1200;
        int actual = cbh.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000ThenAmountIs1000() {
        CashbackHackService cbh = new CashbackHackService();
        int amount = 1000;
        int actual = cbh.remain(amount);
        int expected = 1000;
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
}



