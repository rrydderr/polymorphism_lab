import java.time.LocalDate;

public class Office extends Building implements IRent {



        //properties unique to office
        private String companyName;
        private int officeCubicles;


        public Office(int numberOfRooms,
                      LocalDate dateOfConstruction,
                      String location,
                      String companyName,
                      int officeCubicles) {
        super(numberOfRooms, dateOfConstruction, location);
        this.companyName = companyName;
        this.officeCubicles = officeCubicles;
        }

        public String getLocation(){
                return "This office is located on " + this.location;
        }


        public String getLocation(String relocation){
                return "This office has relocated to " + relocation;
        }


        //method to calculate how many employees there are
        public int numberOfEmployees(){
                return this.officeCubicles/2;
        }

        @Override
        public String rent(int days) {
                return "You are able to rent this office for "+ days + " days.";
        }
}
