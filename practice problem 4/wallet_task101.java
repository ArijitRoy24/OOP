public class wallet_task101 {
    int balance1 = 500, balance2 = 1000;
    double deposit(double balance, double ammount){
        if (balance == balance1){
            return balance1 - ammount;
        }
        else if (balance == balance2){
            return balance2 - ammount;
        }
        return -1;
    }
    public static void main(String [] args){
        wallet_task101 t = new wallet_task101();
        System.out.println(t.deposit(1000,200));
    }
}
