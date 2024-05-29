/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;

import Model.Peminjaman;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public interface ReturImplement {

    public List<Peminjaman> getAllPeminjaman();
    public void delete(int kode_buku);
    public List<Peminjaman> search(String like);

}
