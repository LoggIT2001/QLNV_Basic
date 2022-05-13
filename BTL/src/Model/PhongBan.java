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
public class PhongBan {
    private String maPB;
    private String namePB;
    private String dcPB;
    private String sdtPB;

    public PhongBan() {
    }
    public PhongBan(String maPB, String namePB, String dcPB, String sdtPB) {
        this.maPB = maPB;
        this.namePB = namePB;
        this.dcPB = dcPB;
        this.sdtPB = sdtPB;
    }

    public String getMaPB() {
        return maPB;
    }
    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }
    public String getNamePB() {
        return namePB;
    }
    public void setNamePB(String namePB) {
        this.namePB = namePB;
    }
    public String getDcPB() {
        return dcPB;
    }
    public void setDcPB(String dcPB) {
        this.dcPB = dcPB;
    }
    public String getSdtPB() {
        return sdtPB;
    }
    public void setSdtPB(String sdtPB) {
        this.sdtPB = sdtPB;
    }
    public Object[] toObjects() {
        return new Object[]{maPB, namePB, dcPB, sdtPB};
    }

    public boolean trungName(PhongBan phongBan) {
        return phongBan.namePB.equals(this.namePB) ;
    }

    public boolean trungMa(PhongBan phongBan) {
        return phongBan.maPB.equals(this.maPB);
    }
    public boolean trungSDT(PhongBan phongBan){
        return  phongBan.sdtPB.equals(this.sdtPB);
    }
    @Override
    public String toString() {
        return maPB;
    }
      
}
