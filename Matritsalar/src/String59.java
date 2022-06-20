import java.util.Scanner;

public class String59 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st=kirit.nextLine();
        String[]a=st.split("\\\\");
        String[] end =a[a.length-1].split("\\.");
        System.out.println(end[1]);
    }
}
