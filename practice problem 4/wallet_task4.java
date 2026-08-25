class Wallet{
    private double balance;
    static String withdrawel;
    String id = "New Id!";
    Wallet(){
        balance = 0;        
    }
    Wallet(int balance){
        this.balance = balance;
    }
    void withdraw(double ammount){
        if (ammount<=this.balance) this.balance-=ammount;
    }
    void withdraw(double ammount, String s){
        if (ammount<=this.balance) this.balance-=ammount;
        withdrawel = s;
    }
}
public class wallet_task4{
    public static void main(String []args){
        Wallet yy = new Wallet(), zz = new Wallet(10);        
    }
}