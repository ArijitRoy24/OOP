class Wallet{
    private int balance;
    void deposit(int ammount){
        this.balance+=ammount;
    }
    void withdraw(int ammount){
        if (ammount<=this.balance){
            this.balance-=ammount;
        }
        else System.out.println("-1");
    }
}
public class wallet_task2{
    public static void main(String []args){
        Wallet yy = new Wallet();
        
    }
}