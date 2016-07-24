package com.company;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void add1Plus1() throws Exception {
        int sum = Main.add(1, 2);
        assertEquals(3, sum);
    }

    @Test
    public void add0Plus1() throws Exception {
        int sum = Main.add(0, 1);
        assertEquals(1, sum);
    }
}