import java.util.Scanner;

public class String41 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        int k=0;
        String[]stArray=st1.split("\\s+");
        for (String x: stArray){
                k++;
        }
        System.out.println(k);
    }
}
