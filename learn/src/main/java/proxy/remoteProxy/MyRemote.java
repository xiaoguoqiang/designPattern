package proxy.remoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by liqianga on 2018/2/9.
 */
public interface MyRemote extends Remote {
    public String helloRmic() throws RemoteException;
}
