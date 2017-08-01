package org.my.validator.house.apartment.number;

import org.my.validator.house.apartment.number.imp.HouseApartamentNumberValidatorImp;

public class HouseApartamentNumberValidatorFactory {

    private static HouseApartamentNumberValidator validator;

    private static HouseApartamentNumberValidator getValidator() {
       
        synchronized (HouseApartamentNumberValidator.class) {
            if (null == validator) {
                validator = new HouseApartamentNumberValidatorImp();
            }
        }
        return validator;
    }

    public static boolean isValid(int houseApartmentNumber) {
        return getValidator().isHouseApartamentNumberValid(houseApartmentNumber);
    }

}
