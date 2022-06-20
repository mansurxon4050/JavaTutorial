import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a ;
        a= kirit.nextInt();
        if (a==1){
            System.out.println("dushanba");
        } else if (a==2){
            System.out.println("seshanba");
        } else if (a==3){
            System.out.println("chorshanba");
        } else if (a==4){
            System.out.println("payshanba");
        } else if (a==5){
            System.out.println("juma");
        } else if (a==6){
            System.out.println("shanba");
        } else if (a==7){
            System.out.println("yakshanba");
        } else {
            System.out.println("xato 0<a<8");
        }


    }



}
