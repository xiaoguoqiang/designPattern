package iterator;

import java.util.Iterator;

/**
 * Created by liqianga on 2018/1/24.
 */
public class LunchMenuIterator implements Iterator {

    private Menu[] menus;
    private int position = 0;

    public LunchMenuIterator(Menu[] menus){
        this.menus = menus;
    }

    public boolean hasNext() {
        if(position > 0 && position < menus.length && menus[position] != null){
            return true;
        }
        return false;
    }

    public Object next() {
        return menus[position];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
