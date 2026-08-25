public class palindromornot {
    static boolean ispalindrom(String s){
        int l = 0, r = s.length() - 1;
        while(r>l){
            if (s.charAt(r) != s.charAt(l)) return false;
            r--;
            l++;
        }
        return true;
    }
    public static void main(String [] args){
        String a= "Bangladesh", b = "abccba";
        if (ispalindrom(a)) System.out.println("Its palindrom!");
        else System.out.println("Its not palindrom!");
        if (ispalindrom(b)) System.out.println("Its palindrom!");
        else System.out.println("Its not palindrom!");
    }
}
