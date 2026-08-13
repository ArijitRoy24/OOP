// package problem_03;
import java.util.Scanner;

public class printingavg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , avg = 0;
        for (int i = 0; i<n; i++){
            int x = sc.nextInt(); 
            avg+=x;
        }
        System.out.println(avg/(n*1.0));
    }
}
