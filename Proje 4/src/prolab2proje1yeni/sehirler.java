/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2proje1yeni;

import java.util.LinkedList;

/**
 *
 * @author 180202039-180202052
 */
public class sehirler {
     String isim;
   int plaka;
    int komsusayisi=0;
    boolean gidildimi=false;
    int pixelX;
    int pixelY;
  public sehirler(String isim,int plaka) {
        this.isim = isim;
        this.plaka=plaka;
      
    }
LinkedList<Komsu> komsular = new LinkedList(); 

    public String getIsim() {
        return isim;
    }
    

    
    public void setIsim(String isim) {
        this.isim = isim;
    }

   
    public int getPlaka() {
        return plaka;
    }

    public void setPlaka(int plaka) {
        this.plaka = plaka;
    }

   
    public int getKomsusayisi() {
        return komsusayisi;
    }

    public void setKomsusayisi(int komsusayisi) {
        this.komsusayisi = komsusayisi;
    }
}
