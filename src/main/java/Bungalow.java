import java.time.LocalDate;

public class Bungalow extends Building {
    public Bungalow(int numberOfRooms, LocalDate dateOfConstruction, String location) {
        super(numberOfRooms, dateOfConstruction, location);
    }

    //properties unique to Bungalow
    boolean centralHeating;
    int houseNumber;


    //new constructor
    public Bungalow(int numberOfRooms, LocalDate dateOfConstruction, String location, boolean centralHeating, int houseNumber) {
        super(numberOfRooms, dateOfConstruction, location);
        this.centralHeating = centralHeating;
        this.houseNumber = houseNumber;
    }


    //method for calculating price of bungalow
    public int priceOfBungalow(){
        int price = this.houseNumber * 5;
        return price;
    }


//method overridden from Building
    @Override
    public String getLocation(){
        return "This property is located on " + this.location;
        }
    }

