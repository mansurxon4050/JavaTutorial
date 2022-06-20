import java.util.Scanner;

public class String55 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st =kirit.nextLine();
        String[]strArray = st.split("\\s+");
        int maxlenght=0,k=0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length()>maxlenght){
                maxlenght= strArray[i].length();
                k=i;
            }
        }
        System.out.println(strArray[k]);
    }
}
