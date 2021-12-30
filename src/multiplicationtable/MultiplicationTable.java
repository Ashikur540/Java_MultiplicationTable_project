/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private Container c;
    private JLabel lbimg, lb1, lb2;
    private JTextArea ta;
    private JTextField tf;
    private JButton bt;
    private ImageIcon img;
    private Font fnt, fntB;

    //constructor
    MultiplicationTable() {
        components();
    }
    //method

    public void components() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
//    img=new ImageIcon(getClass().getResource("table.jpg"));
//    lbi=new JLabel();
//    lbi.setBounds(10,20,img.getIconHeight(),img.getIconWidth());
        lbimg = new JLabel();
        lbimg.setText("MULTIPLICATION TABLE");
//        lbimg.setHorizontalAlignment(CENTER);
        lbimg.setBounds(40, 25, 400, 150);
        lbimg.setBackground(Color.DARK_GRAY);
        lbimg.setForeground(Color.WHITE);
        lbimg.setOpaque(true);//
        fntB = new Font("     Montserrat", Font.BOLD, 22);
        lbimg.setFont(fntB);
        c.add(lbimg);
//    validate();
        fnt = new Font("Montserrat", Font.BOLD, 18);

//    labels
        lb1 = new JLabel("Enter any Number:");
        lb1.setBounds(40, 210, 180, 30);
        lb1.setFont(fnt);
        c.add(lb1);
        //input ta
        tf = new JTextField();
        tf.setBounds(230, 210, 100, 40);
        tf.setFont(fnt);
        c.add(tf);
        //output 
        ta = new JTextArea();
        ta.setBounds(100, 280, 280, 280);
        ta.setFont(fnt);
        c.add(ta);
        //button clear
        bt = new JButton("Clear");
        bt.setBounds(340, 210, 100, 40);
        c.add(bt);
        //action1
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                String input = tf.getText();
                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                } else {
                    String s = tf.getText();
                    int num = Integer.parseInt(s);
                    for (int i = 1; i <= 10; i++) {
                        int mresult = num * i;
                        //converting num to string to show on jtext area cz it only undersatnds string
                        String r = String.valueOf(mresult);
                        String snum = String.valueOf(num);
                        String inc = String.valueOf(i);
                        ta.append(num + "X" + inc + "=" + r + "\n");
                    }
                }
            }

        });//end of ActionListener
        //action 2
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                ta.setText("");
                tf.setText("");
            }

        });//end of ActionListener
    }

    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();

        frame.setVisible(true);
        frame.setTitle("MULTIPLICATION TABLE GENERATOR");

        frame.setBounds(500, 200, 480, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

}
