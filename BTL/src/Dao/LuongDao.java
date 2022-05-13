/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DataBase.DataProvider;
import Model.Luong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LONGDT
 */
public class LuongDao {
    public ArrayList<Luong> DSLuong() {                    // in danh sach phong ban 
        ArrayList<Luong> PBList = new ArrayList<>();
        String sql = "SELECT * FROM LUONG";
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();
            Luong luong = null;
            while (rs.next()) {
                luong = new Luong();

                luong.setBacLuong(rs.getInt("BACLUONG"));
                luong.setLuongCoBan(rs.getInt("LUONGCB"));
                luong.setThuong(rs.getInt("THUONG"));

                PBList.add(luong);
            }
        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra trong quá trình làm việc với mysql. "
                    + "Chi tiết: " + ex.getMessage());
        }
        return PBList;
    }
    public boolean themLuong(Luong s) {                          // them luong
        String sql = "INSERT INTO LUONG(BACLUONG,LUONGCB,THUONG) VALUES (?,?,?)";
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setInt(1, s.getBacLuong());
            ps.setInt(2, s.getLuongCoBan());
            ps.setInt(3, s.getThuong());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public Luong timKiemBacLuong(int bacLuong) {          

        String sql = "SELECT * FROM LUONG WHERE BACLUONG=?";
        Luong luong = null;
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setInt(1, bacLuong);
            ResultSet rs = ps.executeQuery(); //Tra ve cac dong du lieu
            while (rs.next()) {
                luong = new Luong();
                luong.setBacLuong(rs.getInt("BACLUONG"));
                luong.setLuongCoBan(rs.getInt("LUONGCB"));
                luong.setThuong(rs.getInt("THUONG"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return luong;
    }
    public Luong timKiemLuongCB(int lcb) {          

        String sql = "SELECT * FROM LUONG WHERE LUONGCB=?";
        Luong luong = null;
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setInt(1, lcb);
            ResultSet rs = ps.executeQuery(); //Tra ve cac dong du lieu
            while (rs.next()) {
                luong = new Luong();
                luong.setBacLuong(rs.getInt("BACLUONG"));
                luong.setLuongCoBan(rs.getInt("LUONGCB"));
                luong.setThuong(rs.getInt("THUONG"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return luong;
    }
    public boolean xoaLuong(int bacLuong) {                               
        String sql = "DELETE FROM LUONG WHERE BACLUONG=?";

        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setInt(1, bacLuong);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean updateLuong(Luong s) {                  
        String sql = "UPDATE LUONG SET LUONGCB=?,THUONG=? WHERE BACLUONG=?";

        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setInt(1, s.getBacLuong());
            ps.setInt(2, s.getLuongCoBan());
            ps.setInt(3, s.getThuong());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
