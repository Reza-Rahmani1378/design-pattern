package com.hami.design_pattern.proxy.virtual;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList contactList;

}
