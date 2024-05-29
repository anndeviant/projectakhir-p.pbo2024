/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.PengurusDAO;
import DAOImplement.PengurusImplement;
import Model.ModelTabelPengurus;
import Model.Pengurus;
import View.PengurusPage;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public class PengurusControl {

    PengurusPage frame;
    PengurusImplement impldatapengurus;
    List<Pengurus> db;

    public PengurusControl(PengurusPage frame) {
        this.frame = frame;
        impldatapengurus = new PengurusDAO();
        db = impldatapengurus.getAll();
    }

    public void isitabel() {
        db = impldatapengurus.getAll();
        ModelTabelPengurus mb = new ModelTabelPengurus(db);
        frame.getTabelDataPengurus().setModel(mb);
    }

    public void delete() {
        int id = Integer.parseInt(frame.getID().getText());
        impldatapengurus.delete(id);
    }
}
