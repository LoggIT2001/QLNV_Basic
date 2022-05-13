/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LONGDT
 */
public class DamNhiem {
    private String maNV;
    private String maCV;

    public DamNhiem() {
        
    }

    public DamNhiem(String maNV, String maCV) {
        this.maNV = maNV;
        this.maCV = maCV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    @Override
    public String toString() {
        return "DamNhiem{" + "maNV=" + maNV + ", maCV=" + maCV + '}';
    }
    
}
