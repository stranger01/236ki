package methods;


class Vehicles {
    int passenger;
    int fuelcap;
    int mpg;

    //this is a constructor for vehicle

    Vehicles(int p, int f, int m) {
        passenger = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles){
        return (double) miles / mpg;
    }

}

public class VehicleWithParams {
    public static void main(String[] args) {

        Vehicles minivan = new Vehicles(7 , 16 , 21);
        Vehicles sportscar = new Vehicles(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go  " + dist + "miles minivan needs "+ gallons + "gallons of fuel");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go  " + dist + "miles sportscar needs " + gallons + "gallons of fuel");

    }
}
