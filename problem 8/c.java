// package problem 8;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        double [][] arr = new double[5][5];
        double []credit = {3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                arr[i][j] = sc.nextInt() *credit[j];
            }
        }        
        for (int i = 0; i<5; i++){
            double sum = 0, l = 0;
            for (int j = 0; j<5; j++){
                sum+= credit[j]*arr[i][j];
                l+=credit[j];
            }
            System.out.println(i+1 +": "+(sum/l));
        }
        sc.close();
    }
}
