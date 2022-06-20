import java.util.Scanner;

public class String42 {
    public static void main(String[] args) { // boshi va oxiri bir xil harflar sanaydi
        Scanner kirit = new Scanner(System.in);
        String st1 = "Assalomua aleykuma hammaga salomlars bulsn qaleszlar salom";
        int k=0;
        String[]stArray=st1.split("\\s+");
        for (String x: stArray){
            if (String.valueOf(x.charAt(0)).equalsIgnoreCase(String.valueOf(x.charAt(x.length()-1))))
                k++;
        }
        System.out.println(k);
    }
}
