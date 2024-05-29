/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOData.RegisterDAO;
import View.*;
import javax.swing.JOptionPane;
import DAOImplement.RegisterImplement;

/**
 *
 * @author L E N O V O
 */
public class RegisterControl {

    private RegisterPage register;
    private RegisterImplement registerDAO;

    public RegisterControl(RegisterPage register) {
        this.register = register;
        this.registerDAO = new RegisterDAO();
    }

    public void register() {
        String fullName = register.getRegFullName().getText();
        String username = register.getRegUsername().getText();
        String password = register.getRegPassword().getText();

        if (username.isBlank() || password.isBlank() || fullName.isBlank()) {
            JOptionPane.showMessageDialog(register, "Username, Password harus diisi.");
        } else {
            boolean isRegistered = registerDAO.validasiRegister(fullName, username, password);
            if (isRegistered) {
                JOptionPane.showMessageDialog(register, "Registrasi berhasil.");
                register.dispose();
                LoginPage log = new LoginPage();
                log.setVisible(true);
                log.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(register, "Registrasi gagal.");
            }
        }
    }
 
    
}
