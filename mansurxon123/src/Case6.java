import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,c;
        a= kirit.nextInt();
        c= kirit.nextInt();
        if (c==1){
            System.out.println("detsimetr=" );
        } else if (c==2){
            System.out.println("a-b=" + (a));
        } else if (c==3 ){
            System.out.println("a/b=" + a);
        } else if (c==4) {
            System.out.println("a*b=" + a);
        }
        else {
            System.out.println("xato ");
        }}
}
