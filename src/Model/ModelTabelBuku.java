/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author L E N O V O
 */
public class ModelTabelBuku extends AbstractTableModel {

    List<Buku> db;

    public ModelTabelBuku(List<Buku> db) {
        this.db = db;
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "id";
            case 1:
                return "judul";
            case 2:
                return "genre";
            case 3:
                return "penulis";
            case 4:
                return "penerbit";
            case 5:
                return "isbn";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return db.get(row).getId();
            case 1:
                return db.get(row).getJudul();
            case 2:
                return db.get(row).getGenre();
            case 3:
                return db.get(row).getPenulis();
            case 4:
                return db.get(row).getPenerbit();
            case 5:
                return db.get(row).getIsbn();
            default:
                return null;
        }
    }

}
