package com.interfaces;

import com.enums.Type;

public interface VehicleInterface {
     boolean hasWheels();
     void setType(Type aType);
     Type getType();

     //now we can call this function directly using the interface
     default boolean isTrue(){return true;}
}
