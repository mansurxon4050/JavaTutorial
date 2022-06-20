import Lenovo.Form;

import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        System.out.print("a,b sonlarni kiriting : ");
        int a = kirit.nextInt();
        int b = kirit.nextInt();
        Form form=new Form();
        int p=a/form.Ekub(a,b);
        int q=b/form.Ekub(a,b);
        System.out.print("qisqarmaydigan kasr korinishi : ");
        System.out.println(p+"/"+q);
        System.out.print("Ekub (a;b) = ");
        System.out.print(form.Ekub(a,b));

    }
}
