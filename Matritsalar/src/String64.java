import java.util.Scanner;

public class String64 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.nextLine();
        int k = kirit.nextInt();
        String newa = "";
        String[] a = st.split("\\s+");
        for (String x : a) {
            String newstrr="";
            for (int i = 0; i < x.length(); i++) {
                int m = x.charAt(i)-k;
                if (m<97)
                    m+=26;
                char c = (char) m ;
                newstrr=newstrr.concat(String.valueOf(c));
            }
            newa=newa.concat(newstrr+" ");
        }
        System.out.println(newa);
    }
}
///