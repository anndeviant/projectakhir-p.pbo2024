/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOData;

import Connection.Connector;
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

/**
 *
 * @author L E N O V O
 */
public class RegisterDAO implements RegisterImplement {

    Connection connection;

    final String register = "INSERT INTO pengurus (nama_lengkap, username, password) VALUES (?, ?, ?)";


    public RegisterDAO() {
        connection = Connector.connection();
    }

    @Override
    public boolean validasiRegister(String nama_lengkap, String username, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement(register);
            statement.setString(1, nama_lengkap);
            statement.setString(2, username);
            statement.setString(3, password);
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }



}
