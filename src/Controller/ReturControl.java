package Controller;

import DAOData.ReturDAO;
import DAOImplement.ReturImplement;
import Model.ModelTabelPeminjaman;
import Model.Peminjaman;
import View.ReturPage;
import javax.swing.JOptionPane;
import java.util.List;

public class ReturControl {

    private final ReturPage frame;
    private final ReturImplement implRetur;
    private List<Peminjaman> lp;

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
        try {
            int id = Integer.parseInt(frame.getInputKode().getText());
            implRetur.delete(id);
            JOptionPane.showMessageDialog(null, "Data peminjaman berhasil dihapus!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Click Tabel Data yang Mau Dihapus!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void search() {
        String text = frame.getCariPeminjam().getText();
        if (!text.isEmpty()) {
            lp = implRetur.search(text);
            ModelTabelPeminjaman mb = new ModelTabelPeminjaman(lp);
            frame.getTabelDataRetur().setModel(mb);
        } else {
            JOptionPane.showMessageDialog(null, "Masukkan teks untuk pencarian!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
