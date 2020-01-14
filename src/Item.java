public class Item {
    private String partNumber;
    private String description;
    private double price;
    public Item(String PartNumber, String description, double price){
        this.partNumber = PartNumber;
        this.description = description;
        this.price = price;
        if(price<0){
            price = 0;
        }
    }
    public String toString(){
        return "Item: " +partNumber+". Description: "+ description+". Price:" +price;
    }
    public double getTotalPrice(int num){
        if(num<0) {
            num = 0;
        }
        return price*num;
    }

}
