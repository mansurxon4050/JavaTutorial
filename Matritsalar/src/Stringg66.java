import java.util.Scanner;

public class Stringg66 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String str =kirit.next();
        String newstr="";
        for (int i = 0; i < str.length(); i+=2) {
            char c1 = str.charAt(i);
            newstr=newstr.concat(String.valueOf(c1));
        }
        if (str.length()%2==1){
        for (int i = str.length()-2; i >= 1; i-=2) {
            char c2 =str.charAt(i);
            newstr=newstr.concat(String.valueOf(c2));
        }
        }else { for (int i = str.length()-1; i >= 1; i-=2) {
            char c2 =str.charAt(i);
            newstr=newstr.concat(String.valueOf(c2));
        }
        }
        System.out.println(newstr);
    }
}
