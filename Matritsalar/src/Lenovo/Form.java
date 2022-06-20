package Lenovo;

public class Form {


    public int Ekub(int a, int b) {
        int min = a, k = 0;
        if (a > b) min = b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                k = i;
            }
        }
        return k;
    }

    public void time(int t) {
        int soat = 0, min = 0, sek = 0;
        if (t < 86400 && t > 3600) {
            soat = t / 3600;
            min = (t % 3600) / 60;
            sek = (t % 60);
        } else if (t < 3600 && t > 60) {
            min = (t % 3600) / 60;
            sek = (t % 60);
        } else if (t < 60) {
            sek = t;
        }
        if (soat < 10 && min < 10 && sek < 10)
            System.out.print("0" + soat + " : 0" + min + " : 0" + sek);
        else if (soat < 10 && min > 10 && sek < 10)
            System.out.print("0"+soat + " : " + min + " : 0" + sek);
        else if (soat < 10 && min < 10 && sek > 10)
            System.out.print("0"+soat + " : 0" + min + " : " + sek);
          else if (soat < 10 && min > 10 && sek > 10)
              System.out.print("0"+soat + " : " + min + " : " + sek);
          else System.out.println(soat + " : " + min + " : " + sek);
    }
}



