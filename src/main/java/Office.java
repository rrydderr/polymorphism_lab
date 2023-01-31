import java.time.LocalDate;

public class Office extends Building {



        //properties unique to office
        private String companyName;
        private int officeCubicles;

        //properties unique to Office
        public Office(int numberOfRooms,
                      LocalDate dateOfConstruction,
                      String location,
                      String companyName,
                      int officeCubicles) {
        super(numberOfRooms, dateOfConstruction, location);
        this.companyName = companyName;
        this.officeCubicles = officeCubicles;
        }


        //method to calculate how many employees there are
        public int numberOfEmployees(){
                return this.officeCubicles/2;
        }


}
