package java.de.ko.designPatterns.proxyPattern.rmi;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() throws RemoteException{
        System.out.println("Gumball location: " + gumballMachine.getLocation());
        System.out.println("Gumball count: " + gumballMachine.getCount());
    }
}
