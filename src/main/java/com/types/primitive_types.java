package com.types;

//Allocated on the stack
public class primitive_types {
    private short myShort = 1;
    private int myInteger = 0;
    private long myLong = 999999999;
    private float myFLoat = 0.0f;
    private char myChar ='A';
    private double myDouble = 0.0;
    private boolean myBoolean = true;

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public int getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(int myInteger) {
        this.myInteger = myInteger;
    }

    public double getMyDouble() {
        return myDouble;
    }

    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }

    public float getMyFLoat() {
        return myFLoat;
    }

    public void setMyFLoat(float myFLoat) {
        this.myFLoat = myFLoat;
    }

    public char getMyChar() {
        return myChar;
    }

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    public short getmYshort() {
        return myShort;
    }

    public void setmYshort(short mYshort) {
        this.myShort = mYshort;
    }

    public long getMyLong() {
        return myLong;
    }

    public void setMyLong(long myLong) {
        this.myLong = myLong;
    }
}
