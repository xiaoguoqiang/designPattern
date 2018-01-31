package composite;

import java.util.Iterator;

/**
 * Created by liqianga on 2018/1/31.
 */
public class NullIterator implements Iterator {

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
