import java.util.ArrayList;

public class Town {
    private ArrayList<Building>buildings;

    public Town(){
        this.buildings = new ArrayList<>();
    }

    public int countBuildings(){
        return this.buildings.size();
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }


}
