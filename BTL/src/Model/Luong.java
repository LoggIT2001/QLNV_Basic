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
public class Luong {
    private int luongCoBan;
    private int bacLuong;
    private int thuong;

    public Luong() {
    }

    public Luong(int bacLuong, int luongCoBan, int thuong) {
        this.luongCoBan = luongCoBan;
        this.bacLuong = bacLuong;
        this.thuong = thuong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }
    public int getBacLuong() {
        return bacLuong;
    }
    public int getThuong() {
        return thuong;
    }
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }
    public void setThuong(int thuong) {
        this.thuong = thuong;
    }
    public Object[] toObjects() {
        return new Object[]{bacLuong, luongCoBan, thuong};
    }
    public boolean trungBacLuong(Luong luong) {
        return luong.bacLuong == this.bacLuong ;
    }
    @Override
    public String toString() {
        return String.format("%d", bacLuong);
    }
    
    
}
