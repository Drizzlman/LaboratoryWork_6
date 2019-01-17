import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Reader extends JFrame {
    int additional, typeFuel;
    Object boxA, boxB, boxC, boxD;
    File file = new File("E:\\GUI.doc");
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JComboBox box_1, box_2, box_3, box_4;
    JRadioButton flag1, flag2, flag3, flag4;
    ButtonGroup bg, bf;
    static JButton b, del;
    static JTextField text, text2, text3;
    static JCheckBox Check_1, Check_2;
    //  static JTextArea area;
    static String[] box2 = {"", "Audi", "BMW", "Ford", "volkswagen", "KIA", "Mercedes", "Toyota", "Skoda", "Nissan", "Mitsubishi", "Honda", "Mazda", "Lexus"};
    static String[] box1 = {"", "Gray ", "Black", "White", "Blue", "Red", "Yellow", "Purple", "Green", "Pink", "Orange", "DarkRed", "DarkGray"};
    static String[] box3 = {"", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
    static String[] box4 = {"", "1.8", "1.9", "2.0", "2.2", "2.4", "2.6", "2.8", "3.0", "3.5", "4.6", "5.0", "8.0"};

    public Reader(String str) {
        super(str);
        setSize(700, 500);
        getContentPane().setBackground(Color.GRAY);
        // setBackground(Color.darkGray);
        // setBackground();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("Add in base") {{
            setBackground(Color.lightGray);
        }};
        b.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.darkGray, 1, false),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        del = new JButton("Clear") {{
            setBackground(Color.lightGray);
        }};
        del.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.darkGray, 1, false),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        text = new JTextField(9);
        text2 = new JTextField(9);
        text3 = new JTextField(9);
        //area = new JTextArea(9, 9);
        l1 = new JLabel("Enter your name:");
        l2 = new JLabel("Enter type of car:");
        l3 = new JLabel("Choose a color:");
        l4 = new JLabel("With individual style?");
        l5 = new JLabel("Choose model:");
        l6 = new JLabel("Enter V:");
        l7 = new JLabel("Enter year:");
        l8 = new JLabel("Choose your phone and any info:");
        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        box_3 = new JComboBox(box3);
        box_4 = new JComboBox<Object>(box4);
       /* Check_1 = new JCheckBox("Diesel");
        Check_2 = new JCheckBox("Petrol");*/
        flag1 = new JRadioButton("YES");
        flag2 = new JRadioButton("NO");
        flag3 = new JRadioButton("Diesel ");
        flag4 = new JRadioButton("Petrol");
        bg = new ButtonGroup();
        bf = new ButtonGroup();
        bg.add(flag1);
        bg.add(flag2);
         bf.add(flag3);
         bf.add(flag4);

        setLayout(null);
        b.setSize(200, 30);
        b.setLocation(355, 300);
        del.setSize(100, 30);
        del.setLocation(355, 350);
        text.setSize(220, 25);
        text.setLocation(30, 50);
        //text.setBorder(BorderFactory.createCompoundBorder(
        //      new LineBorder(Color.darkGray, 2, false),
        //    BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        text.setBackground(Color.lightGray);
        text2.setSize(220, 25);
        text2.setLocation(30, 110);
        // text2.setBorder(BorderFactory.createCompoundBorder(
        //       new LineBorder(Color.darkGray, 2, false),
        //     BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        text2.setBackground(Color.lightGray);
        text3.setSize(220, 150);
        text3.setLocation(30, 300);//add
        text3.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.darkGray, 2, false),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)));
        text3.setBackground(Color.lightGray);
        l1.setSize(200, 25);
        l1.setLocation(30, 20);
        l2.setSize(220, 25);
        l2.setLocation(30, 80);
        l3.setSize(200, 25);
        l3.setLocation(30, 140);
        l4.setSize(200, 25);
        l4.setLocation(30, 200);
        l5.setSize(200, 25);
        l5.setLocation(355, 20);//add
        l6.setSize(200, 25);
        l6.setLocation(355, 140);
        l7.setSize(200, 25);
        l7.setLocation(355, 200);
        l8.setSize(200, 25);
        l8.setLocation(30, 265);
        box_1.setSize(220, 25);
        box_1.setLocation(30, 170);
        box_1.setBackground(Color.lightGray);
        box_2.setSize(220, 25);
        box_2.setLocation(355, 50);
        box_2.setBackground(Color.lightGray);
        box_3.setSize(220, 25);
        box_3.setLocation(355, 230);
        box_3.setBackground(Color.lightGray);
        box_4.setSize(220, 25);
        box_4.setLocation(355, 170);
        box_4.setBackground(Color.lightGray);

       /* Check_1.setSize(70, 50);
        Check_1.setLocation(355, 90);
        //Check_1.setSelected(false);
        Check_1.setBackground(Color.GRAY);

        Check_2.setSize(70, 50);
        Check_2.setLocation(475, 90);
        //Check_1.setSelected(false);
        Check_2.setBackground(Color.GRAY);*/

        flag1.setSize(50, 35);
        flag1.setLocation(30, 220);
        flag1.setBackground(Color.GRAY);
        flag2.setSize(50, 35);
        flag2.setLocation(100, 220);
        flag2.setBackground(Color.GRAY);
        flag3.setSize(70, 50);
        flag3.setLocation(355, 90);//add
        flag3.setBackground(Color.GRAY);
        flag4.setSize(70, 50);
        flag4.setLocation(475, 90);//add
        flag4.setBackground(Color.GRAY);
        //flag2.setSize(50, 35);
        //flag.setLocation(100, 220);
        add(b);
        add(del);
        add(text);
        add(text2);
        add(text3);
        // add(area);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(box_1);
        add(box_2);
        add(box_3);
        add(box_4);
    /*    add(Check_1);
        add(Check_2);*/
        add(flag1);
        add(flag2);
        add(flag3);
        add(flag4);

        b.addActionListener(new ButtonActionListener());
        flag1.addActionListener(new FlagActionListener());
        flag2.addActionListener(new FlagActionListener());
        flag3.addActionListener(new CheckBoxActionListener());
        flag4.addActionListener(new CheckBoxActionListener());
        del.addActionListener(new DelActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        box_3.addActionListener(new BoxActionListener());
        box_4.addActionListener(new BoxActionListener());

        /*Check_1.addActionListener(new CheckBoxActionListener());
        Check_2.addActionListener(new CheckBoxActionListener());*/
    }

    public class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if(text.getText().equals("") && text2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please entering field");
                }
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter out = new FileWriter(file, true);
                try {
                    String text1 = text.getText();
                    String text_2 = text2.getText();
                    String text_3 = text3.getText();
                 /*   String check1 = Check_1.getText();
                    String check2 = Check_2.getText();
*/
                    //String area2 = area.getText();
                    out.write("Name of client - " + text1 + ".\n");
                    out.write("Client chose " + text_2 + "car.\n");
                    //out.write(text_3 + "\n");
                    //out.write(area2 + "\n");
                    if (additional == -1 && typeFuel == -1) {
                        out.write("Client do not chose individual color." + "\n");
                        out.write("Client want " + boxA + " car;\nWhich model " + boxB + ";\nOn petrol fuel;\nWith V: " + boxD + " engine;\nYear poduction " + boxC + ".\nSome information from client:\n" + text_3);
                    }
                    else if(additional == -1 && typeFuel == 1) {
                        out.write("Client do not chose individual color." + "\n");
                        out.write("Client want " + boxA + " car;\nWhich model " + boxB + ";\nOn diesel fuel;\nWith V: " + boxD + " engine;\nYear poduction " + boxC + ".\nSome information from client:\n" + text_3);
                    }
                    /*else if(additional == -1 && typeFuel == 1 && typeFuel == -1){
                        out.write("Client do not chose individual color." + "\n");
                        out.write("Client want " + boxA + " car;\n Which model " + boxB + ";\nOn "+ check1+" and "+ check2 + "fuel;\n With V " + boxD + " engine\nYear poduction " + boxC + "\n Some information from client:\n" + text_3);

                    }
                    else if( additional == 1 && typeFuel == 1 && typeFuel == -1 ){
                        out.write("Client chose individual color." + "\n");
                        out.write("Client want " + boxA + " car;\n Which model " + boxB + ";\nOn "+ check1+" and "+ check2  + "fuel;\n With V " + boxD + " engine\nYear poduction " + boxC + "\n Some information from client:\n" + text_3);
                    }*/
                    else if (additional == 1 && typeFuel == -1){
                        out.write("Client chose individual color." + "\n");
                        out.write("Client want " + boxA + " car;\nWhich model " + boxB + ";\nOn petrol fuel;\nWith V: " + boxD + " engine;\nYear poduction " + boxC + ".\nSome information from client:\n" + text_3);
                    }
                    else if (additional == 1 && typeFuel == 1){
                        out.write("Client chose individual color." + "\n");
                        out.write("Client want " + boxA + " car;\nWhich model " + boxB + ";\nOn diesel fuel;\nWith V: " + boxD + " engine;\nYear poduction " + boxC + ".\nSome information from client:\n" + text_3);
                    }
                    // if (additional == 1 && typeFuel == -1)
                    // out.write("Client chose individual color." + "\n");
                    //out.write(" (Client want " + boxA + " car;\n Which model " + boxB + ";\nOn "+ check2 + "fuel;\n With V " + boxD + " engine\nYear poduction " + boxC + "\n Some information from client:\n" + text_3);

                } finally {
                    out.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            additional = 0;
            if (e.getSource() == flag1) {
                additional++;
            } else if (e.getSource() == flag2) {
                additional--;
            }
        }
    }

    public class CheckBoxActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            typeFuel = 0;
            if (e.getSource() == flag3) {
                typeFuel++;

            } else if (e.getSource() == flag4) {
                typeFuel--;
            }

        }
    }

    public class DelActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == del) {
                text.setText(null);
                text2.setText(null);
                text3.setText(null);
                //area.setText(null);

            }
        }
    }

    public class BoxActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == box_1) {
                boxA = box_1.getSelectedItem();
            }
            if (e.getSource() == box_2) {
                boxB = box_2.getSelectedItem();
            }
            if (e.getSource() == box_3) {
                boxC = box_3.getSelectedItem();

            }
            if (e.getSource() == box_4) {
                boxD = box_4.getSelectedItem();
            }
        }
    }
}
