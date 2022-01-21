package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FunctionClass  {

   private  ActionEvent btn1;
   private   ActionEvent btn2;
   private ActionEvent btn3;
    public FunctionClass (){
    initilizeComponent();
    componentSetting();
    addingComponentToFrame();
    buttonsAction();

}

    private JFrame frame  ;
    private JPanel panel1 ;
    private JPanel panel2 ;
    private JPanel panel3 ;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;

   private JTextArea textArea;

    private void initilizeComponent()
    {
         frame  = new JFrame();
         panel1 = new JPanel();
         panel2 = new JPanel();
         panel3 = new JPanel();


         button1= new JButton();
         button2= new JButton();
         button3= new JButton();
         button4= new JButton();
         button5= new JButton();
         button6= new JButton();
         button7= new JButton();
         button8= new JButton();
         button9= new JButton();
         button10= new JButton();
         button11= new JButton();
         button12= new JButton();
         button13= new JButton();
         button14= new JButton();
         button15= new JButton();
         button16= new JButton();
         button17= new JButton();

         textField1= new JTextField();
         textField2= new JTextField();
         textField3= new JTextField();
         textField4= new JTextField();
         textField5= new JTextField();
         textField6= new JTextField();
         textField7= new JTextField();
         textField8= new JTextField();

         label1= new JLabel();
         label2= new JLabel();
         label3= new JLabel();
         label4= new JLabel();
         label5= new JLabel();
         label6= new JLabel();
         label7= new JLabel();
         label8= new JLabel();
         label9= new JLabel();
         label10= new JLabel();
         label11= new JLabel();
         label12= new JLabel();
         label13= new JLabel();
         label14= new JLabel();
         label15= new JLabel();
         label16= new JLabel();
         label17= new JLabel();
         label18= new JLabel();
         label19= new JLabel();

         textArea=new JTextArea();

    }

    private void  componentSetting(){
        frame.setVisible(true);
        frame.setSize(1020,575);
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(53,31,90));
        frame.setDefaultCloseOperation(3);
        frame.setTitle("deMinister Cafe");

        panel1.setBackground(new Color(158, 157, 142));
        panel1.setBounds(0,0,420,80);


        label1.setFont(new Font("Pristina",1,24));
        label1.setForeground(new Color(255, 255,255));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setText("DE LONDRES CON AMOR \n");

        label2.setFont(new Font("Segoe Print",1,14));
        label2.setForeground(new Color(255, 255,255));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setText("FROM LONDON WITH LOVE ");
        panel1.setVisible(true);
        panel1.add(label1);
        panel1.add(label2);

        panel2.setBackground(new Color(158, 157, 142));
        panel2.setBounds(10,90,410,60);

        label3.setBackground(new Color(153,51,0));
        label3.setFont(new Font("Gabriola",1,24));
        label3.setForeground(new Color(255,255,255));
        String s="HOT COFFEE";
        label3.setText(s.concat("                               "));

        label4.setBackground(new Color(153,51,0));
        label4.setFont(new Font("Gabriola",1,24));
        label4.setForeground(new Color(255,255,255));
        label4.setText("COLD COFFEE");

        panel2.add(label3);
        panel2.add(label4);
        panel2.setVisible(true);

        panel3.setBackground(new Color(158, 157, 142));
        panel3.setBounds(2,320,120,40);

        label5.setFont(new Font("Gabriola",1,24));
        label5.setForeground(new Color(255,255,255));
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setText("Description");

        panel3.add(label5);
        panel3.setVisible(true);

        button1.setText("Coffee Americano");
        button1.setBounds(2,160,120,25);
        button1.setFont(new Font("Time New Roman",1,12));
        button1.setToolTipText("Coffee Americano");

        button2.setText("Cafe Mocha");
        button2.setBounds(2,190,120,25);
        button2.setFont(new Font("Time New Roman",1,12));


        button3.setText("Espresso Romano");
        button3.setBounds(2,220,120,25);
        button3.setFont(new Font("Time New Roman",1,12));
        button3.setToolTipText("Espresso Romano");

        button4.setText("Cappuccino");
        button4.setBounds(2,250,120,25);
        button4.setFont(new Font("Time New Roman",1,12));

        button5.setText("Cafe Zorro");
        button5.setBounds(2,280,120,25);
        button5.setFont(new Font("Time New Roman",1,12));


        button6.setText("Guillermo");
        button6.setBounds(132,160,100,25);
        button6.setFont(new Font("Time New Roman",1,12));

        button7.setText("Decaf");
        button7.setBounds(132,190,100,25);
        button7.setFont(new Font("Time New Roman",1,12));
        button7.setToolTipText("Coffee Americano");


        button8.setText("Coffee Milk");
        button8.setBounds(132,220,100,25);
        button8.setFont(new Font("Time New Roman",1,12));


        button9.setText("Yuan Yang");
        button9.setBounds(280,160,135,25);
        button9.setFont(new Font("Time New Roman",1,12));

        button10.setText("Greek Frapped");
        button10.setBounds(280,190,135,25);
        button10.setFont(new Font("Time New Roman",1,12));


        button11.setText("Raspberry Mocha");
        button11.setBounds(280,220,135,25);
        button11.setFont(new Font("Time New Roman",1,12));

        button12.setText("Red Tie");
        button12.setBounds(280,250,135,25);
        button12.setFont(new Font("Time New Roman",1,12));

        button14.setText("Select");
        button14.setBounds(135,370,70,30);
        button14.setFont(new Font("Time new Roman",1,12));

        button15.setText("Select");
        button15.setBounds(135,415,70,30);
        button15.setFont(new Font("Time new Roman",1,12));

        button16.setText("Select");
        button16.setBounds(135,465,70,30);
        button16.setFont(new Font("Time new Roman",1,12));

        button17.setText("Calculate");
        button17.setBounds(330,505,100,25);
        button17.setFont(new Font("Time new Roman",1,12));


        textArea.setBounds(132, 310, 282, 50);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Time new Romon",1,13));

        textField1.setBounds(75,370,50,30);
        textField1.setEditable(false);
        textField1.setFont(new Font("Time new Romon",1,13));

        textField2.setBounds(75, 415, 50, 30);
        textField2.setEditable(false);
        textField2.setFont(new Font("Time new Romon",1,13));

        textField3.setBounds(75, 465, 50, 30);
        textField3.setEditable(false);
        textField3.setFont(new Font("Time new Romon",1,13));

        textField4.setBounds(215, 400, 140, 30);
        textField4.setEditable(false);
        textField4.setFont(new Font("Time new Romon",1,13));

        textField5.setBounds(90,505,55,25);
        textField5.setEditable(true);
        textField5.setFont(new Font("Time new Romon",1,12));

        textField6.setBounds(270,435,85,25);
        textField6.setEditable(true);
        textField6.setFont(new Font("Time new Romon",1,12));

        textField7.setBounds(270,465,85,25);
        textField7.setEditable(false);
        textField7.setFont(new Font("Time new Romon",1,12));

        textField8.setBounds(240,505,70,25);
        textField8.setEditable(false);
        textField8.setFont(new Font("Time new Romon",1,12));

        label6.setText("SMALL");
        label6.setFont(new Font("Time New Roman",1,16));
        label6.setForeground(new Color(255,255,255));
        label6.setBounds(2,360,210,50);

        label7.setText("MEDIUM");
        label7.setFont(new Font("Time New Roman",1,16));
        label7.setForeground(new Color(255,255,255));
        label7.setBounds(2,405,210,50);

        label8.setText("LARGE");
        label8.setFont(new Font("Time New Roman",1,16));
        label8.setForeground(new Color(255,255,255));
        label8.setBounds(2,455,210,50);

        label9.setText("YOUR ORDER");
        label9.setFont(new Font("Time New Roman",1,17));
        label9.setForeground(new Color(255,255,255));
        label9.setBounds(215,360,160,50);

        label10.setText("QUANTITY");
        label10.setFont(new Font("Time New Roman",1,17));
        label10.setForeground(new Color(255,255,255));
        label10.setBounds(3,490,140,50);

        label11.setText("CASH");
        label11.setFont(new Font("Time New Roman",1,16));
        label11.setForeground(new Color(255,255,255));
        label11.setBounds(215,420,140,50);

        label12.setText("TOTAL");
        label12.setFont(new Font("Time New Roman",1,16));
        label12.setForeground(new Color(255,255,255));
        label12.setBounds(215,452,140,50);

        label13.setText("CHANGE");
        label13.setFont(new Font("Time New Roman",1,16));
        label13.setForeground(new Color(255,255,255));
        label13.setBounds(165,490,140,50);


        label14.setIcon(new ImageIcon(getClass().getResource("menus.jpg")));
        label14.setBounds(550,0,530,310);

        label15.setIcon(new ImageIcon(getClass().getResource("MenusCold11.jpg")));
        label15.setBounds(550,355,320,190);

        label16.setIcon(new ImageIcon(getClass().getResource("menuscold12.jpg")));
        label16.setBounds(867,355,110,350);



        label17.setText("<html>" + "H<br>O<br>T");
        label17.setFont(new Font("Arial Break",1,42));
        label17.setBounds(450,0,300,190);
        label17.setForeground(Color.WHITE);

        label18.setText("<html>"+"C<br><br>O<br><br>F<br><br>F<br><br>E<br><br>E");
        label18.setFont(new Font("Arial Break",1,35));
        label18.setBounds(510,0,300,490);
        label18.setForeground(Color.WHITE);

        label19.setText("<html>"+"C<br>O<br>L<br>D");
        label19.setFont(new Font("Arial Break",1,42));
        label19.setBounds(450,330,300,210);
        label19.setForeground(Color.WHITE);

        frame.setResizable(false);

        frame.getContentPane().setLayout(null);

    }

