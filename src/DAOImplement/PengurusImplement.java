/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;

import Model.Pengurus;
import java.util.List;

/**
 *
 * @author L E N O V O
 */
public interface PengurusImplement {

    public List<Pengurus> getAll();

    public void delete(int id);
}
