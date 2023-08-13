package com.hami.design_pattern.proxy.protection;

public interface Staff {
    boolean isOwner();
    void setReportGenerator(ReportGeneratorProtectionProxy reportGenerator);
}
