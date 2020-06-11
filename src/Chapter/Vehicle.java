package Chapter;

public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;

    void range(){
        System.out.println("Range is " + fuelcap *mpg);
    }
}

class AddMeth{

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passenger = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passenger = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("minivan can carry +" + minivan.passenger + ".");
        minivan.range();

        System.out.println("sportscar can carry " + sportscar.passenger + ".");
        sportscar.range();
    }
}
