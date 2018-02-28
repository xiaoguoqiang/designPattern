package proxy.remoteProxy;

import proxy.remoteProxy.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by liqianga on 2018/2/9.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
    }

    public String helloRmic() {
        return "Hello world";
    }
}
