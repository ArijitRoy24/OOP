// package practice problem 5;

public class car {
    String owner, brand_name, serial_number ;
    static int fuel = 100;
    void start(){
        System.out.println("the car is started");
    }
    void end(){
        System.out.println("the car is stopped");
    }
    int fuelchecker(){
        return fuel;
    }
}
