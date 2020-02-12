public class Account {
    private String last;
    private String first;
    private int acctNum;
    private double balance;
    public Account(String last, String first, double balance){
        this.first = first;
        this.last = last;
        acctNum = (int)(Math.random()*1000)-1;
        this.balance = balance;

    }
    public Account(Account account){
        this(account.first, account.last, account.balance);
    }
    public Account(){
        this("","",0.0);
    }
    public void deposit(double amount){
        balance +=amount;
    }
    public boolean withdrawal(double amount){
        if(amount > balance){
            return false;
        }
        else{
            balance -=amount;
            return true;
        }
    }
    public String getFirst(){
        return first;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }
    public String toString(){
        return  "Customer name: " + first + " " +last +" \n Account num: " + acctNum +" \ncurrent balance: $" +balance;
    }
}
