package com.hami.design_pattern.proxy.protection;

import java.rmi.Naming;

public class ReportGeneratorProtectionProxyImpl implements ReportGeneratorProtectionProxy{

    private final Staff staff;

    public ReportGeneratorProtectionProxyImpl(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()) {
            ReportGenerator reportGenerator;

            try {
                reportGenerator = (ReportGenerator) Naming.lookup("rmi://localhost:6868/PizzaCompanyRemoteGenerator");
                return reportGenerator.generateDailyReport();
  
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        } else
            return "Authorization is needed...";
    }
}
