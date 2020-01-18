public class CarTrip {
    double myStartOdometer;
    double myEndOdometer;
    double myTime;
    double myGallonsUsed;

    public CarTrip(){
        myGallonsUsed = 0.0;
        myEndOdometer = 0.0;
        myTime = 0.0;
        myStartOdometer=0.0;
    }

    public CarTrip(double myStartOdometer, double myEndOdometer, double myTime, double myGallonsUsed){
        this.myStartOdometer = myStartOdometer;
        this.myTime = myTime;
        this.myEndOdometer = myEndOdometer;
        this.myGallonsUsed = myGallonsUsed;
    }

    public double getMyStartOdometer(){
        return myStartOdometer;
    }
    public double getMyEndOdometer(){
        return myEndOdometer;
    }
    public double getMyTime(){
        return myTime;
    }
    public double getMyGallonsUsed(){
        return myGallonsUsed;
    }
    public double getGasMileage(){
        if(myGallonsUsed == 0.0){
            return myGallonsUsed;
        }
        else{
            return (myEndOdometer - myStartOdometer)/myGallonsUsed;
        }
    }
    public double getTotalGasPrice(double pricePerGallon){
        return myGallonsUsed * pricePerGallon;
    }
    public double getTripDistance(){
        return myEndOdometer - myStartOdometer;

    }

    public double getAverageSpeed() {
        if(myTime == 0.0){
            return myTime;
        }
        else{
            return(myEndOdometer - myStartOdometer)/ myTime;
        }
    }
    public String toString(){
        return "distance traveled: " + (myEndOdometer - myStartOdometer) +  "miles";

    }
    public void setMyEndOdometer(double myEndOdometer){
        this.myEndOdometer = myEndOdometer;
    }
    public void setMyStartOdometer(double myEndOdometer){
        this.myEndOdometer = myEndOdometer;
    }
    public void setMyGallonsUsed(double myGallonsUsed){
        this.myGallonsUsed = myGallonsUsed;
    }
    public void setMyTime(double myTime){
        this.myTime = myTime;
    }

}
