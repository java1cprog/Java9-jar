package org.my.validator.index.imp;

import org.my.validator.index.IndexCodeValidator;

public class IndexCodeValidatorImpl implements IndexCodeValidator{
    @Override
    public boolean indexCodeIsValid(String indexCode) {
        return indexCode != null && indexCode.length() == 3;
    }
}
