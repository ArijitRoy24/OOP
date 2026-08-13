import java.util.Scanner;

public class posorneg{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (x<0) System.out.println("Negative");
        else System.out.println("Positive");

        sc.close();
    }
}