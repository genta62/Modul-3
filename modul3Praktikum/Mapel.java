/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3Praktikum;

/**
 *
 * @author genta
 */
public class Mapel extends Guru {

    private String mapel;
    
    //konstruktor
    public Mapel(String mapel, String nama, int usia) {
        super(nama, usia);
        this.mapel=mapel;
    }
    
    //method
    public void infoGuru(){
        System.out.println("Mata Pelajaran : "+mapel);
        super.infoGuru();
    }
    
}
