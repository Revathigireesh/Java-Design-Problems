import java.util.ArrayList;

public class Restaurents {
    private String name;
    private boolean isopen;
    public ArrayList<FoodItem> menu;

    public Restaurents(String restaurentName, boolean isopen) {
        this.name = restaurentName;
        this.isopen = isopen;
        menu=new ArrayList<>();
    }

    public void addFoodItem(FoodItem item){
        menu.add(item);
    }
    public ArrayList<FoodItem> getMenu(){
        return menu;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public String getName() {
        return name;
    }
}
