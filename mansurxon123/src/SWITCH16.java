import java.util.Scanner;
public class SWITCH16 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a = kirit.nextInt();
        switch (a / 10) {
            case 1 -> { System.out.println("o'n");
            }case 2 -> { System.out.print("yigirma");
            }case 3->{ System.out.print("o'ttiz");
            }case 4->{ System.out.print("qirq");
            }case 5->{ System.out.print(" ellik");
            }case 6->{ System.out.print("oltmish");
            } }
        switch (a % 10) {
            case 1 -> {
                System.out.println(" bir yosh");
            }case 2->{ System.out.println(" ikki yosh");
            }case 3->{ System.out.println(" uch yosh");
            }case 4->{ System.out.println(" tort yosh");
            }case 5->{ System.out.println(" besh yosh");
            }case 6->{ System.out.println(" olti yosh");
            }case 7->{ System.out.println(" yetti yosh");
            }case 8->{ System.out.println(" sakkiz yosh");
            }case 9->{ System.out.println(" toqqiz yosh");
            }default -> System.out.println(" xato");
        }
    }
}