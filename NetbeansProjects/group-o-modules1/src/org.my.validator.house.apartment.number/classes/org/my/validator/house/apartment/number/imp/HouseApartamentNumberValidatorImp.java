package org.my.validator.house.apartment.number.imp;

import org.my.validator.house.apartment.number.HouseApartamentNumberValidator;

public class HouseApartamentNumberValidatorImp implements HouseApartamentNumberValidator {

    @Override
    public boolean isHouseApartamentNumberValid(int houseApartamentNumber) {
        return 0 < houseApartamentNumber && houseApartamentNumber <= 30;
    }

}
