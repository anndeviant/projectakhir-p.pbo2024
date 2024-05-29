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

/**
 *
 * @author L E N O V O
 */
public class PeminjamanDAO implements PeminjamanImplement {

    Connection connection;
    final String select = "SELECT * FROM buku";
    final String selectpeminjaman = "SELECT * FROM peminjaman";
    final String searchByGenre = "SELECT * FROM buku WHERE genre=?";
    final String insertPinjam = "INSERT INTO `peminjaman` (`kode_buku`, `nama_mhs`) VALUES (?, ?);";

    public PeminjamanDAO() {
        connection = Connector.connection();
    }

    @Override
    public void insert(Peminjaman p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insertPinjam, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, p.getKode_buku());
            statement.setString(2, p.getNama_mhs());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                p.setId(rs.getInt(1));
            }

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
    public List<Buku> getAllBook() {
        List<Buku> db = null;
        try {
            db = new ArrayList<Buku>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setId(rs.getInt("id"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setGenre(rs.getString("genre"));
                buku.setIsbn(rs.getString("isbn"));
                db.add(buku);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
    }

    @Override
    public List<Buku> search(String by, String like) {
        String search = "SELECT * FROM buku WHERE " + by + " LIKE ?";
        PreparedStatement statement = null;
        List<Buku> dbs = null;

        try {
            dbs = new ArrayList<Buku>();
            statement = connection.prepareStatement(search);
            statement.setString(1, "%" + like + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setId(rs.getInt("id"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setGenre(rs.getString("genre"));
                buku.setIsbn(rs.getString("isbn"));
                dbs.add(buku);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbs;
    }
}
