package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    public void shouldBelowTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);

        Assert.assertEquals(200, actual);
    }

    @Test
    public void shouldOnTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void shouldAboveTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);

        Assert.assertEquals(0, actual);
    }

}
