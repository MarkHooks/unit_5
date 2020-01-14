public class Hardware {
    public static void main(String[] args){
        Item i1 = new Item("4343", "Circular Saw", 122.50);
        Item i2 = new Item("9876", "Hammer", 19.75);
        Item i3 = new Item("1239", "Level", 12.99);

        System.out.println(i1.getTotalPrice(2) +i2.getTotalPrice(5)+i3.getTotalPrice(12));


        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
