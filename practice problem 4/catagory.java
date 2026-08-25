// package practice problem 4;
import java.util.Scanner;

public class catagory {
    void searchproduct(String catagory){
        System.out.println(catagory);
    }
    void searchproduct(int lowprice, int hiprice){
        System.out.println("products between " + lowprice +" and " + hiprice);
    }
    void brand(String brandString){
        System.out.println(brandString);
    }
    void searchproduct(String catagory, int lowprice, int hiprice){
        System.out.println(catagory + "\n"+lowprice + "\n"+hiprice);
    }
    void searchproduct(String catagory, int lowprice, int hiprice, String brand){
        System.out.println(catagory + "\n"+lowprice + "\n"+hiprice + brand);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        catagory ct = new catagory();
        ct.searchproduct("electronic", 2, 150, "panasonic");
        sc.close();
    }
}
