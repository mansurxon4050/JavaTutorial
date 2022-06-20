import java.util.Scanner;

public class String57 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.nextLine();
        st = st.trim();
        String[] stArray = st.split("\\s+");
        st="";
        for (String x : stArray) {
            st=st.concat(x+" ");
        }
        System.out.println(st);
    }
}
