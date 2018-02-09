package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by liqianga on 2018/2/9.
 */
public class Test {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Hello", service);
            System.out.println("llllll");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
