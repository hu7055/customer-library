package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.*;

import java.util.ArrayList;
import java.util.List;

public class LegacyCustomerRecs implements CustomerRecs {

    private final List<AddressRec> addressRecs;
    private final List<PhoneNumberRec> phoneNumberRecs;
    private LegacySpouseRec spouseRec;
    private LegacySpouseCustomerRec spouseCustomerRec;
    private CustomerRec customerRec;

    public LegacyCustomerRecs() {
        customerRec = new LegacyCustomerRec();
        spouseRec = new LegacySpouseRec();
        spouseCustomerRec = new LegacySpouseCustomerRec();
        addressRecs = new ArrayList<AddressRec>();
        phoneNumberRecs = new ArrayList<PhoneNumberRec>();
    }

    public CustomerRec getCustomerRec() {
        return customerRec;
    }

    public SpouseRec getSpouseRec() {
        return spouseRec;
    }

    public SpouseCustomerRec getSpouseCustomerRec() {
        return spouseCustomerRec;
    }

    public List<AddressRec> getAddressRecs() {
        return addressRecs;
    }

    public List<PhoneNumberRec> getPhoneRecs() {
        return phoneNumberRecs;
    }
}
