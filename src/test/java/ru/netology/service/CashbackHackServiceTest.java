package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test

    void shouldBelowTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test

    void shouldOnTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test

    void shouldAboveTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}
