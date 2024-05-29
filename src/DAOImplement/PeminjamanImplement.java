/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;

import Model.Buku;
import Model.Peminjaman;
import Model.Pengurus;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public interface PeminjamanImplement {

    public void insert(Peminjaman p);
    public List<Peminjaman> getAllPeminjaman();
    public List<Buku> getAllBook();
    public List<Buku> search(String by, String like);
}
