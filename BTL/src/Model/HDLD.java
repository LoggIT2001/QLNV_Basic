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
public class HDLD {
    private String maHD;
    private String loaiHD;
    private String timeHD;

    public HDLD() {
    }
    public HDLD(String maHD, String loaiHD, String timeHD) {
        this.maHD = maHD;
        this.loaiHD = loaiHD;
        this.timeHD = timeHD;
    }

    public String getMaHD() {
        return maHD;
    }
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    public String getLoaiHD() {
        return loaiHD;
    }
    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }
    public String getTimeHD() {
        return timeHD;
    }
    public void setTimeHD(String timeHD) {
        this.timeHD = timeHD;
    }
    public Object[] toObjects(){
        return new Object[]{ maHD, loaiHD, timeHD};
    }
    
    public boolean trungMa(HDLD hdld) {
        return hdld.maHD.equals(this.maHD) ;
    }
    @Override
    public String toString() {
        return loaiHD;
    }
    
}
