import java.util.Scanner;

public class oddoreven{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (x%2 == 1) System.out.println("ODD");
        else System.out.println("EVEN");

        sc.close();
    }
}