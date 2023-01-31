import java.util.ArrayList;
import java.util.List;

public class BookingWebsite {
    private String name;
    private List<IRent> buildings;

    public BookingWebsite (String name){
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public void addbuilding (IRent building) {
        this.buildings.add(building);
    }

    public List<IRent> getBuildings(){
        return this.buildings;
    }

}
