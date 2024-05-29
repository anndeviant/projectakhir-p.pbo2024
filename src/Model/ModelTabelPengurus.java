/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public class ModelTabelPengurus extends AbstractTableModel {

    List<Pengurus> dP;

    public ModelTabelPengurus(List<Pengurus> dP) {
        this.dP = dP;
    }

    @Override
    public int getRowCount() {
        return dP.size();
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
                return "Nama lengkap";
            case 2:
                return "Username";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dP.get(row).getId();
            case 1:
                return dP.get(row).getNama_lengkap();
            case 2:
                return dP.get(row).getUsername();
            default:
                return null;
        }
    }
}
