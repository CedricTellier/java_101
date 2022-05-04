package com.types;

public class Arrays {
    private int[] myIntArray = new int[]{1,2,3,4,5,6};

    public int[] getMyIntArray() {
        return myIntArray;
    }

    public void setMyIntArray(int[] myIntArray) {
        this.myIntArray = myIntArray;
    }

    public int getMyArrayLength(){return this.myIntArray.length;}

    public int getMyArrayIndexValue(int aIndex){return this.myIntArray[aIndex];}

    public void printAllArrayVAlues(){
        for(int i = 0;i<this.myIntArray.length;i++){
            System.out.println(this.myIntArray[i]);
        }
    }
}

