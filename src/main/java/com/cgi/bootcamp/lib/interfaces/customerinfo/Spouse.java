package com.cgi.bootcamp.lib.interfaces.customerinfo;

public interface Spouse {
    String getFirstName();
    String getLastName();
    boolean isCustomer();
    //If spouse is a customer, return a customer object for the spouse
    Customer getSpouseCustomerObj();
}
