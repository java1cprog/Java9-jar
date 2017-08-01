package org.my.validator.house.number.imp;

import org.my.validator.house.number.HouseNumberValidator;

public class HouseNumberValidatorImp implements HouseNumberValidator{

    public HouseNumberValidatorImp() {
    }

    
    @Override
    public boolean isHouseNumberValid(int houseNumber) {
        return 0 < houseNumber && houseNumber < 100;
    }
    
}
