import java.util.Scanner;

public class SquareDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what are the side lengths? ");
        double side = scan.nextDouble();
        Square s = new Square(side);
        System.out.println(s.calculateArea());
        System.out.println(s);

    }
}
