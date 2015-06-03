package java.de.ko.designPatterns.proxyPattern.rmi;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws Exception{

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        int count = Integer.parseInt(args[1]);
        String name = args[0];

        GumballMachine gumballMachine = new GumballMachine(name, count);

        Naming.rebind("//" + name + "/gumballmachine", gumballMachine);
    }
}
