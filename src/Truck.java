public class Truck {
    public String truckId;
    public double odometer;
    public double mpg;
    public double fuel;
    private static double totalfuel;
    private final double CAPACITY = 20.0;
    public Truck(String ID){
        truckId = ID;

    }
    public Truck(double odometer, double fuel, double mpg){
        this.odometer = odometer;
        this.fuel = fuel;
        this.mpg = mpg;
        this.truckId = truckId;

    }
    public double getCAPACITY(){
        return CAPACITY;
    }
    public double getMpg(){
        return mpg;
    }
    public double getFuel(){
        return fuel;
    }
    public double getOdometer(){
        return odometer;
    }
    public String getTruckId(){
        return truckId;
    }
    public static double getTotalfuel(){
        return totalfuel;
    }
    public void setMpg(double mpg){
        this.mpg = mpg;
    }
    public boolean enoughFuel(double miles){
        boolean e = false;

        if ((mpg*fuel) >= miles){
            e = true;
        }
        return e;
    }
    public String fill(){
        totalfuel += (CAPACITY - fuel);
        fuel = CAPACITY;
        return "success.";
    }
    public String fill(double  gallons){
        if(fuel + gallons <= CAPACITY){
            totalfuel += gallons;
            fuel += gallons;

        }
        return "success.";
    }
    public String drive(double miles){
        boolean x = false;
        if(mpg == 0.0){
            fuel -= 0;
        }else{
            x = true;
        }
        if(enoughFuel(miles) && x){
            odometer += miles;
            fuel -= miles/mpg;
            return "success.";
        }else{
            return "truck " + truckId + " does not have enogh fuel to drive " + miles + " miles.";
        }
    }
    public String toString(){
        return "truck: " + truckId +"\n odometer: " +odometer + "\n miles per gallon: " + mpg + "\n fuel; " + fuel;
    }

}
