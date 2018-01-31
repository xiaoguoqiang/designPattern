package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by liqianga on 2018/1/31.
 */
public class Menu extends MenuComponent {
    private ArrayList childMenu;
    private String name;
    private String description;

    public Menu(String name,String description){
        this.name = name;
        this.description = description;
        childMenu = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        childMenu.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        childMenu.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) childMenu.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        Iterator iterator = childMenu.iterator();
        MenuComponent m;
        while(iterator.hasNext()){
            m = (MenuComponent) iterator.next();
            m.print();
        }
    }

    @Override
    public Iterator creatIterator() {
        return new ComponetIterator(childMenu.iterator());
    }
}
