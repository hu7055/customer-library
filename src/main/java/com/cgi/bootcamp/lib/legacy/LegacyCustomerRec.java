package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.AbstractRec;
import com.cgi.bootcamp.lib.interfaces.records.CustomerRec;

public class LegacyCustomerRec extends AbstractRec implements CustomerRec {
    private String CustomerIdField;
    private String FirstNameField;
    private String LastNameField;
    private String DOBField;
    private String MaritalStatusField;

    public String getCustomerIdField() {
        return CustomerIdField;
    }

    public void setCustomerIdField(String customerIdField) {
        CustomerIdField = customerIdField;
    }

    public String getFirstNameField() {
        return FirstNameField;
    }

    public void setFirstNameField(String firstNameField) {
        FirstNameField = firstNameField;
    }

    public String getLastNameField() {
        return LastNameField;
    }

    public void setLastNameField(String lastNameField) {
        LastNameField = lastNameField;
    }

    public String getDOBField() {
        return DOBField;
    }

    public void setDOBField(String DOBField) {
        this.DOBField = DOBField;
    }

    public String getMaritalStatusField() {
        return MaritalStatusField;
    }

    public void setMaritalStatusField(String maritalStatusField) {
        MaritalStatusField = maritalStatusField;
    }
}
