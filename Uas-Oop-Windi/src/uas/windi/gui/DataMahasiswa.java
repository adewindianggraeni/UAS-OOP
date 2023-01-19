package uas.windi.gui;

import javax.swing.*;

public class DataMahasiswa extends JFrame{
    private JPanel panelMain;
    private JTextField txtNama;
    private JTextField txtNim;
    private JTextField txtKelas;
    private JButton btnSave;
    private JButton btnDelete;
    private JButton btnClear;
    private JLabel lblNama;
    private JLabel lblNim;
    private JLabel lblKelas;

    public DataMahasiswa() {
        super("Data Mahasiswa");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
    }

    public static void main(String[] args) {
        DataMahasiswa dataMahasiswa = new DataMahasiswa();
        dataMahasiswa.setVisible(true);
    }
}
