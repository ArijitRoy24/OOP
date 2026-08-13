import java.util.Scanner;

public class calculator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y =sc.nextInt();
        String c = sc.nextLine();
        if (c == "+") System.out.println(x+y);
        else if (c == "-") System.out.println(x-y);
        else if (c == "*") System.out.println(x*y);
        else System.out.println(x/(y*1.0));

        sc.close();
    }
}