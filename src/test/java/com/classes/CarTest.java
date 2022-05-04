package com.classes;

import com.enums.Type;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car mTestCar = new Car();
    private Car mTestCar2 = new Car(3);
    @Test
    @Order(1)
    void getNumberOfWheels() {
        assertAll(
                ()-> assertEquals(0, mTestCar.getNumberOfWheels()),
                ()-> assertEquals(3,mTestCar2.getNumberOfWheels()));
    }

    @Test
    @Order(2)
    void setNumberOfWheels() {
        int lWheelsNumber = 2;
        mTestCar.setNumberOfWheels(lWheelsNumber);
        assertEquals(lWheelsNumber, mTestCar.getNumberOfWheels());
    }

    @Test
    @Order(3)
    void setType() {
        Type lType = Type.CAR;
        mTestCar.setType(lType);
        mTestCar2.setType(lType);
        assertAll(
                ()->assertEquals(lType, mTestCar.getType()),
                ()->assertEquals(lType, mTestCar2.getType())
        );
    }

    @Test
    @Order(4)
    void getType() {
        mTestCar2.setType(Type.CAR);
        assertAll(
                ()-> assertEquals(Type._NONE, mTestCar.getType()),
                ()-> assertEquals(Type.CAR,mTestCar2.getType()));
    }

    @Test
    @Order(5)
    void hasWheels() {
        assertAll(
                ()-> assertEquals(true, mTestCar.hasWheels()),
                ()-> assertEquals(true, mTestCar2.hasWheels()));
    }
}