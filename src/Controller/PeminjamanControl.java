/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.PeminjamanDAO;
import DAOImplement.PeminjamanImplement;
import Model.Buku;
import Model.ModelTabelBuku;
import Model.ModelTabelPeminjaman;
import Model.Peminjaman;
import View.PeminjamanPage;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author L E N O V O
 */

public class PeminjamanControl {

    private final PeminjamanPage frame;
    private final PeminjamanImplement implPeminjaman;
    private List<Buku> lb;
    private List<Peminjaman> lp;

    public PeminjamanControl(PeminjamanPage frame) {
        this.frame = frame;
        implPeminjaman = new PeminjamanDAO();
        lb = implPeminjaman.getAllBook();
        lp = implPeminjaman.getAllPeminjaman();
    }

    public void isitabel() {
        lb = implPeminjaman.getAllBook();
        lp = implPeminjaman.getAllPeminjaman();
        ModelTabelBuku mb = new ModelTabelBuku(lb);
        ModelTabelPeminjaman mp = new ModelTabelPeminjaman(lp);
        frame.getTabelDataBuku().setModel(mb);
        frame.getTabelDataPinjam().setModel(mp);
    }

    public void search() {
        String by = frame.getSearchBy().getSelectedItem().toString().toLowerCase();
        String text = frame.getCariBuku().getText();
        lb = implPeminjaman.search(by, text);
        ModelTabelBuku mb = new ModelTabelBuku(lb);
        frame.getTabelDataBuku().setModel(mb);
    }

    public void insert() {
        if (isInputValid()) {
            try {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setKode_buku(Integer.parseInt(frame.getInputKode().getText()));
                peminjaman.setNama_mhs(frame.getInputNama().getText());
                implPeminjaman.insert(peminjaman);
                JOptionPane.showMessageDialog(null, "Peminjaman berhasil ditambahkan!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Kode buku harus berupa angka!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mohon lengkapi semua input!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isInputValid() {
        return !frame.getInputKode().getText().isEmpty() && !frame.getInputNama().getText().isEmpty();
    }
}
