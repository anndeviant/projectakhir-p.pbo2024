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

/**
 *
 * @author L E N O V O
 */
public class BukuControl {

    BukuPage frame;
    BukuImplement impldatabuku;
    List<Buku> db;

    public BukuControl(BukuPage frame) {
        this.frame = frame;
        impldatabuku = new BukuDAO();
        db = impldatabuku.getAll();
    }

    public void isitabel() {
        db = impldatabuku.getAll();
        ModelTabelBuku mb = new ModelTabelBuku(db);
        frame.getTabelDataBuku().setModel(mb);
    }

    public void insert() {
        Buku db = new Buku();
        db.setJudul(frame.getInputJudul().getText());
        db.setPenulis(frame.getInputPenulis().getText());
        db.setPenerbit(frame.getInputPenerbit().getText());
        db.setGenre(frame.getInputGenre().getText());
        db.setIsbn(frame.getInputISBN().getText());
        impldatabuku.insert(db);
    }

    public void update() {
        Buku db = new Buku();
        db.setJudul(frame.getInputJudul().getText());
        db.setPenulis(frame.getInputPenulis().getText());
        db.setPenerbit(frame.getInputPenerbit().getText());
        db.setGenre(frame.getInputGenre().getText());
        db.setIsbn(frame.getInputISBN().getText());
        db.setId(Integer.parseInt(frame.getInputKode().getText()));
        impldatabuku.update(db);
    }

    public void delete() {
        int id = Integer.parseInt(frame.getInputKode().getText());
        impldatabuku.delete(id);
    }

    public void search() {
        String by = frame.getSearchBy().getSelectedItem().toString();
        by = by.toLowerCase();
        String text = frame.getCariBuku().getText();
        db = impldatabuku.search(by, text);
        ModelTabelBuku mb = new ModelTabelBuku(db);
        frame.getTabelDataBuku().setModel(mb);
    }
}
