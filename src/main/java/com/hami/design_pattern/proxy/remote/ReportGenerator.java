package com.hami.design_pattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote {

    String generateDailyReport() throws RemoteException;
}
