import java.util.Scanner;

public class String56 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String[] strArray = st1.split("\\s+");
        int minlenght = strArray[0].length(),k=0;
        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i].length() < minlenght) {
                minlenght= strArray[i].length();
                k=i;
            }
        }
        System.out.println(strArray[k]);
    }
}
