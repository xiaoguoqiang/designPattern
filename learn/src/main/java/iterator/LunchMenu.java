package iterator;

import java.util.Iterator;

/**
 * Created by liqianga on 2018/1/24.
 */
public class LunchMenu implements MenuIterator{
    private int position = 0;
    private int length = 10;
    private Menu[] lunchMenu = new Menu[length];

    public LunchMenu(){
        addItem(new Menu("Meate","Pig",false));
        addItem(new Menu("Steak","Bull",false));
    }

    public void addItem(Menu newMenu){
        lunchMenu[position] = newMenu;
        position++;
    }

    public Iterator createIterator() {
        return new LunchMenuIterator(this.lunchMenu);
    }
}
