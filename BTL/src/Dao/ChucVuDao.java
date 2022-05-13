/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DataBase.DataProvider;
import Model.ChucVu;
import java.sql.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class ChucVuDao {
    public ArrayList<ChucVu> DSChucVu() {                    
        ArrayList<ChucVu> CVList = new ArrayList<>();
        String sql = "SELECT * FROM CHUCVU";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ResultSet rs = ps.executeQuery();
            ChucVu chucVu = null;
            while (rs.next()) {
                chucVu = new ChucVu();

                chucVu.setMaCV(rs.getString("MACV"));
                chucVu.setNameCV(rs.getString("NAMECV"));

                CVList.add(chucVu);
            }
        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra trong quá trình làm việc với mysql. "
                    + "Chi tiết: " + ex.getMessage());
        }
        return CVList;
    }

    public ChucVu timkiemTenCv(String address) 
    {

        String sql = "SELECT * FROM CHUCVU WHERE NAMECV = ?";
        ChucVu chucVu = null;
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, address);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                chucVu = new ChucVu();
                chucVu.setMaCV(rs.getString("MACV"));
                chucVu.setNameCV(rs.getString("NAMECV"));

            }
        } catch (SQLException ex) {
            System.out.println("Có lỗi xảy ra trong quá trình làm việc với mysql. "
                    + "Chi tiết: " + ex.getMessage());
        }
        return chucVu;
    }

    public boolean themchucvu(ChucVu s) {                          
        String sql = "INSERT INTO CHUCVU(MACV,NAMECV) VALUES (?,?)";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, s.getMaCV());
            ps.setString(2, s.getNameCV());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ChucVu timKiemMaCv(String id) {                

        String sql = "SELECT * FROM CHUCVU WHERE MACV=?";
        ChucVu chucVu = null;
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {
                chucVu = new ChucVu();
                chucVu.setMaCV(rs.getString("MACV"));
                chucVu.setNameCV(rs.getString("NAMECV"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return chucVu;
    }

    public boolean xoaChucVu(String id) {                             
        String sql = "DELETE FROM CHUCVU WHERE MACV=?";

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

    public boolean updateChucVu(ChucVu s) {                  
        String sql = "UPDATE CHUCVU SET NAMECV=? WHERE MACV=?";

        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, s.getNameCV());
            ps.setString(2, s.getMaCV());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
