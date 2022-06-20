import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();  //
        if (a>0 && b>0 && c>0 ){
            System.out.println("3 ta musbat (manfiy yuq)");
        } else if (a>0 && b>0 || a>0 && c>0 || b>0 && c>0){
            System.out.println("2 ta musbat (1 ta manfiy)");
        } else if(a>0 || b>0 || c>0) {
            System.out.println("1 ta musbat (2 ta manfiy)");
        }else {
            System.out.println("3 ta manfiy");
        }
    }

}
