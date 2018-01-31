package composite;

/**
 * Created by liqianga on 2018/1/31.
 */
public class Waiter {
    MenuComponent allMenu;

    public Waiter(MenuComponent allMenu){
        this.allMenu = allMenu;
    }

    public void print(){
        allMenu.print();
    }


}
