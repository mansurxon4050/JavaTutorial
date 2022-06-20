import java.util.Scanner;

public class SWITCH17 {
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
                System.out.println(" birinchi masala");
            }case 2->{ System.out.println(" ikkinchi masala");
            }case 3->{ System.out.println(" uchinchi masala");
            }case 4->{ System.out.println(" tortinchi masala");
            }case 5->{ System.out.println(" beshinchi masala");
            }case 6->{ System.out.println(" oltinchi masala");
            }case 7->{ System.out.println(" yettinchi masala");
            }case 8->{ System.out.println(" sakkizinchi masala");
            }case 9->{ System.out.println(" toqqizinchi masala");
            }default -> System.out.println(" xato");
        }
    }
}
