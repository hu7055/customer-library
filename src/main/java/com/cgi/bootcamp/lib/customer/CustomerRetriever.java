package com.cgi.bootcamp.lib.customer;

import com.cgi.bootcamp.lib.legacy.LegacyCustomerRecs;
import com.cgi.bootcamp.lib.legacy.LegacyCustomerRecsParser;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class CustomerRetriever {

    List<LegacyCustomerRecs> custRecsList;

    public CustomerRetriever(String filePath) {
        try {
            custRecsList = LegacyCustomerRecsParser.parse(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
