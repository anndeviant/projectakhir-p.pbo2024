/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author L E N O V O
 */
public class DataLogin {

    private static String nama_lengkap;

    public static String getNama_lengkap() {
        return nama_lengkap;
    }

    public static void setNama_lengkap(String nama_lengkap) {
        DataLogin.nama_lengkap = nama_lengkap;
    }

    public static void clear() {
        DataLogin.nama_lengkap = null;
    }

}
