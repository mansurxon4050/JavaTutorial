import java.util.Scanner;

public class IIFF28 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        if (a%400==0 || a%100!=0 && a%4==0){
            System.out.println(366 + "kun");
        }else{
            System.out.println(365);
        }


    }
}
