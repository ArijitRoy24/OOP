public class charcteroccurance {
    public static void main(String []args){
        String s = "Bangladesh";
        char c = 'a';
        int cnt = 0;
        for (int i= 0; i<s.length(); i++){
            if (s.charAt(i) == c){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
