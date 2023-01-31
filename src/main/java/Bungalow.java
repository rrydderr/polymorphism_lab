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
    public String priceOfBungalow() {
        int price = this.houseNumber * 5;
        return "The price of this Bungalow is £" + price;
    }

    //method overload
    public String priceOfBungalow(int reducedPrice) {
        return "The price of this Bungalow has reduced to £" + reducedPrice;
    }


    //method overridden from Building
    @Override
    public String getLocation() {
        return "This building is located on " + this.location;
    }

}


