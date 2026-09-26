import java.util.Scanner;

public class stringproblem {
    public static void main(String []args){
        String ss;
        Scanner sc = new Scanner(System.in);
        ss = sc.nextLine();
        for (int i =ss.length()-1; i>-1; i--){
            System.out.print(ss.charAt(i));
        }
        System.out.println();
        int l = 0, r = ss.length()-1, cnt = 0;
        boolean b = false;
        while(r>l){
            if (ss.charAt(r)!=ss.charAt(l)){
                b = true;
                break;
            }
            r--;
            l++;
        }
        if (b) System.out.println("Not Palindrome");
        else System.out.println("Palindrome");
        char c = sc.next().charAt(0);
        for (int i = 0; i<ss.length(); i++){
            if (ss.charAt(i) == c) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
