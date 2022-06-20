import java.util.Scanner;

public class String36 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String st2 = kirit.next();
        String st3 = kirit.next();
        String[]stArray=st1.split("\\s+");
        for (int i = 0; i < stArray.length; i++) {
            if (stArray[i].contains(st2)){
                stArray[i]=stArray[i].replace(st2,st3);
            }
        }
        st1="";
        for (String x: stArray){
            st1=st1.concat(x+" ");
        }
        System.out.println(st1);
    }
}
