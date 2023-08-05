package com.hami.design_pattern.adapter_pattern.adapter;

import com.hami.design_pattern.adapter_pattern.Xpay;
import com.hami.design_pattern.adapter_pattern.XpayImpl;

public class TestAdapterPattern {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        setProp(xpay);
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);

    }

    private static void setProp(Xpay xpay) {
        xpay.setAmount(234.345);
        xpay.setCardCVVNo((short) 234);
        xpay.setCardExpMonth("12");
        xpay.setCardExpYear("24");
        xpay.setCustomerName("Reza Rahmani");
        xpay.setCreditCardNo("234529482021834043");
    }

    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCardExpMonthDate());
    }
}
