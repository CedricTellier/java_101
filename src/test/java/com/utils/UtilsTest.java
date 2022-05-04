package com.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    private final double[] lValues = {1,2,3,4,5};
    @Test
    void add() {
        assertEquals(15.0, Utils.add(lValues));
    }

    @Test
    void isEven() {
        assertFalse(Utils.isEven((int)Utils.add(lValues)));
    }
}