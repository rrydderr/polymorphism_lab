import java.time.LocalDate;

public class Bungalow extends Building {

    //properties unique to Bungalow
    private boolean centralHeating;
    private int houseNumber;


    //new constructor
    public Bungalow(int numberOfRooms,
                    LocalDate dateOfConstruction,
                    String location,
                    boolean centralHeating,
                    int houseNumber) {
        super(numberOfRooms, dateOfConstruction, location);
        this.centralHeating = centralHeating;
        this.houseNumber = houseNumber;
    }


    //method for calculating price of bungalow
    public int priceOfBungalow(){
        return this.houseNumber * 5;
    }


//method overridden from Building
    @Override
    public String getLocation(){
        return "This property is located on " + this.location;
        }
    }

