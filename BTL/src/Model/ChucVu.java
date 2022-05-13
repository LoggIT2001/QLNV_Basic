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
public class ChucVu {
    private String maCV;
    private String nameCV;

    public ChucVu() {
    }
    public ChucVu(String maCV, String nameCV) {
        this.maCV = maCV;
        this.nameCV = nameCV;
    }

    public String getMaCV() {
        return maCV;
    }
    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }
    public String getNameCV() {
        return nameCV;
    }
    public void setNameCV(String nameCV) {
        this.nameCV = nameCV;
    }
    public Object[] toObject(){
         return new Object[]{maCV,nameCV};
    }
     public boolean trungMa(ChucVu chucVu){
         return chucVu.maCV.equals(this.maCV);
    }
     public boolean trungNameCv(ChucVu chucVu){
         return chucVu.nameCV.equals(this.nameCV);
    }
    @Override
    public String toString() {
        return maCV;
    }
      
}
