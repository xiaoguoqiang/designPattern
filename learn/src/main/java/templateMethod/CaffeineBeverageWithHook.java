package templateMethod;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWanterConditments()){
            addConditment();
        }


    }

    abstract void brew();

    abstract void addConditment();

    void boilWater(){
        System.out.println("boil water");
    }

    void pourInCup(){
        System.out.println("pour into cup");
    }

    boolean customerWanterConditments(){
        return false;
    }

}
