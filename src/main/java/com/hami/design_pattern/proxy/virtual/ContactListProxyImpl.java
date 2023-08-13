package com.hami.design_pattern.proxy.virtual;

import java.util.List;
import java.util.Objects;

public class ContactListProxyImpl implements ContactList{
    private ContactList contactList;
    @Override
    public List<Employee> getEmpList() {
        if (Objects.isNull(contactList)) {
            System.out.println("Creating List of Employee and fetching list of them");
            contactList = new ContactListImpl();
        }

        return contactList.getEmpList();
    }
}
