package templateMethod;

public class Coffe extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Coffe brew");
    }

    @Override
    void addConditment() {
        System.out.println("Coffe add conditment");
    }

    @Override
    boolean customerWanterConditments() {
        return true;
    }
}
