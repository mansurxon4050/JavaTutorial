            import java.util.Scanner;
            public class SWITCH20 {
            public static void main(String[] args) {
            Scanner kirit = new Scanner(System.in);
            int day,month;
            day= kirit.nextInt();month= kirit.nextInt();
            switch (month){
            case 1->{
                if (day==19) System.out.println(" Baliq") ;
                else  System.out.println(day + " Qovga") ;
            }case 2->{if (day==21)  System.out.println(" Qo'y") ;
            else System.out.println(day + " Baliq") ;
            }case 3->{if (day==20)  System.out.println(" Buzoq") ;
            else System.out.println(day + " Qo'y") ;
            }case 4->{if (day==21)  System.out.println(" Egizak") ;
            else System.out.println(day + " Buzoq ") ;
            }case 5->{if (day==22)  System.out.println(" Qisqicbaqa") ;
            else System.out.println(day + " Egizak") ;
            }case 6-> { if (day == 23) System.out.println(" Arslon") ;
            else System.out.println(day + " Qisqichbaqa") ;
            }case 7->{if (day==23)  System.out.println(" Parizod") ;
            else System.out.println(day + " Arslon") ;
            }case 8->{if (day==23)  System.out.println(" Tarozi") ;
            else System.out.println(day + " Parizod") ;
            }case 9->{if (day==23)  System.out.println(" Chayon") ;
            else System.out.println(day + " Tarozi") ;
            }case 10->{if (day==23)  System.out.println(" O'qotar") ;
            else System.out.println(day + " CHayon") ;
            }case 11->{if (day==22)  System.out.println(" Echki") ;
            else System.out.println(day + " O'qotar") ;
            }case 12->{if (day==20)  System.out.println(" Qovg'a") ;
            else System.out.println(day + " Echki") ;
            }default -> System.out.println(" xato") ;  }  }  }