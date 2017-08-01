package org.my.validator.address;

import org.my.validator.address.imp.AddressValidatorImpl;

public class Main {

    public static void main(String[] args) {
        final String[] inputArray1 = {"A12","Rainbow","21","7"};
        
        
        if(null == inputArray1 || inputArray1.length<4){
            return;
        }
        
        final AddressValidator validator = new AddressValidatorImpl();
        
        final boolean isIndexCodeOk = validator.checkIndexCode(inputArray1[0]);
        final boolean isStreetNameOk = validator.checkStreetName(inputArray1[1]);
        final boolean isHouseNumberOk = validator.checkHouseNumber(Integer.valueOf(inputArray1[2]));
        final boolean isHouseApartamentNumberOk = validator.checkHouseApartamentNumber(Integer.valueOf(inputArray1[3]));
        
        
        if(isIndexCodeOk){
            System.out.format("\"%s\" is a valid index code", inputArray1[0]);
        } else {
            System.out.format("\"%s\" isn't a valid index code", inputArray1[0]);
        }
        System.out.print("\n\r");
        if(isStreetNameOk){
            System.out.format("\"%s\" is a street name", inputArray1[1]);
        } else {
            System.out.format("\"%s\" isn't a street name", inputArray1[1]);
        }
        System.out.print("\n\r");
        if(isHouseNumberOk){
            System.out.format("\"%s\" is a house number", inputArray1[2]);
        } else {
            System.out.format("\"%s\" isn't a house number", inputArray1[2]);
        }
        System.out.print("\n\r");
        if(isHouseApartamentNumberOk){
            System.out.format("\"%s\" is a house apartment number", inputArray1[3]);
        } else {
            System.out.format("\"%s\" isn't a house apartment number", inputArray1[3]);
        }
        System.out.print("\n\r");
    }
}
