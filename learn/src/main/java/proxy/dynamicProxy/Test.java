package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args){

    }

    public static PersionBean getOwnerProxy(PersionBean subject, InvocationHandler handler){
       return (PersionBean)Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),new OwnerProxy(subject));
    }
}
