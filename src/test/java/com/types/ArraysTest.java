package com.types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
    private Arrays myArray = new Arrays();

    @Test
    void getMyIntArray() {
        int[] myIntArray = new int[]{1,2,3,4,5,6};
        assertArrayEquals(myIntArray, myArray.getMyIntArray());
    }

    @Test
    void setMyIntArray() {
        int[] lNewArray = new int[]{7,8,9,10,11,12};
        myArray.setMyIntArray(lNewArray);
        assertArrayEquals(lNewArray, myArray.getMyIntArray());
    }

    @Test
    void getMyArrayLength() {
        assertEquals(6, myArray.getMyArrayLength());
    }

    @Test
    void getMyArrayIndexValue() {
        assertEquals(3, myArray.getMyArrayIndexValue(2));
    }

}