class Wallet{
    private int balance;
    String id = "New Id!";
    Wallet(){
        balance = 0;        
    }
    Wallet(int balance){
        this.balance = balance;
    }
}
public class wallet_task3{
    public static void main(String []args){
        Wallet yy = new Wallet(), zz = new Wallet(10);        
    }
}