public void buttonsAction(){

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button14.setEnabled(true);
                button16.setEnabled(true);
                textField1.setText("120");
                textField2.setText("145");
                textField3.setText("178");
                textField4.setText("Coffee Americano");
                textArea.setText("Style of coffee prepared by adding hot water espresso giving a similar strength to but different flavor from regular drip coffee.");
            }
        });

    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            button16.setEnabled(true);
            textField1.setText("135");
            textField2.setText("145");
            textField3.setText("165");
            textField4.setText("Cafe Mocha");
            textArea.setText("It is typically one third espresso and two thirds steamed milk but a portion of chocolate is added, typically in the form of a chocolate syrup, although other vending systems use instant chocolate powder");
        }
    });

    button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            button16.setEnabled(true);
            textField1.setText("188");
            textField2.setText("244");
            textField3.setText("244");
            textField4.setText("Espresso Romano");
            textArea.setText("a shot of espresso with a small ring of lemon and sugar added");
        }
    });

    button4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button16.setEnabled(true);
            textField1.setText("N/A");
            textField2.setText("122");
            textField3.setText("144");
            textField4.setText("Cappuccino");
            textArea.setText("Coffee-based drink prepared with espresso, hot milk and steamed milk foam");
            button14.setEnabled(false);
        }
    });
    button14.setEnabled(true);
    button5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button16.setEnabled(true);
            textField1.setText("N/A");
            textField2.setText("190");
            textField3.setText("220");
            textField4.setText("Cafe Zorro");
            textArea.setText("Double espresso added to hot water. ratio 1:1");
            button14.setEnabled(false);
        }
    });

    button6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText("N/A");
            textField2.setText("179");
            textField3.setText("196");
            textField4.setText("Guillermo");
            textArea.setText("One or two shots of hot espresso, poured over slices of lime it can also be served on ice, sometimes with a touch of milk.");
            button14.setEnabled(false);
        }
    });
    button14.setEnabled(true);
    button7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            textField1.setText("88");
            textField2.setText("120");
            textField3.setText("N/A");
            textField4.setText("Decaf");
            textArea.setText("Beverage made with decaf feinated beans.");
            button16.setEnabled(false);
        }
    });


    button8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            textField1.setText("90");
            textField2.setText("100");
            textField3.setText("120");
            textField4.setText("Coffee Milk");
            textArea.setText("Drink similar to chocolate milk however, instead of chocolate syrup, coffee syrup is used.");
            button16.setEnabled(true);
        }
    });

    button9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            textField1.setText("97");
            textField2.setText("127");
            textField3.setText("143");
            textField4.setText("YuanYang");
            textArea.setText("Made of a mixture of coffee and Hong Kong-style milk tea.");
            button16.setEnabled(true);
        }
    });

    button10.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            textField1.setText("65");
            textField2.setText("75");
            textField3.setText("90");
            textField4.setText("Greek Frapped");
            textArea.setText("Foam-covered iced coffee drink made from spray-dried instant coffee.");
            button16.setEnabled(true);
        }
    });

    button11.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            textField1.setText("126");
            textField2.setText("145");
            textField3.setText("N/A");
            textField4.setText("Raspberry Mocha");
            textArea.setText("A regular mocha with raspberry flavoring.");
            button16.setEnabled(false);
        }
    });


    button12.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            button14.setEnabled(true);
            button16.setEnabled(true);
            textField1.setText("154");
            textField2.setText("166");
            textField3.setText("179");
            textField4.setText("Red Tie");
            textArea.setText("A traditional Thai Iced Tea,which is a spicy and sweet");
        }
    });

    button14.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent b1) {
            btn1=b1;
            button15.setEnabled(false);
            button16.setEnabled(false);

        }
    });

    button15.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent b2) {
            btn2=b2;
            button14.setEnabled(false);
            button16.setEnabled(false);

        }
    });

    button16.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent b3) {
            btn3=b3;
            button14.setEnabled(false);
            button15.setEnabled(false);

        }
    });

    button17.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int cash,total=0,qty,change=0,ordr;
          if(btn1!=null){
            ordr=Integer.parseInt(textField1.getText());
            qty=Integer.parseInt(textField5.getText());
            cash=Integer.parseInt(textField6.getText());
            total=ordr*qty;
            change=cash-total;
              if(change<total){
                  JOptionPane.showMessageDialog(frame,"your Cash is Insufficient For This Order ");
                  textField8.setText("");
              }
            textField7.setText(""+total);
            textField8.setText(""+change);
            button15.setEnabled(true);
            button16.setEnabled(true);
          }

          else if(btn2!=null){
                ordr=Integer.parseInt(textField2.getText());
                qty=Integer.parseInt(textField5.getText());
                cash=Integer.parseInt(textField6.getText());
                total=ordr*qty;
                change=cash-total;
              if(change<total){
                  JOptionPane.showMessageDialog(frame,"your Cash is Insufficient For This Order ");
                  textField8.setText("");
              }
                textField7.setText(""+total);
                textField8.setText(""+change);
                button14.setEnabled(true);
                button16.setEnabled(true);
            }

          else if(btn3!=null){
                ordr=Integer.parseInt(textField3.getText());
                qty=Integer.parseInt(textField5.getText());
                cash=Integer.parseInt(textField6.getText());
                total=ordr*qty;
                change=cash-total;
                if(change<total){
                    JOptionPane.showMessageDialog(frame,"your Cash is Insufficient For This Order ");
                }

                textField7.setText(""+total);
                textField8.setText(""+change);
                button14.setEnabled(true);
                button15.setEnabled(true);
            }

        }
    });

}


    public void addingComponentToFrame(){
        frame.add(label19);
        frame.add(label18);
        frame.add(label14);
        frame.add(label15);
        frame.add(label16);
        frame.add(label17);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);
        frame.add(label11);
        frame.add(label12);
        frame.add(label13);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);
        frame.add(textField5);
        frame.add(textField6);
        frame.add(textField7);
        frame.add(textField8);
        frame.add(textArea);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}
