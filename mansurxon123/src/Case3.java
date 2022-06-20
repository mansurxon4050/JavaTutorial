import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        if (a==1 || a==2 || a==3){
            System.out.println("bahor");
        } else if (a==4 || a==5||a==6){
            System.out.println("yoz");
        } else if (a==7 || a==8 || a==9 ){
            System.out.println("kuz");
        } else if (a==10 || a==11 || a==12) {
            System.out.println("qish");
        }
      else {
            System.out.println("xato 0<a<13");
        }
    }
}
