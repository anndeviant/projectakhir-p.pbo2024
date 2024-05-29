/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;

import java.util.List;
import Model.*;

/**
 *
 * @author L E N O V O
 */
public interface BukuImplement {
    public void insert(Buku p);
    public void update(Buku p);
    public void delete(int id);
    public List<Buku> getAll();
    public List<Buku> getBookByGenre(String genre);
    public List<Buku> search(String by, String like);
}
