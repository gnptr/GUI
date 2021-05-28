package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunFormMahasiswa {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("DATA MAHASISWA");
        jFrame.setContentPane(new FormMahasiswa().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 300);
        jFrame.setVisible(true);

    }
}
