import java.time.LocalDate;

public class StudentFlat extends Building {

    //properties which are unique to StudentFlat
    protected int numberOfPartiesHosted;
    private String universityName;


    //new constructor
    public StudentFlat (
            int numberOfRooms,
            LocalDate dateOfConstruction,
            String location,
            int numberOfPartiesHosted,
            String universityName){
        super(numberOfRooms, dateOfConstruction, location);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
        this.universityName = universityName;
    }


    //method to host a party
    public void hostParty(){
        numberOfPartiesHosted++;
    }



    //method overridden from building
    @Override
    public String getLocation(){
        return "This building is in a quiet cul-de-sac next to " + this.location;
    }

}