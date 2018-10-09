package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.AbstractRec;
import com.cgi.bootcamp.lib.interfaces.records.PhoneNumberRec;

public class LegacyPhoneNumberRec extends AbstractRec implements PhoneNumberRec {
    private String phoneNumber;

    @Override
    public String getNumberField() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
