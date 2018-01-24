package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liqianga on 2018/1/24.
 */
public class BreakFastMenu implements MenuIterator {
    private List<Menu> menuItems = new ArrayList<Menu>();

    public BreakFastMenu(){
        menuItems.add(new Menu("Pink","Blue Pink",true));
        menuItems.add(new Menu("Peach","Green Peach",true));
    }


    public Iterator createIterator() {
        return this.menuItems.iterator();
    }
}
