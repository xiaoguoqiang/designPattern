package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerProxy implements InvocationHandler {

    private PersionBean persionBean;

    public OwnerProxy(PersionBean persionBean) {
        this.persionBean = persionBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().equals("setRate")) {
                throw new IllegalAccessException();
            } else {
                return method.invoke(proxy, args);
            }
        }  catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
