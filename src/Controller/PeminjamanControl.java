/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.BukuDAO;
import DAOData.PeminjamanDAO;
import DAOImplement.BukuImplement;
import DAOImplement.PeminjamanImplement;
import Model.Buku;
import Model.ModelTabelBuku;
import Model.ModelTabelPeminjaman;
import Model.Peminjaman;
import View.BukuPage;
import View.PeminjamanPage;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public class PeminjamanControl {

    PeminjamanPage frame;
    PeminjamanImplement implPeminjaman;
    List<Buku> lb;
    List<Peminjaman> lp;

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
        String by = frame.getSearchBy().getSelectedItem().toString();
        by = by.toLowerCase();
        String text = frame.getCariBuku().getText();
        lb = implPeminjaman.search(by, text);
        ModelTabelBuku mb = new ModelTabelBuku(lb);
        frame.getTabelDataBuku().setModel(mb);
    }

    public void insert() {
        Peminjaman dp = new Peminjaman();
        dp.setKode_buku(Integer.parseInt(frame.getInputKode().getText()));
        dp.setNama_mhs(frame.getInputNama().getText());
        implPeminjaman.insert(dp);
    }
}
