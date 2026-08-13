// package problem_02;

public class printingseries {
    public static void main(String[] args){
        int s1 = 0, s2 = 0;
        for (int i = 2; i<=20; i+=2){
            System.out.print(i + " ");
            s1+=i;
        } 
        System.out.println();
        for (int i = 1; i<=19; i+=2){
            System.out.print(i + " ");
            s2 +=i;
        } 
        System.out.println();
        System.out.print(s1 + " "+s2);
    }
}
