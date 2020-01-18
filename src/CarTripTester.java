public class CarTripTester {
    public static void main(String[] args){

        CarTrip myTrip = new CarTrip(0.0, 100.0, 2.0, 10.0);



        CarTrip aTrip = new CarTrip();



        System.out.println(myTrip.getTripDistance());

        System.out.println(aTrip.getTripDistance());

        System.out.println();

        System.out.println(myTrip.getAverageSpeed());

        System.out.println(aTrip.getAverageSpeed());

        System.out.println();

        System.out.println(myTrip.getGasMileage());

        System.out.println(aTrip.getGasMileage());

        System.out.println();

        System.out.println(myTrip.getTotalGasPrice(2.75));

        System.out.println(myTrip.getTotalGasPrice(2.75));

        System.out.println();

        System.out.println(myTrip.toString());

        System.out.println(aTrip.toString());

    }
}
