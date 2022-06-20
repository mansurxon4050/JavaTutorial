import java.util.Arrays;
import java.util.Scanner;

public class Stringg51 {
//    public static void main(String[] args) {
//        Scanner kirit = new Scanner(System.in);
//        String st1 = kirit.nextLine();
//        String[] a = st1.split("\\s+");
//        String k;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i].charAt(0) > a[j].charAt(0)) {
//                    k = a[i];
//                    a[i] = a[j];
//                    a[j] = k;
//                }
//            }
//        }
//        for (String x : a) {
//            System.out.print(x + " ");
//        }
//    }

    public static void main(String[] args) {


        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String[] stArray = st1.split("\\s+");
        Arrays.sort(stArray);
        System.out.println(Arrays.toString(stArray));
    }
}





