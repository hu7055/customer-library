package com.cgi.bootcamp.lib.legacy;

import com.cgi.bootcamp.lib.interfaces.records.AddressRec;
import com.cgi.bootcamp.lib.interfaces.records.PhoneNumberRec;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class LegacyCustomerRecsParser {

    public static List<LegacyCustomerRecs> parse(File file) throws IOException {
        List<LegacyCustomerRecs> result = new ArrayList<>();
        BufferedReader br = Files.newBufferedReader(file.toPath());

        LegacyCustomerRecs custRecs = null;
        while (br.ready()) {
            String currLine = br.readLine();
            String recId = currLine.substring(0, 2);
            switch (recId) {
                case "CS":
                    custRecs = new LegacyCustomerRecs();
                    LegacyCustomerRec currCust = (LegacyCustomerRec) custRecs.getCustomerRec();
                    currCust.setLine(currLine);
                    currCust.setCustomerIdField(currLine.substring(2, 12));
                    currCust.setFirstNameField(currLine.substring(12, 52));
                    currCust.setLastNameField(currLine.substring(52, 92));
                    currCust.setDOBField(currLine.substring(92, 98));
                    currCust.setMaritalStatusField(currLine.substring(98, 99));
                    result.add(custRecs);
                    break;

                case "PS":
                    if (currLine.substring(0, 3).equals("PSC")) {
                        LegacySpouseCustomerRec spouseCustomer = (LegacySpouseCustomerRec) custRecs.getSpouseCustomerRec();
                        spouseCustomer.setLine(currLine);
                        spouseCustomer.setCustomerId(currLine.substring(3, 13));

                    } else {
                        LegacySpouseRec spouseRec = (LegacySpouseRec) custRecs.getSpouseRec();
                        spouseRec.setLine(currLine);
                        spouseRec.setFirstNameField(currLine.substring(2, 42));
                        spouseRec.setLastNameField(currLine.substring(42, 82));
                    }
                    break;

                case "PA":
                    List<AddressRec> addressRecs = custRecs.getAddressRecs();
                    LegacyAddressRec addressRec = new LegacyAddressRec();
                    addressRec.setLine(currLine);
                    addressRec.setNumber(currLine.substring(2, 8));
                    addressRec.setStreetName(currLine.substring(8, 48));
                    addressRec.setCity(currLine.substring(48, 88));
                    addressRec.setCountry(currLine.substring(88, 118));
                    addressRec.setCode(currLine.substring(118, 126));
                    addressRecs.add(addressRec);
                    break;

                case "PP":
                    List<PhoneNumberRec> phoneRecs = custRecs.getPhoneRecs();
                    LegacyPhoneNumberRec phoneRec = new LegacyPhoneNumberRec();
                    phoneRec.setLine(currLine);
                    phoneRec.setPhoneNumber(currLine.substring(2));
                    phoneRecs.add(phoneRec);
                    break;
            }


        }

        return result;
    }
}
