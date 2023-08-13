package com.hami.design_pattern.proxy.protection;

public class Employee implements Staff{
    private ReportGeneratorProtectionProxy reportGenerator;
    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProtectionProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport() {
        try {
                return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
