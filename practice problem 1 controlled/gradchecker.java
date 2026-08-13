import java.util.Scanner;

public class gradchecker{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (x>=0 && x<=39) System.out.println('F');
        else if (x>=40 && x<=59) System.out.println("C+");
        else if (x>=60 && x<=69) System.out.println("B");
        else if (x>=70 && x<=79) System.out.println("A-");
        else if (x>=80 && x<=89) System.out.println("A");
        else System.out.println("A+");

        sc.close();
    }
}