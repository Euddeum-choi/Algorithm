package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Jframe ex");
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);

        Container container = jFrame.getContentPane();
        container.setBackground(Color.blue);
        container.setLayout(new FlowLayout());

        container.add(new JButton("OK"));
        container.add(new JButton("Cancel"));
        container.add(new JButton("Ignore"));

        jFrame.setVisible(true);
    }
}
