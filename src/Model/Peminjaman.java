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
public class Peminjaman {

    private Integer id;
    private String nama_mhs;
    private Integer kode_buku;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public Integer getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(Integer kode_buku) {
        this.kode_buku = kode_buku;
    }
    
    
}
