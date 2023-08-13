package com.hami.design_pattern.proxy.remote.client;

import com.hami.design_pattern.proxy.remote.ReportGenerator;

import java.rmi.Naming;

public class ReportGeneratorClient {
    public static void main(String[] args) {
        generateReport();
    }

    public static void generateReport() {
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://localhost:8787/PizzaCompanyRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
