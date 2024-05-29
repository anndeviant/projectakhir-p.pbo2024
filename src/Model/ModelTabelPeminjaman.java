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
public class ModelTabelPeminjaman extends AbstractTableModel {

    List<Peminjaman> lP;

    public ModelTabelPeminjaman(List<Peminjaman> lP) {
        this.lP = lP;
    }

    @Override
    public int getRowCount() {
        return lP.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Kode Buku";
            case 2:
                return "Nama Peminjam";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lP.get(row).getId();
            case 1:
                return lP.get(row).getKode_buku();
            case 2:
                return lP.get(row).getNama_mhs();
            default:
                return null;
        }
    }

}
