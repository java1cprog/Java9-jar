package org.my.validator.address.imp;

import org.my.validator.index.IndexCodeValidatorFactory;
import org.my.validator.street.name.StreetNameValidatorFactory;
import org.my.validator.house.number.HouseNumberValidatorFactory;
import org.my.validator.house.apartment.number.HouseApartamentNumberValidatorFactory;
import org.my.validator.address.AddressValidator;

public class AddressValidatorImpl implements AddressValidator {
    @Override
    public boolean checkIndexCode(String indexCode) {
        return IndexCodeValidatorFactory.isValid(indexCode);
    }

    @Override
    public boolean checkStreetName(String streetName) {
        return StreetNameValidatorFactory.isValid(streetName);
    }

    @Override
    public boolean checkHouseNumber(int houseNumber) {
        return HouseNumberValidatorFactory.isValid(houseNumber);
    }

    @Override
    public boolean checkHouseApartamentNumber(int apartamentNumber) {
        return HouseApartamentNumberValidatorFactory.isValid(apartamentNumber);
    }
}
