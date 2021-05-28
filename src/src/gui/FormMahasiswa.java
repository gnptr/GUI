package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMahasiswa {
    private JTextField textnama;
    private JTextField textNIM;
    private JButton buttonsave;
    private JTextField labelnama;
    private JPanel rootPanel;
    private JTextField labeljenjang;
    private JTextField labeltahun;
    private JTextField labelfakultas;
    private JTextField labeljurusan;
    private JTextField labeljenis;
    private JTextField labelnomor;
    private JTextField labelnim;

    public FormMahasiswa() {
        buttonsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = textnama.getText();
                String Nim = textNIM.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNim(Nim);
                labelnama.setText("Nama : " + mhs.getNama());
                labelnim.setText("NIM :" + mhs.getNim());
                labeljenjang.setText("Jenjang Pendidikan :" + mhs.getJenjangPendidikan());
                labeltahun.setText("Tahun Masuk :" + mhs.getTahunMasuk());
                labelfakultas.setText("Fakultas :" + mhs.getFakultas());
                labeljurusan.setText("Jurusan :" + mhs.getJurusan());
                labeljenis.setText("Jenis Kelamin :" + mhs.getJenisKelamin());
                labelnomor.setText(mhs.getNomorUrut());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}

