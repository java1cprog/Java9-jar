package org.my.validator.house.number;

import org.my.validator.house.number.imp.HouseNumberValidatorImp;

public class HouseNumberValidatorFactory {

    private static volatile HouseNumberValidator validator = new HouseNumberValidatorImp();

    public static boolean isValid(int houseNumber) {
        return validator.isHouseNumberValid(houseNumber);
    }

   
    
}
