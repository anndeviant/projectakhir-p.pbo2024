/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOData;

import Connection.Connector;
import DAOImplement.LoginImplement;
import Model.DataLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author L E N O V O
 */
public class LoginDAO implements LoginImplement {

    Connection connection;

    final String login = "SELECT * FROM pengurus WHERE username = ? AND password = ?";

    public LoginDAO() {
        connection = Connector.connection();
    }

    @Override
    public boolean validasiLogin(String username, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement(login);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                DataLogin.setNama_lengkap(rs.getString("nama_lengkap"));
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
