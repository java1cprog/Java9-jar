package org.my.validator.address;

/**
 * Created by ftr on 06/11/15.
 */
public interface AddressValidator {

    public boolean checkIndexCode(String indexCode);
    public boolean checkStreetName(String streetName);
    public boolean checkHouseNumber(int houseNumber);
    public boolean checkHouseApartamentNumber(int apartamentNumber);

}
