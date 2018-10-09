package com.cgi.bootcamp.lib.interfaces.customerinfo;

import java.util.List;

public class Customer {
    public String customerId;
    public String firstName;
    public String lastName;
    public String DOB;
    public String maritalStatus;
    public Spouse spouse;
    public List<PhoneNumber> phoneNumbers;
    public List<Address> addresses;
}
