/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOData;

import Connection.Connector;
import DAOImplement.BukuImplement;
import Model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L E N O V O
 */
public class BukuDAO implements BukuImplement {

    Connection connection;

    final String select = "SELECT * FROM buku";
    final String genre = "SELECT DISTINCT genre FROM buku ORDER BY genre ASC";
    final String searchByGenre = "SELECT * FROM buku WHERE genre=?";
    final String insert = "INSERT INTO buku(judul, penulis, penerbit, genre, isbn) VALUES (?, ?, ?, ?, ?);";
    final String update = "update buku set judul=?, penulis=?, penerbit=?, genre=?, isbn=? where id=?";
    final String delete = "delete from buku where id=?";

    public BukuDAO() {
        connection = Connector.connection();
    }

    @Override
    public void insert(Buku p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPenulis());
            statement.setString(3, p.getPenerbit());
            statement.setString(4, p.getGenre());
            statement.setString(5, p.getIsbn());
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
    public void update(Buku p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPenulis());
            statement.setString(3, p.getPenerbit());
            statement.setString(4, p.getGenre());
            statement.setString(5, p.getIsbn());
            statement.setInt(6, p.getId());
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
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
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
    public List<Buku> getAll() {
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

    public List<Buku> getBookByGenre(String genre) {
        PreparedStatement statement = null;
        List<Buku> db = null;
        try {
            db = new ArrayList<Buku>();
            statement = connection.prepareStatement(searchByGenre);
            statement.setString(1, genre);
            ResultSet rs = statement.executeQuery();
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

    ;
   
    @Override
    public List<Buku> search(String by, String text) {
        String search = "SELECT * FROM buku WHERE " + by + " LIKE ?";
        PreparedStatement statement = null;
        List<Buku> dbs = null;

        try {
            dbs = new ArrayList<Buku>();
            statement = connection.prepareStatement(search);
            statement.setString(1, "%" + text + "%");
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
