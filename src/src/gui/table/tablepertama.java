package gui.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tablepertama {
    private JPanel rootPanel;
    private JTextField textangka;
    private JButton buttonurut;
    private JTable outputtable;
    private JTextField textangkaku;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public tablepertama() {
        this.inicomponents();
        buttonurut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) outputtable.getModel();
                String angka = textangkaku.getText();
                int jumlah = Integer.parseInt(textangka.getText());
                String[] exc = angka.split(",");
               if(angka.isBlank()){
                   JOptionPane.showMessageDialog(rootPanel, "Data Tidak Ada", "Warning" ,
                           JOptionPane.WARNING_MESSAGE);
               }
               if (!added) {
                   for (int i = 0; i < jumlah; i++) {
                       model.addRow(new Object[]{});
                   }
                   added = true;
               }
               int a = 0;
               for (int i : array.getascenden(angka, jumlah)){
                   model.setValueAt(i, a, 0);
                   a++;
               }
               int b = 0;
                for (int i : array.getdescenden(angka, jumlah)){
                    model.setValueAt(i, b, 1);
                    b++;
               }
            }
        });
    }
    private void inicomponents(){
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] inidata = {
        };
        tableModel = new DefaultTableModel(inidata, tableColom);
        //set table model
        outputtable.setModel(tableModel);
        //menampilkan sorting
        outputtable.setAutoCreateRowSorter(true);
        //enable single selection
        outputtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
