/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.BukuDAO;
import DAOImplement.BukuImplement;
import View.*;
import java.util.List;
import Model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author L E N O V O
 */
public class BukuControl {

    private final BukuPage frame;
    private final BukuImplement implDataBuku;

    public BukuControl(BukuPage frame) {
        this.frame = frame;
        implDataBuku = new BukuDAO();
    }

    public void isitabel() {
        List<Buku> db = implDataBuku.getAll();
        ModelTabelBuku mb = new ModelTabelBuku(db);
        frame.getTabelDataBuku().setModel(mb);
    }

    public void insert() {
        if (areInputsValid()) {
            Buku buku = new Buku();
            buku.setJudul(frame.getInputJudul().getText());
            buku.setPenulis(frame.getInputPenulis().getText());
            buku.setPenerbit(frame.getInputPenerbit().getText());
            buku.setGenre(frame.getInputGenre().getText());
            buku.setIsbn(frame.getInputISBN().getText());
            implDataBuku.insert(buku);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Mohon lengkapi semua input!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update() {
        if (areInputsValid()) {
            Buku buku = new Buku();
            buku.setJudul(frame.getInputJudul().getText());
            buku.setPenulis(frame.getInputPenulis().getText());
            buku.setPenerbit(frame.getInputPenerbit().getText());
            buku.setGenre(frame.getInputGenre().getText());
            buku.setIsbn(frame.getInputISBN().getText());
            buku.setId(Integer.parseInt(frame.getInputKode().getText()));
            implDataBuku.update(buku);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Mohon lengkapi semua input!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete() {
        if (!frame.getInputKode().getText().isEmpty()) {
            try {
                int id = Integer.parseInt(frame.getInputKode().getText());
                implDataBuku.delete(id);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID harus berupa angka!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Click Data Pada Tabel yang Mau Dihapus!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void search() {
        String by = frame.getSearchBy().getSelectedItem().toString().toLowerCase();
        String text = frame.getCariBuku().getText();
        if (!text.isEmpty() && !by.isEmpty()) {
            List<Buku> db = implDataBuku.search(by, text);
            ModelTabelBuku mb = new ModelTabelBuku(db);
            frame.getTabelDataBuku().setModel(mb);
        } else {
            JOptionPane.showMessageDialog(null, "Masukkan teks untuk pencarian!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean areInputsValid() {
        return !frame.getInputJudul().getText().isEmpty()
                && !frame.getInputPenulis().getText().isEmpty()
                && !frame.getInputPenerbit().getText().isEmpty()
                && !frame.getInputGenre().getText().isEmpty()
                && !frame.getInputISBN().getText().isEmpty();
    }
}
