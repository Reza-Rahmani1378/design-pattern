package com.hami.design_pattern.proxy.protection;

public class TestReportGeneratorProtectionProxy {
    public static void main(String[] args) {
        Owner owner = new Owner();
        ReportGeneratorProtectionProxy reportGenerator = new ReportGeneratorProtectionProxyImpl(owner);
        owner.setReportGenerator(reportGenerator);

        Employee employee = new Employee();
        reportGenerator = new ReportGeneratorProtectionProxyImpl(employee);
        employee.setReportGenerator(reportGenerator);
        System.out.println("Searching for Owner");
        System.out.println(owner.generateDailyReport());
        System.out.println("Searching for Employee");
        System.out.println(employee.generateDailyReport());

    }
}
