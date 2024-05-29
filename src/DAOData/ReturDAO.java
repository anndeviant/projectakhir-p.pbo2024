/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOData;

import Connection.Connector;
import DAOImplement.BukuImplement;
import Model.Buku;
import Model.Peminjaman;
import Model.Pengurus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOImplement.PeminjamanImplement;
import DAOImplement.ReturImplement;

/**
 *
 * @author L E N O V O
 */
public class ReturDAO implements ReturImplement {

    Connection connection;
    final String selectpeminjaman = "SELECT * FROM peminjaman";
    final String delete = "delete from peminjaman where kode_buku=?";

    public ReturDAO() {
        connection = Connector.connection();
    }

    @Override
    public List<Peminjaman> getAllPeminjaman() {
        List<Peminjaman> db = null;
        try {
            db = new ArrayList<Peminjaman>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectpeminjaman);
            while (rs.next()) {
                Peminjaman pinjam = new Peminjaman();
                pinjam.setId(rs.getInt("id"));
                pinjam.setKode_buku(rs.getInt("kode_buku"));
                pinjam.setNama_mhs(rs.getString("nama_mhs"));
                db.add(pinjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
    }

    @Override
    public void delete(int kode_buku) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, kode_buku);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Peminjaman> search(String like) {
        String search = "SELECT * FROM peminjaman WHERE kode_buku LIKE ?";
        PreparedStatement statement = null;
        List<Peminjaman> dbs = null;

        try {
            dbs = new ArrayList<Peminjaman>();
            statement = connection.prepareStatement(search);
            statement.setString(1, "%" + like + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Peminjaman peminjam = new Peminjaman();
                peminjam.setId(rs.getInt("id"));
                peminjam.setKode_buku(rs.getInt("kode_buku"));
                peminjam.setNama_mhs(rs.getString("nama_mhs"));
                dbs.add(peminjam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbs;
    }

}
