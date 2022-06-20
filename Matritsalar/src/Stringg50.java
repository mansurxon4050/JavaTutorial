import java.util.Scanner;

public class Stringg50 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        st1=st1.trim();
        String[] strArray = st1.split("\\s+");
        st1="";
        for (String x: strArray){
            st1=(x+" ").concat(st1);
        }
        System.out.println(st1);
    }
}
