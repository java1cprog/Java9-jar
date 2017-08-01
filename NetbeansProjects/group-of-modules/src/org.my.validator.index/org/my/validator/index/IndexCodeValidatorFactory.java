package org.my.validator.index;

import org.my.validator.index.imp.IndexCodeValidatorImpl;

public enum IndexCodeValidatorFactory {
    INSTACNE;
    private final IndexCodeValidator validator;

    private IndexCodeValidatorFactory() {
        this.validator = new IndexCodeValidatorImpl();
    }

    public IndexCodeValidator getValidator() {
        return validator;
    }
    
    public static boolean isValid(String indexCode){
        return INSTACNE.getValidator().indexCodeIsValid(indexCode);
    }
    
}
