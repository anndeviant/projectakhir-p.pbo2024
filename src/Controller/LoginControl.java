/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.LoginDAO;
import DAOImplement.LoginImplement;
import View.*;
import javax.swing.JOptionPane;

/**
 *
 * @author L E N O V O
 */
public class LoginControl {

    LoginPage frame;
    BerandaPage beranda;
    LoginImplement implDataLogin;

    public LoginControl(LoginPage frame) {
        this.frame = frame;
        this.implDataLogin = new LoginDAO();
    }

    public void login() {
        String username = frame.getLogUsername().getText();
        System.out.println(username);
        String password = frame.getLogPassword().getText();
        System.out.println(password);
        if (username.isBlank() || password.isBlank()) {
            JOptionPane.showMessageDialog(frame, "Username atau Password Tidak boleh Kosong");
        } else if (implDataLogin.validasiLogin(username, password)) {
                System.out.println("Login berhasil!");
                beranda = new BerandaPage();
                beranda.setVisible(true);
                beranda.setLocationRelativeTo(null);
                frame.dispose();
            
        } else {
            JOptionPane.showMessageDialog(frame, "Nama atau password salah.");
        }
    }
}
