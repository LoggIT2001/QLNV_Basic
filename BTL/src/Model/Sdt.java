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
public class Sdt {
    private String maNV;
    private String phone;

    public Sdt() {
    }
    public Sdt(String maNV, String phone) {
        this.maNV = maNV;
        this.phone = phone;
    }

    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" + "maNV=" + maNV + ", phone=" + phone + '}';
    }
    
    
}
