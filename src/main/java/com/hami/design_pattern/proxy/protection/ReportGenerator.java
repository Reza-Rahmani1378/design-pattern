package com.hami.design_pattern.proxy.protection;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote {

    String generateDailyReport() throws RemoteException;
}
