import java.util.Scanner;

public class osish_tartibi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n  son : ");
        int n=scanner.nextInt();
        System.out.println("5 ta son kiriting : ");
        float [] a=new float[n];
        for (int i = 0; i < n; i++) {
            a[i]= scanner.nextFloat();
        }
        float k;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                if (a[i]>a[j]){
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
            System.out.println(a[i]);
        }
    }
}
