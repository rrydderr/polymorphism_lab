import java.time.LocalDate;

public class Office extends Building {
        public Office (int numberOfRooms, LocalDate dateOfConstruction, String location){
            super(numberOfRooms, dateOfConstruction, location);
        }


        //properties unique to office
        String companyName;
        int officeCubicles;

        //properties unique to Office
        public Office(int numberOfRooms, LocalDate dateOfConstruction, String location, String companyName, int officeCubicles) {
                super(numberOfRooms, dateOfConstruction, location);
                this.companyName = companyName;
                this.officeCubicles = officeCubicles;
        }


        //method to calculate how many employees there are
        public int numberOfEmployees(){
                int employeeCount = officeCubicles / 2;
                return employeeCount;
        }


}
