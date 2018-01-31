package composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by liqianga on 2018/1/31.
 */
public class ComponetIterator implements Iterator {

    Stack menuStack = new Stack();

    public ComponetIterator(Iterator iterator) {
        menuStack.push(iterator);
    }

    public boolean hasNext() {
        if (menuStack.isEmpty()) {
            return false;
        } else {
            //从堆栈顶层拿出一个元素
            Iterator iterator = (Iterator) menuStack.peek();
            if (!iterator.hasNext()) {
                //若取出的元素没有下一个，则从栈中弹出
                menuStack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) menuStack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                menuStack.push(menuComponent.creatIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
