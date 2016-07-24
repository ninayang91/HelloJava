package com.company;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void add() throws Exception {
        int sum = Main.add(1, 2);
        assertEquals(3, sum);
    }
}