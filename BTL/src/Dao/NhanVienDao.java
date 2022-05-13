/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DataBase.DataProvider;
import Model.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class NhanVienDao {
    public boolean insert(NhanVien nv) throws SQLException{
        String sql = "INSERT INTO NHANVIEN(MANV, USERNAME, PASS, NAMENV, MAIL, PHONE, CHUCVU, BACLUONG, PHONGBAN, HDLD) VALUES(?,?,?,?,?,?,?,?,?,?)";
//        String query = "INSERT INTO SDT(MANV, PHONE) VALUES(?,?)";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
//            PreparedStatement pstmt1 = conn.prepareStatement(query);
        ){
            pstmt.setString(1, nv.getMaNV());
            pstmt.setString(2, nv.getUserName());
            pstmt.setString(3, nv.getPassWord());
            pstmt.setString(4, nv.getNameNV());
            pstmt.setString(5, nv.getMail());
            pstmt.setString(6, nv.getPhone());
            pstmt.setString(7, nv.getCv().getMaCV());
            pstmt.setInt(8, nv.getL().getBacLuong());
            pstmt.setString(9, nv.getPb().getMaPB());
            pstmt.setString(10, nv.getHdld().getLoaiHD());
//            pstmt1.setString(1, nv.getMaNV());
//            pstmt1.setString(2, nv.getPhone());
            return pstmt.executeUpdate() >0;
        }
    }
    public boolean insertSDT(Sdt sdt) throws SQLException{
        String query = "INSERT INTO SDT(MANV, PHONE) VALUES(?,?)";
        try(
           Connection conn = DataProvider.ketNoi();
           PreparedStatement pstmt = conn.prepareStatement(query);     
        ){
           pstmt.setString(1, sdt.getMaNV());
           pstmt.setString(2, sdt.getPhone());
           
           return pstmt.executeUpdate() > 0;
        }
    }
    public boolean insertDamNhiem(DamNhiem damNhiem) throws SQLException{
        String query = "INSERT INTO DAMNHIEM(MANV, MACV) VALUES(?,?)";
        try(
           Connection conn = DataProvider.ketNoi();
           PreparedStatement pstmt = conn.prepareStatement(query);     
        ){
           pstmt.setString(1, damNhiem.getMaNV());
           pstmt.setString(2, damNhiem.getMaCV());
           
           return pstmt.executeUpdate() > 0;
        }
    }
    public NhanVien findById(String maNV) throws SQLException{
        String sql = "SELECT * FROM NHANVIEN WHERE MANV = ?";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, maNV);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setPassWord(rs.getString("PASS"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("PHONE"));
                nv.getCv().setMaCV(rs.getString("CHUCVU"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setMaPB(rs.getString("PHONGBAN"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                return nv;
            }
            
            return null;
        }
    }
    public boolean update(NhanVien nv) throws SQLException{
        String sql = "UPDATE NHANVIEN SET USERNAME = ?, PASS = ?, NAMENV = ?, MAIL = ?, PHONE = ?, CHUCVU = ?, BACLUONG = ?, PHONGBAN = ?, HDLD = ?"
                + " WHERE MANV = ?";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(10, nv.getMaNV());
            pstmt.setString(1, nv.getUserName());
            pstmt.setString(2, nv.getPassWord());
            pstmt.setString(3, nv.getNameNV());
            pstmt.setString(4, nv.getMail());
            pstmt.setString(5, nv.getPhone());
            pstmt.setString(6, nv.getCv().getMaCV());
            pstmt.setInt(7, nv.getL().getBacLuong());
            pstmt.setString(8, nv.getPb().getMaPB());
            pstmt.setString(9, nv.getHdld().getLoaiHD());
       
            return pstmt.executeUpdate() >0;
        }
    }
    public boolean updateSDT(Sdt sdt) throws SQLException{
        String sql = "UPDATE SDT SET PHONE = ? WHERE MANV = ?";
        try(
           Connection conn = DataProvider.ketNoi();
           PreparedStatement pstmt = conn.prepareStatement(sql);     
        ){
           pstmt.setString(2, sdt.getMaNV());
           pstmt.setString(1, sdt.getPhone());
           
           return pstmt.executeUpdate() > 0;
        }
    }
    public boolean updateDamNhiem(DamNhiem damNhiem) throws SQLException{
        String query = "UPDATE DAMNHIEM SET MACV = ? WHERE MANV = ?";
        try(
           Connection conn = DataProvider.ketNoi();
           PreparedStatement pstmt = conn.prepareStatement(query);     
        ){
           pstmt.setString(2, damNhiem.getMaNV());
           pstmt.setString(1, damNhiem.getMaCV());
           
           return pstmt.executeUpdate() > 0;
        }
    }
    public boolean delete(String maNV)throws SQLException{
        String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, maNV);
                        
            return pstmt.executeUpdate() >0;
        }
    }
    public boolean deleteSDT(String maNV, String phone)throws SQLException{
        String sql = "DELETE FROM SDT WHERE MANV = ? AND PHONE = ?";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, maNV);
            pstmt.setString(2, phone);
                        
            return pstmt.executeUpdate() >0;
        }
    }
    public boolean deleteDamNhiem(String maNV, String maCV)throws SQLException{
        String sql = "DELETE FROM DAMNHIEM WHERE MANV = ? AND MACV";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, maNV);
            pstmt.setString(2, maCV);
                        
            return pstmt.executeUpdate() >0;
        }
    }

    public List<NhanVien> findAll() throws SQLException{
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.MACV, BACLUONG, PHONGBAN.MAPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            try(ResultSet rs = pstmt.executeQuery();){
                List<NhanVien> li;
                li = new ArrayList<>();
                while(rs.next()){
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(rs.getString("MANV"));
                    nv.setUserName(rs.getString("USERNAME"));
                    nv.setNameNV(rs.getString("NAMENV"));
                    nv.setMail(rs.getString("MAIL"));
                    nv.setPhone(rs.getString("PHONE"));
                    nv.getCv().setMaCV(rs.getString("MACV"));
                    nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                    nv.getPb().setMaPB(rs.getString("MAPB"));
                    nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                    li.add(nv);
                }
                return li;
            }
            
        }
    }
    public List<NhanVien> findDS() throws SQLException{
        String sql = "SELECT * FROM NHANVIEN";
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            try(ResultSet rs = pstmt.executeQuery();){
                List<NhanVien> li;
                li = new ArrayList<>();
                while(rs.next()){
                    NhanVien nv = new NhanVien();
                    nv.setMaNV(rs.getString("MANV"));
                    nv.setUserName(rs.getString("USERNAME"));
                    nv.setPassWord(rs.getString("PASS"));
                    nv.setNameNV(rs.getString("NAMENV"));
                    nv.setMail(rs.getString("MAIL"));
                    nv.setPhone(rs.getString("PHONE"));
                    nv.getCv().setMaCV(rs.getString("CHUCVU"));
                    nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                    nv.getPb().setMaPB(rs.getString("PHONGBAN"));
                    nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                    li.add(nv);
                }
                return li;
            }
            
        }
    }
    public List<NhanVien> timKiemTheoMaNV(String maNV){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.NAMECV, BACLUONG, PHONGBAN.NAMEPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.MANV = ? ";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, maNV);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setNameCV(rs.getString("NAMECV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setNamePB(rs.getString("NAMEPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
    
    public List<NhanVien> findMaNV(String maNV){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.MACV, BACLUONG, PHONGBAN.MAPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.MANV = ? ";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, maNV);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setMaCV(rs.getString("MACV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setMaPB(rs.getString("MAPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
    public List<NhanVien> timKiemTheoChucVu(String chucVu){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.NAMECV, BACLUONG, PHONGBAN.NAMEPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.CHUCVU = ? ";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, chucVu);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setNameCV(rs.getString("NAMECV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setNamePB(rs.getString("NAMEPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
    public List<NhanVien> timKiemTheoBacLuong(String bacLuong){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.NAMECV, BACLUONG, PHONGBAN.NAMEPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.BACLUONG = ? ";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, bacLuong);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setNameCV(rs.getString("NAMECV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setNamePB(rs.getString("NAMEPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
    public List<NhanVien> timKiemTheoPhongBan(String phongBan){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.NAMECV, BACLUONG, PHONGBAN.NAMEPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.PHONGBAN = ? ";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, phongBan);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setNameCV(rs.getString("NAMECV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setNamePB(rs.getString("NAMEPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
    public List<NhanVien> timKiemTheoNameNV(String name){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.NAMECV, BACLUONG, PHONGBAN.NAMEPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.NAMENV LIKE '%" + name + "'";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
//            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setNameCV(rs.getString("NAMECV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setNamePB(rs.getString("NAMEPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
    public List<NhanVien> timKiemTheoHDLD(String hdld){
        String sql = "SELECT NHANVIEN.MANV, USERNAME, NAMENV, MAIL, SDT.PHONE, CHUCVU.NAMECV, BACLUONG, PHONGBAN.NAMEPB, HDLD FROM NHANVIEN, CHUCVU, DAMNHIEM, PHONGBAN, SDT WHERE NHANVIEN.MANV = DAMNHIEM.MANV AND DAMNHIEM.MACV = CHUCVU.MACV AND NHANVIEN.PHONGBAN = PHONGBAN.MAPB AND NHANVIEN.MANV = SDT.MANV AND NHANVIEN.HDLD = ? ";
        List<NhanVien> li = new ArrayList<>();
        try(
            Connection conn = DataProvider.ketNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, hdld);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setUserName(rs.getString("USERNAME"));
                nv.setNameNV(rs.getString("NAMENV"));
                nv.setMail(rs.getString("MAIL"));
                nv.setPhone(rs.getString("SDT.PHONE"));
                nv.getCv().setNameCV(rs.getString("NAMECV"));
                nv.getL().setBacLuong(rs.getInt("BACLUONG"));
                nv.getPb().setNamePB(rs.getString("NAMEPB"));
                nv.getHdld().setLoaiHD(rs.getString("HDLD"));
                li.add(nv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }
}
