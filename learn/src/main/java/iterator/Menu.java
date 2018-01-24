package iterator;

/**
 * Created by liqianga on 2018/1/24.
 */
public class Menu {
    private String name;
    private String description;
    private boolean isVegetation;

    public Menu(String name, String description, boolean isVegetation){
        this.name = name;
        this.description = description;
        this.isVegetation = isVegetation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetation() {
        return isVegetation;
    }

    public void setVegetation(boolean vegetation) {
        isVegetation = vegetation;
    }
}
