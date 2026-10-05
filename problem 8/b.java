class Restaurant{
    double price = -1;
    Restaurant(double price){
        this.price = price;
    }
    double calculateTotalBill(){
        return price*1.1;
    }
    int estimateDelivdryTime(int time){
        time = 40;
        return time;
    }
}
class Fast_Food extends Restaurant{
    Fast_Food(double price){
        super(price);
        this.price = price;
    }
    @Override
    int estimateDelivdryTime(int time) {
        // TODO Auto-generated method stub
        return 20;
    }
    @Override 
    double calculateTotalBill(){
        return price*1.15;
    }
}
class Fine_Dining extends Restaurant{
    Fine_Dining(double price){
        super(price);
        this.price = price;
    }
    @Override
    int estimateDelivdryTime(int time) {
        // TODO Auto-generated method stub
        return 60;
    }
}