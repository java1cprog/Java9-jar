package org.my.validator.street.name;

public interface StreetNameValidator {
    static boolean indexStreetNameValid(String streeName){
        return null != streeName && !streeName.trim().isEmpty();
    }
}
