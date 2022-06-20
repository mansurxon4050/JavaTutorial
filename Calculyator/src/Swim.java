import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Swim
{

    public static class SwingJava extends JFrame implements ActionListener {

        float count = 0;
        float s = 0;
        int n=0;
        char c;
        String str = "", num1 = "", num2 = "";
        JTextField field;
        JButton bt0, btishora, btvergul, bt1, bt7, bt8, bt9, bt4,
                btteng, btkop, btbolish, bt5, bt6, bt2, bt3, btplus,
                btmin, btce, btdel, btildz;

        DecimalFormat decimalFormat;

        public SwingJava() {

            decimalFormat = new DecimalFormat("#.##",
                    DecimalFormatSymbols.getInstance(Locale.US));

            setBounds(400, 300, 250, 270);

            setTitle(" Mansurxon ");
            JPanel panel = new JPanel();
            panel.setBackground(Color.lightGray);
            panel.setLayout(null);

            field = new JFormattedTextField();
            field.setBounds(10, 10, 215, 30);
            field.setFont(new Font("Times New Roman", Font.BOLD, 25));

            panel.add(field);

            btce = new JButton("CE");
            btce.setBounds(10, 45, 50, 30);
            btce.setBackground(Color.pink);
            add(btce);
            btce.addActionListener(this);

            btdel = new JButton("⇚");
            btdel.setBounds(65, 45, 50, 30);
            btdel.setBackground(Color.pink);
            add(btdel);
            btdel.addActionListener(this);

            btildz = new JButton("√");
            btildz.setBounds(120, 45, 50, 30);
            btildz.setBackground(Color.pink);
            add(btildz);
            btildz.addActionListener(this);

            bt7 = new JButton("7");
            bt7.setBounds(10, 80, 50, 30);
            bt7.setBackground(Color.yellow);
            bt7.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt7);
            bt7.addActionListener(this);

            bt8 = new JButton("8");
            bt8.setBounds(65, 80, 50, 30);
            bt8.setBackground(Color.yellow);
            bt8.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt8);
            bt8.addActionListener(this);

            bt9 = new JButton("9");
            bt9.setBounds(120, 80, 50, 30);

            bt9.setBackground(Color.yellow);
            bt9.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt9);
            bt9.addActionListener(this);

            bt4 = new JButton("4");
            bt4.setBounds(10, 115, 50, 30);
            bt4.setBackground(Color.yellow);
            bt4.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt4);
            bt4.addActionListener(this);

            bt5 = new JButton("5");
            bt5.setBounds(65, 115, 50, 30);
            bt5.setBackground(Color.yellow);
            bt5.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt5);
            bt5.addActionListener(this);

            bt6 = new JButton("6");
            bt6.setBounds(120, 115, 50, 30);
            bt6.setBackground(Color.yellow);
            bt6.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt6);
            bt6.addActionListener(this);

            bt1 = new JButton("1");
            bt1.setBounds(10, 150, 50, 30);
            bt1.setBackground(Color.yellow);
            bt1.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt1);
            bt1.addActionListener(this);

            bt2 = new JButton("2");
            bt2.setBounds(65, 150, 50, 30);
            bt2.setBackground(Color.yellow);
            bt2.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt2);
            bt2.addActionListener(this);

            bt3 = new JButton("3");
            bt3.setBounds(120, 150, 50, 30);
            bt3.setBackground(Color.yellow);
            bt3.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt3);
            bt3.addActionListener(this);

            btishora = new JButton("+/-");
            btishora.setBounds(10, 185, 50, 30);
            btishora.setBackground(Color.pink);
            add(btishora);
            btishora.addActionListener(this);

            bt0 = new JButton("0");
            bt0.setBounds(65, 185, 50, 30);
            bt0.setBackground(Color.yellow);
            bt0.setFont(new Font("Times New Roman", Font.BOLD, 20));
            add(bt0);
            bt0.addActionListener(this);

            btvergul = new JButton(".");
            btvergul.setBounds(120, 185, 50, 30);
            btvergul.setBackground(Color.pink);
            add(btvergul);
            btvergul.addActionListener(this);

            btteng = new JButton("=");
            btteng.setBounds(175, 185, 50, 30);
            btteng.setBackground(Color.pink);
            add(btteng);
            btteng.addActionListener(this);


            btplus = new JButton("+");
            btplus.setBounds(175, 150, 50, 30);
            btplus.setBackground(Color.pink);
            add(btplus);
            btplus.addActionListener(this);

            btmin = new JButton("-");
            btmin.setBounds(175, 115, 50, 30);
            btmin.setBackground(Color.pink);
            add(btmin);
            btmin.addActionListener(this);

            btkop = new JButton("*");
            btkop.setBounds(175, 80, 50, 30);
            btkop.setBackground(Color.pink);
            btkop.setFont(new Font("Times New Roman", Font.BOLD, 14));
            add(btkop);
            btkop.addActionListener(this);

            btbolish = new JButton("/");
            btbolish.setBounds(175, 45, 50, 30);
            btbolish.setBackground(Color.pink);
            add(btbolish);
            btbolish.addActionListener(this);

            add(panel);
            setVisible(true);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
        public static void main(String[] args) {
            new SwingJava();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bt1) {
                if (count == 0) {
                    num1 = num1.concat("1");
                } else {
                    num2 = num2.concat("1");
                }
                str = str.concat("1");
                field.setText(str);
            } else if (e.getSource() == bt2) {
                if (count == 0) {
                    num1 = num1.concat("2");
                } else {
                    num2 = num2.concat("2");
                }
                str = str.concat("2");
                field.setText(str);
            } else if (e.getSource() == bt3) {
                if (count == 0) {
                    num1 = num1.concat("3");
                } else {
                    num2 = num2.concat("3");
                }
                str = str.concat("3");
                field.setText(str);
            } else if (e.getSource() == bt4) {
                if (count == 0) {
                    num1 = num1.concat("4");
                } else {
                    num2 = num2.concat("4");
                }
                str = str.concat("4");
                field.setText(str);
            } else if (e.getSource() == bt5) {
                if (count == 0) {
                    num1 = num1.concat("5");
                } else {
                    num2 = num2.concat("5");
                }
                str = str.concat("5");
                field.setText(str);
            } else if (e.getSource() == bt6) {
                if (count == 0) {
                    num1 = num1.concat("6");
                } else {
                    num2 = num2.concat("6");
                }
                str = str.concat("6");
                field.setText(str);
            } else if (e.getSource() == bt7) {
                if (count == 0) {
                    num1 = num1.concat("7");
                } else {
                    num2 = num2.concat("7");
                }
                str = str.concat("7");
                field.setText(str);
            } else if (e.getSource() == bt8) {
                if (count == 0) {
                    num1 = num1.concat("8");
                } else {
                    num2 = num2.concat("8");
                }
                str = str.concat("8");
                field.setText(str);
            } else if (e.getSource() == bt9) {
                if (count == 0) {
                    num1 = num1.concat("9");
                } else {
                    num2 = num2.concat("9");
                }
                str = str.concat("9");
                field.setText(str);
            } else if (e.getSource() == bt0) {
                if (count == 0) {
                    num1 = num1.concat("0");
                } else {
                    num2 = num2.concat("0");
                }
                str = str.concat("0");
                field.setText(str);
            }
            else if (e.getSource() == btplus) {
                count++;
                if (count == 2) {
                    count = 1;
                    summ();
                    num1=decimalFormat.format(s);
                    num2="";
                    str = num1;
                }
                c = '+';
                str = str.concat("+");
                field.setText(str);
            } else if (e.getSource() == btishora) {
                n++;
                if (n == 2) {
                    num1 = num1.substring(1);
                    n = 0;
                } else if (n == 1) {
                    num1 = "-".concat(num1);
                }
                str = num1;
                field.setText(str);
            } else if (e.getSource() == btmin) {
                count++;
                if (count == 2) {
                    count = 1;
                    summ();
                    num1=decimalFormat.format(s);
                    num2="";
                    str = num1;
                }
                c = '-';
                str = str.concat("-");
                field.setText(str);
            } else if (e.getSource() == btkop) {
                count++;
                if (count == 2) {
                    count = 1;
                    summ();
                    num1=decimalFormat.format(s);
                    num2="";
                    str = num1;
                }
                c = '*';
                str = str.concat("*");
                field.setText(str);
            } else if (e.getSource() == btbolish) {
                count++;
                if (count == 2) {
                    count = 1;
                    summ();
                    num1=decimalFormat.format(s);
                    num2="";
                    str = num1;
                }
                c = '/';
                str = str.concat("/");
                field.setText(str);
            }

            else if (e.getSource() == btteng) {
                count++;
                if (count == 2) {
                    count = 0;
                    summ();
                    num1=decimalFormat.format(s);
//                    num1= String.valueOf(s);
                    num2="";
                    str = num1;
                }
                field.setText(str);
            }

            else if (e.getSource() == btce) {
                str = "";
                num1 = "";
                num2 = "";
                count = 0;
                field.setText("0");
            }
            else if (e.getSource() == btdel) {
                if (count==0){
                    num1 = num1.substring(0, str.length() - 1);
                    str=num1;
                }else if (count==1){

                    num2 = num2.substring(0, str.length() - 1);
                    str=num2;
                }

                field.setText(str);
            }
            else if (e.getSource() == btildz) {
                float a = Float.parseFloat(num1);
                num1 = decimalFormat.format(Math.sqrt(a));
                num2="";
                str = num1;
                field.setText(str);
            }
            else if (e.getSource()==btvergul){
                if (count==0){
                    if (!num1.contains(".")){
                        if (num1.equals("")){
                            str=str.concat("0");
                        }
                        num1=num1.concat(".");
                        str=str.concat(".");
                    }
                }
                else if (count==1){
                    if (!num2.contains(".")){
                        if (num2.equals("")){
                            str=str.concat("0");
                        }
                        num2=num2.concat(".");
                        str=str.concat(".");
                    }
                }
                field.setText(str);

            }
        }
        private void summ() {
            float a = Float.parseFloat(num1);
            float b = Float.parseFloat(num2);
            switch (c) {
                case '+' -> s = a + b;
                case '-' -> s = a - b;
                case '*' -> s = a * b;
                case '/' -> s = a / b;
            }
            num1 = String.valueOf(s);

            num2 = "";
        }
    }

    public static void main(String[] args) {
        new SwingJava();
    }

}
