/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User.DAOUser;
import Model.User.ModelUser;
import View.Admin.HomeAdmin;
import View.Login.LoginPage;

/**
 *
 * @author ASUS
 */
public class ControllerLogin {

    LoginPage view;
    DAOUser userDAO;

    public ControllerLogin(LoginPage view, DAOUser userDAO) {
        this.view = view;
        this.userDAO = userDAO;
    }

    public boolean validateLogin() {
        String username = view.getUsername();
        String password = view.getPassword();

        if (username.isEmpty() || password.isEmpty()) {
            view.showErrorMessage("Username dan Password tidak boleh kosong!");
            return false;
        }
        return true;
    }

    public void doLogin() {
        if (!validateLogin()) {
            return;
        }
        String username = view.getUsername();
        String password = view.getPassword();
        ModelUser user = userDAO.verifikasiUsers(username, password);

        if (user == null) {
            view.showErrorMessage("Username atau Password salah!");
        } else {
            HomeAdmin home = new HomeAdmin();
            home.setVisible(true);
            view.dispose();
        }
    }
}