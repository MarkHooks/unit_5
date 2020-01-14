public class Square {
    private double side;
    public Square(double side){
        this.side = side;
    }

    public String toString(){
        return "Square with side " +side;
    }
    public double calculateArea(){
        return side * side;
    }

}
