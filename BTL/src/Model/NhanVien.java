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
public class NhanVien {
    private String maNV;
    private String userName;
    private String passWord;
    private String nameNV;
    private String mail;
    private String phone;
    private Luong l;
    private PhongBan pb;
    private HDLD hdld;
    private ChucVu cv;

    public NhanVien() {
        this.cv = new ChucVu();
        this.l = new Luong();
        this.pb = new PhongBan();
        this.hdld = new HDLD();
    }

    public NhanVien(String maNV, String userName, String passWord,String nameNV, String mail, String phone) {
        this.maNV = maNV;
        this.userName = userName;
        this.passWord = passWord;
        this.nameNV = nameNV;
        this.mail = mail;
        this.phone = phone;
    
    }
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public String getNameNV() {
        return nameNV;
    }
    public void setNameNV(String nameNV) {
        this.nameNV = nameNV;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public Luong getL() {
        return l;
    }

    public PhongBan getPb() {
        return pb;
    }

    public HDLD getHdld() {
        return hdld;
    }

    public void setL(Luong l) {
        this.l = l;
    }

    public void setPb(PhongBan pb) {
        this.pb = pb;
    }

    public void setHdld(HDLD hdld) {
        this.hdld = hdld;
    }

    public ChucVu getCv() {
        return cv;
    }

    public void setCv(ChucVu cv) {
        this.cv = cv;
    }
    public Object[] toObjects() {
        return new Object[]{maNV, userName, nameNV, mail, phone, cv.getMaCV(), l, pb.getMaPB(), hdld};
    }
    public Object[] toObjects1() {
        return new Object[]{maNV, userName, nameNV, mail, phone, cv.getNameCV(), l, pb.getNamePB(), hdld};
    }
    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", nameNV=" + nameNV + ", mail=" + mail + ", phone=" + phone + ", l=" + l + ", pb=" + pb + ", hdld=" + hdld + '}';
    }
    
    
}
