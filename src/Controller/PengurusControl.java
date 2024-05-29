package Controller;

import DAOData.PengurusDAO;
import DAOImplement.PengurusImplement;
import Model.ModelTabelPengurus;
import Model.Pengurus;
import View.PengurusPage;
import javax.swing.JOptionPane;
import java.util.List;

public class PengurusControl {

    private final PengurusPage frame;
    private final PengurusImplement implDataPengurus;
    private List<Pengurus> db;

    public PengurusControl(PengurusPage frame) {
        this.frame = frame;
        implDataPengurus = new PengurusDAO();
        db = implDataPengurus.getAll();
    }

    public void isitabel() {
        db = implDataPengurus.getAll();
        ModelTabelPengurus mb = new ModelTabelPengurus(db);
        frame.getTabelDataPengurus().setModel(mb);
    }

    public void delete() {
        try {
            int id = Integer.parseInt(frame.getID().getText());
            implDataPengurus.delete(id);
            JOptionPane.showMessageDialog(null, "Data pengurus berhasil dihapus!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Click Anggota Pada Tabel!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
