package koneksidatabase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewPraktikum extends JFrame {
    //tampilan aja
    JLabel lNim = new JLabel("NIM    :");
    JTextField tfNim = new JTextField();
    JLabel lNamaMhs = new JLabel("Nama Mahasiswa   :");
    JTextField tfNamaMhs = new JTextField();
    JLabel lAlamatMhs = new JLabel("Alamat Mahasiswa  :");
    JTextField tfAlamatMhs = new JTextField();
    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");
    JButton btnEditPanel = new JButton("Edit");
    JLabel lNote1 = new JLabel("Langkah Update dan Hapus Data");
    JLabel lNote2 = new JLabel("1. Klik salah satu baris data");
    JLabel lNote3 = new JLabel("2. Klik tombol Update atau Hapus");
    JLabel lNote4 = new JLabel("a. Jika klik tombol Update, maka data asal keluar di form. Anda bisa edit data disana. Setelah selesai, klik tombol Edit");
    JLabel lNote5 = new JLabel("b. Jika klik tombol Hapus, maka ada menu pop up. Jika akan dihapus, klik tombol Ya");
    JButton btnUpdate = new JButton("Update");
    JButton btnHapus = new JButton("Hapus");
    
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"NIM","Nama","Alamat"}; //membuat kolom dgn array tipe object;

    public ViewPraktikum() {
        tableModel = new DefaultTableModel(namaKolom,0); //0 menandakan jumlah baris 
        tabel = new JTable(tableModel); //tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
        setLayout(null);
        setSize(600, 500);
        
        add(lNim);
        lNim.setBounds(5, 5, 110, 20);
        add(tfNim);
        tfNim.setBounds(150, 5, 120, 20);
        add(lNamaMhs);
        lNamaMhs.setBounds(5, 30, 140, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(150, 30, 120, 20);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(5, 55, 140, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(150, 55, 120, 20);
        add(btnTambahPanel);
        btnTambahPanel.setBounds(20, 105, 90, 20);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(130, 105, 90, 20);
        add(btnEditPanel);
        btnEditPanel.setBounds(240, 105, 90, 20);
        add(lNote1);
        lNote1.setBounds(20, 130, 300, 20);
        add(lNote2);
        lNote2.setBounds(20, 150, 300, 20);
        add(lNote3);
        lNote3.setBounds(20, 170, 300, 20);
        add(lNote4);
        lNote4.setBounds(20, 190, 800, 20);
        add(lNote5);
        lNote5.setBounds(20, 210, 600, 20);
        add(btnUpdate);
        btnUpdate.setBounds(480, 240, 90, 20);
        add(btnHapus);
        btnHapus.setBounds(480, 270, 90, 20);
        
        //TABEL
        add(scrollPane); 
        scrollPane.setBounds(20, 240, 450, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollpane-nya vertikal
        
        
    }

    public String getNim(){
        return tfNim.getText();
    }
    public String getNama(){
        return tfNamaMhs.getText();
    }
    public String getAlamat(){
        return tfAlamatMhs.getText();
    }
}
