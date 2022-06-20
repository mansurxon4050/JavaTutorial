import java.util.Scanner;

public class Stringg009 {
    public static void main(String[] args) {
        Scanner kirit=new Scanner(System.in);
        String st=kirit.next();
        String newst ="";
        for (int i = 0; i < st.length(); i++) {
            newst= String.valueOf((st.charAt(i))).concat(newst);
        }
        System.out.println(newst);
    }
}
