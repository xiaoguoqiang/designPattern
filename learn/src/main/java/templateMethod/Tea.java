package templateMethod;

public class Tea extends CaffeineBeverageWithHook {

    @Override
    void brew(){
        System.out.println("Tea brew");
    }

    @Override
    void addConditment() {
        System.out.println("Tea add conditment");
    }

    @Override
    boolean customerWanterConditments() {
        return true;
    }
}
