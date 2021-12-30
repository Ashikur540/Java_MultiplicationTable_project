/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import javax.swing.JFrame;

/**
 *
 * @author Ashikur Rahman
 */
public class Main {
    public static void main(String[] args) {
         MultiplicationTable frame = new MultiplicationTable();

        frame.setVisible(true);
        frame.setTitle("MULTIPLICATION TABLE GENERATOR");

        frame.setBounds(500, 200, 480, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
