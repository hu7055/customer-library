package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.AbstractRec;
import com.cgi.bootcamp.lib.interfaces.records.SpouseRec;

public class LegacySpouseRec extends AbstractRec implements SpouseRec {
    private String firstNameField;
    private String lastNameField;

    @Override
    public String getFirstNameField() {
        return firstNameField;
    }

    @Override
    public String getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(String lastNameField) {
        this.lastNameField = lastNameField;
    }

    public void setFirstNameField(String firstNameField) {
        this.firstNameField = firstNameField;
    }

}
