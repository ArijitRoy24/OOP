// package problem_02;
import java.util.Scanner;

public class leapyr {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%400 == 0 || (x%4 == 0 && x%100 != 0)) System.out.println("Leap year\n");
        else System.out.println("Not leap year");
        sc.close();
    }
}
