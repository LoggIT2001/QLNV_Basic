/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DataBase.DataProvider;
import Model.HDLD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LONGDT
 */
public class HDLDDao {
    public boolean addQuanLyHDLD (HDLD qly){
        
        String sql = "INSERT INTO HDLD (MAHD, LOAIHD, TIMEHD)"
                + "VALUES(?,?,?)";
        try (
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, qly.getMaHD());
            ps.setString(2, qly.getLoaiHD());
            ps.setString(3, qly.getTimeHD());

            return ps.executeUpdate() > 0;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    public ArrayList<HDLD> getListQuanLyHDLD(){
        ArrayList<HDLD> list = new ArrayList<>();
        String sql = "SELECT * FROM HDLD";
        
        try(
              Connection conn = DataProvider.ketNoi(); 
              PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HDLD qly = new HDLD();
                qly.setMaHD(rs.getString("MaHD"));
                qly.setLoaiHD(rs.getString("LoaiHD"));
                qly.setTimeHD(rs.getString("TimeHD"));

                list.add(qly);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return list;
    }
    public boolean updateHDLD(HDLD qly){        
        String sql = "UPDATE HDLD SET LoaiHD = ?, TimeHD = ? WHERE MAHD = ?";
                
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, qly.getLoaiHD());
            ps.setString(2, qly.getTimeHD());
            ps.setString(3, qly.getMaHD());
            return ps.executeUpdate() > 0;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    public boolean deleteQuanLyHDLD(HDLD qly){
        
        String sql = "DELETE FROM HDLD where MaHD = ?";
                
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, qly.getMaHD());
            return ps.executeUpdate() > 0;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    
    public HDLD timKiemIdHDLD(String MaHD){
        String sql = "SELECT * FROM HDLD where MaHD = ?";
        HDLD hdld = null;
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, MaHD);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                hdld = new HDLD();
                hdld.setMaHD(rs.getString("MAHD"));
                hdld.setLoaiHD(rs.getString("LOAIHD"));
                hdld.setTimeHD(rs.getString("TIMEHD"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return hdld;
    }
    public HDLD timKiemLoaiHDLD(String MaHD){
        String sql = "SELECT * FROM HDLD where LoaiHD = ?";
        HDLD hdld = null;
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, MaHD);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                hdld = new HDLD();
                hdld.setMaHD(rs.getString("MAHD"));
                hdld.setLoaiHD(rs.getString("LOAIHD"));
                hdld.setTimeHD(rs.getString("TIMEHD"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return hdld;
    }
    public HDLD timKiemTimeHDLD(String MaHD){
        String sql = "SELECT * FROM HDLD where TimeHD = ?";
        HDLD hdld = null;
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement ps = conn.prepareStatement(sql);    
        ){
            ps.setString(1, MaHD);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                hdld = new HDLD();
                hdld.setMaHD(rs.getString("MAHD"));
                hdld.setLoaiHD(rs.getString("LOAIHD"));
                hdld.setTimeHD(rs.getString("TIMEHD"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return hdld;
    }
}
