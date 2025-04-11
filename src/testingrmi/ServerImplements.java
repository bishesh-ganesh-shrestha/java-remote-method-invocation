package testingrmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{
    public ServerImplements() throws RemoteException{
        super();
    }
    
    public int add(int x, int y){
        return x+y;
    }
}
