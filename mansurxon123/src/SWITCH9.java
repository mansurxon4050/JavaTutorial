import java.util.Scanner;

public class SWITCH9 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int day= kirit.nextInt(),month= kirit.nextInt();
        switch (month){
            case 1->{
                if (day==31)  System.out.println("1-fevral");
                else System.out.println(++day + " - yanvar");
            }case 2->{if (day==28)  System.out.println("1-mart");
            else System.out.println(++day + " - fevral");
            }case 3->{if (day==31)  System.out.println("1-aprel");
            else System.out.println(++day + " - mart");
            }case 4->{if (day==30)  System.out.println("1-may");
            else System.out.println(++day + " - aprel");
            }case 5->{if (day==31)  System.out.println("1-iyun");
            else System.out.println(++day + " - may");
            }case 6-> { if (day == 30) System.out.println("1-iyul");
            else System.out.println(++day + " - iyun");
            }case 7->{if (day==31)  System.out.println("1-avgust");
            else System.out.println(++day + " - iyul");
            }case 8->{if (day==31)  System.out.println("1-senabr");
            else System.out.println(++day + " - avgust");
            }case 9->{if (day==30)  System.out.println("1-oktabr");
            else System.out.println(++day + " - sentabr");
            }case 10->{if (day==31)  System.out.println("1-noyabr");
            else System.out.println(++day + " - oktabr");
            }case 11->{if (day==30)  System.out.println("1-dekabr");
            else System.out.println(++day + " - noyabr");
            }case 12->{if (day==31)  System.out.println("1-yanvar");
            else System.out.println(++day + " - dekabr");
            }default -> System.out.println("xato");


        }
    }
}
