package Chapter;

public class TwoVehicles {
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

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("miniva car carry " + minivan.passenger + "with a range of "
                + range1);

        System.out.println("miniva car carry " + sportscar.passenger + "with a range of "
                + range2);
    }
}
