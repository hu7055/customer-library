package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.AbstractRec;
import com.cgi.bootcamp.lib.interfaces.records.AddressRec;

public class LegacyAddressRec extends AbstractRec implements AddressRec {
    private String number;
    private String streetName;
    private String city;
    private String country;
    private String code;

    @Override
    public String getNumberField() {
        return number;
    }

    @Override
    public String getStreetNameField() {
        return streetName;
    }

    @Override
    public String getCityField() {
        return city;
    }

    @Override
    public String getCountryField() {
        return country;
    }

    @Override
    public String getCodeField() {
        return code;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
