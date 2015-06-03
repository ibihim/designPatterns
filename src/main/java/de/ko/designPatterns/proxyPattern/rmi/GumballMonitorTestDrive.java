package java.de.ko.designPatterns.proxyPattern.rmi;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

    public static void main(String[] args) throws Exception{
        String[] location = {
                "rmi://santafe.mightybumball.com/gumballmachine",
                "rmi://berlin.mightybumball.com/gumballmachine",
                "rmi://rome.mightybumball.com/gumballmachine"
        };

        GumballMonitor[] gumballMonitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
            gumballMonitor[i] = new GumballMonitor(gumballMachineRemote);
            System.out.println(gumballMonitor[i]);
        }

        for(GumballMonitor monitor : gumballMonitor) {
            monitor.report();
        }
    }
}
