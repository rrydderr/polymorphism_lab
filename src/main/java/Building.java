import java.time.LocalDate;

public abstract class Building {
    private int numberOfRooms;
    private LocalDate dateOfConstruction;
    protected String location;

//constructor
    public Building(int numberOfRooms,
                    LocalDate dateOfConstruction,
                    String location){
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
        this.location = location;

    }

    //getters and setters


    //method to give location of the building
    public String getLocation(){
        return "This building is located on " + this.location;
    }

}
