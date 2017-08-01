package org.my.validator.street.name;

public class StreetNameValidatorFactory {
 
     public static boolean isValid(String streeName){
        return StreetNameValidator.indexStreetNameValid(streeName);
    }
}
