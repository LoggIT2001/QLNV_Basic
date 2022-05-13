/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DataBase.DataProvider;
import Model.PhongBan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LONGDT
 */
public class PhongBanDao {
    public ArrayList<PhongBan> DSPhongBan() {                    // in danh sach phong ban 
        ArrayList<PhongBan> PBList = new ArrayList<>();
        String sql = "SELECT * FROM PHONGBAN";
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();
            PhongBan phongBan = null;
            while (rs.next()) {
                phongBan = new PhongBan();

                phongBan.setMaPB(rs.getString("MAPB"));
                phongBan.setNamePB(rs.getString("NAMEPB"));
                phongBan.setDcPB(rs.getString("DCPB"));
                phongBan.setSdtPB(rs.getString("STDPB"));

                PBList.add(phongBan);
            }
        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra trong quá trình làm việc với mysql. "
                    + "Chi tiết: " + ex.getMessage());
        }
        return PBList;
    }
    public ArrayList<PhongBan> searchByAddress(String address)     // tim kiem phong ban theo dia chi
    {
          ArrayList<PhongBan> PBList = new ArrayList<>();
        String sql = "SELECT * FROM PHONGBAN WHERE DCPB = ?";
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, address);
            ResultSet rs = ps.executeQuery();
            PhongBan phongBan = null;
            while (rs.next()) {
                phongBan = new PhongBan();

                phongBan.setMaPB(rs.getString("MAPB"));
                phongBan.setNamePB(rs.getString("NAMEPB"));
                phongBan.setDcPB(rs.getString("DCPB"));
                phongBan.setSdtPB(rs.getString("STDPB"));

                PBList.add(phongBan);
            }
        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra trong quá trình làm việc với mysql. "
                    + "Chi tiết: " + ex.getMessage());
        }
        return PBList;
    }
    
    public boolean themphongban(PhongBan s) {                          // them phong ban
        String sql = "INSERT INTO PHONGBAN(MAPB,NAMEPB,DCPB,STDPB) VALUES (?,?,?,?)";
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, s.getMaPB());
            ps.setString(2, s.getNamePB());
            ps.setString(3, s.getDcPB());
            ps.setString(4, s.getSdtPB());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
        public PhongBan timKiemTenPhongBan(String name) {           // tim kiem phong ban theo ten 

        String sql = "SELECT * FROM PHONGBAN WHERE NAMEPB=?";
        PhongBan phongBan = null;
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery(); //Tra ve cac dong du lieu
            while (rs.next()) {
                phongBan = new PhongBan();
                phongBan.setMaPB(rs.getString("MAPB"));
                phongBan.setNamePB(rs.getString("NAMEPB"));
                phongBan.setDcPB(rs.getString("DCPB"));
                phongBan.setSdtPB(rs.getString("STDPB"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return phongBan;
    }
    public PhongBan timKiemIdPhongBan(String id) {                // tim kiem phong ban theo id

        String sql = "SELECT * FROM PHONGBAN WHERE MAPB=?";
        PhongBan phongBan = null;
        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery(); //Tra ve cac dong du lieu
            while (rs.next()) {
                phongBan = new PhongBan();
                phongBan.setMaPB(rs.getString("MAPB"));
                phongBan.setNamePB(rs.getString("NAMEPB"));
                phongBan.setDcPB(rs.getString("DCPB"));
                phongBan.setSdtPB(rs.getString("STDPB"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return phongBan;
    }
    public boolean xoaPhongBan(String id) {                               //xoa phong ban
        String sql = "DELETE FROM PHONGBAN WHERE MAPB=?";

        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean updatePhongBan(PhongBan s) {                  // sua phong ban
        String sql = "UPDATE PHONGBAN SET NAMEPB=?,DCPB=?,STDPB=? WHERE MAPB=?";

        try(
            Connection conn = DataProvider.ketNoi(); 
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, s.getNamePB());
            ps.setString(2, s.getDcPB());
            ps.setString(3, s.getSdtPB());
            ps.setString(4, s.getMaPB());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
