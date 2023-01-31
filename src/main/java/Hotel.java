import java.time.LocalDate;

public class Hotel extends Building implements IRent{

    //Properties unique to Hotel
    private int starRating;
    private boolean hasSwimmingPool;

    //constructor

    public Hotel(int numberOfRooms,
                 LocalDate dateOfConstruction,
                 String location,
                 int starRating,
                 boolean hasSwimmingPool
                 ) {
        super(numberOfRooms, dateOfConstruction, location);
        this.starRating = starRating;
        this.hasSwimmingPool = hasSwimmingPool;

    }

    @Override
    public String getLocation(){
        return "This Hotel is located on " + this.location;
    }

    @Override
    public String rent(int days) {
        return "You are able to rent a room in this hotel for " + days + " days.";
    }

}