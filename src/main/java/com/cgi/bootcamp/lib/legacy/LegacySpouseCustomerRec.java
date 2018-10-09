package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.AbstractRec;
import com.cgi.bootcamp.lib.interfaces.records.SpouseCustomerRec;

public class LegacySpouseCustomerRec extends AbstractRec implements SpouseCustomerRec {
    private String CustomerId;

    @Override
    public String getCustomerIDField() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

}
