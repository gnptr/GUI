package gui.table;
import javax.swing.*;

public class runtabelpertama {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored){
        }
        ImageIcon imageIcon = new ImageIcon("res/IMG-20210528-WA0100.jpg");
        JFrame jFrame = new JFrame("URUTKAN");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new tablepertama().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(350, 300);
        jFrame.setVisible(true);
    }
}
