import java.util.Scanner;

public class Stringg29 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        char c = kirit.next().charAt(0);
        String s1 = kirit.next() ;
        String s2 = kirit.next() ;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==c){
                String newS = s1.substring(0,i);
                newS=newS.concat(s2);
                newS=newS.concat(s1.substring(i));
                System.out.println(newS); }
            else System.out.println(s1);
        }
    }
}
