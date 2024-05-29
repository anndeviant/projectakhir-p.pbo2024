/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.ReturDAO;
import DAOImplement.ReturImplement;
import Model.ModelTabelBuku;
import Model.ModelTabelPeminjaman;
import Model.Peminjaman;
import View.ReturPage;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public class ReturControl {

    ReturPage frame;
    ReturImplement implRetur;
    List<Peminjaman> lp;

    public ReturControl(ReturPage frame) {
        this.frame = frame;
        implRetur = new ReturDAO();
        lp = implRetur.getAllPeminjaman();
    }

    public void isitabel() {
        lp = implRetur.getAllPeminjaman();
        ModelTabelPeminjaman mp = new ModelTabelPeminjaman(lp);
        frame.getTabelDataRetur().setModel(mp);
    }

    public void delete() {
        int id = Integer.parseInt(frame.getInputKode().getText());
        implRetur.delete(id);
    }

    public void search() {
        String text = frame.getCariPeminjam().getText();
        lp = implRetur.search(text);
        ModelTabelPeminjaman mb = new ModelTabelPeminjaman(lp);
        frame.getTabelDataRetur().setModel(mb);
    }
}
