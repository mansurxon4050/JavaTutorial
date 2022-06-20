import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();  //
        if (a>0 && b>0 && c>0 ){
            System.out.println("3 ta");
        } else if (a>0 && b>0 || a>0 && c>0 || b>0 && c>0){
            System.out.println("2 ta");
        } else if(a>0 || b>0 || c>0) {
            System.out.println("1 ta");
        }
    }
}
