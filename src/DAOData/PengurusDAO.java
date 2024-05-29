/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOData;

import Connection.Connector;
import DAOImplement.PengurusImplement;
import Model.Buku;
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
import DAOImplement.RegisterImplement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public class PengurusDAO implements PengurusImplement {

    Connection connection;
    final String select = "select * from pengurus";
    final String delete = "delete from pengurus where id=?";

    public PengurusDAO() {
        connection = Connector.connection();
    }

    @Override
    public List<Pengurus> getAll() {
        List<Pengurus> db = null;
        try {
            db = new ArrayList<Pengurus>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Pengurus pengurus = new Pengurus();
                pengurus.setId(rs.getInt("id"));
                pengurus.setNama_lengkap(rs.getString("nama_lengkap"));
                pengurus.setUsername(rs.getString("username"));
                db.add(pengurus);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;
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
}
