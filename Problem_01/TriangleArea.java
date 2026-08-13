import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        double base =myobj.nextDouble(), height = myobj.nextDouble();
        System.out.println(0.5*base*height);
        myobj.close();
    }
}