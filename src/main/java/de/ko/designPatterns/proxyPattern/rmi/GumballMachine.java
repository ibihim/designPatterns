package java.de.ko.designPatterns.proxyPattern.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    private static final long serialVersionUID = 2L;

    String location;
    int count;
    State state;

    public GumballMachine(String location, int count) throws RemoteException{
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }
}
