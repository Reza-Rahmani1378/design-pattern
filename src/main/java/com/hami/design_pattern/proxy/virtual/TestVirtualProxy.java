package com.hami.design_pattern.proxy.virtual;

import java.util.List;

public class TestVirtualProxy {
    public static void main(String[] args) {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("Hammi System Sharif Company",
                "Iran",
                "+98 9911049181",
                contactList);
        System.out.println("Company Name :" + company.getCompanyName());
        System.out.println("Company Address :" + company.getCompanyAddress());
        System.out.println("Company Contact Number :" + company.getCompanyContactNo());
        System.out.println("Searching For Contact List Company");
        contactList = company.getContactList();
        List<Employee> employees = contactList.getEmpList();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
