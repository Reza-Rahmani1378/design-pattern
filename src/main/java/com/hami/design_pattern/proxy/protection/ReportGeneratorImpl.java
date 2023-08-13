package com.hami.design_pattern.proxy.protection;

import com.hami.design_pattern.proxy.Utils;

import java.io.Serial;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {

    @Serial
    private static final long serialVersionUID = 3107413009881629428L;

    protected ReportGeneratorImpl() throws RemoteException {
    }

    @Override
    public String generateDailyReport() throws RemoteException {
        return Utils.getString();
    }



    public static void main(String[] args) {
        try {
            ReportGenerator reportGenerator = new ReportGeneratorImpl();
            LocateRegistry.createRegistry(6868);
            Naming.rebind("//localhost:6868/PizzaCompanyRemoteGenerator",reportGenerator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
