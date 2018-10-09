package com.cgi.bootcamp.lib.interfaces.records;

import java.util.List;

public interface CustomerRecs {
    CustomerRec getCustomerRec();
    SpouseRec getSpouseRec();
    SpouseCustomerRec getSpouseCustomerRec();
    List<AddressRec> getAddressRecs();
    List<PhoneNumberRec> getPhoneRecs();
}
