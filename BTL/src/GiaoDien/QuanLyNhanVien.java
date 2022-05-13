/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import Dao.*;
import Model.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LONGDT
 */
public class QuanLyNhanVien extends javax.swing.JPanel {
    DefaultTableModel tblModel;
    List<Luong> LList;
    List<PhongBan> PBList;
    List<HDLD> List;
    List<ChucVu> CVList;
    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien() {
        initComponents();
        initTable();
        loadDataCBBox();
        loadData();
    }

    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MANV", "USERNAME", "NAMENV", "MAIL", "PHONE", "CHUCVU", "BACLUONG", "PHONGBAN", "HDLD"});
        tblNhanVien.setModel(tblModel);
    }
    private void loadData(){
        try{
            NhanVienDao nvd = new NhanVienDao();
            List<NhanVien> li = nvd.findAll();
            tblModel.setRowCount(0);
            for(NhanVien nv: li){
                tblModel.addRow(new Object[]{
                   nv.getMaNV(), nv.getUserName(), nv.getNameNV(), nv.getMail(), nv.getPhone(), nv.getCv(), nv.getL(), nv.getPb(), nv.getHdld()
                });
            }
            tblModel.fireTableDataChanged();
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        txtMaNV = new javax.swing.JTextField();
        txtNameNV = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cbLuong = new javax.swing.JComboBox<>();
        cbPB = new javax.swing.JComboBox<>();
        cbHDLD = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        ptxtpass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        cbCV = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NV.jpg"))); // NOI18N
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setText("Mã NV");

        jLabel3.setText("Tên NV");

        jLabel4.setText("E-Mail");

        jLabel5.setText("Phone");

        jLabel6.setText("Ma PB");

        jLabel7.setText("Lương");

        jLabel8.setText("HDLD");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_search.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-icon-16.png"))); // NOI18N
        btnCreate.setText("Tạo mới");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Sửa đổi");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Close-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        cbLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLuongActionPerformed(evt);
            }
        });

        cbPB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHDLD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("PassWord");

        jLabel10.setText("UserName");

        jLabel11.setText("Ma CV");

        cbCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txtNameNV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbLuong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMail))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPhone)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPB, 0, 130, Short.MAX_VALUE)
                                    .addComponent(cbHDLD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtuser)
                                    .addComponent(ptxtpass))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnSearch)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCreate)
                    .addComponent(txtNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ptxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(cbPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(cbHDLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(jLabel7)
                    .addComponent(cbLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        txtMaNV.setText("");
        txtuser.setText("");
        ptxtpass.setText("");
        txtNameNV.setText("");
        txtMail.setText("");
        txtPhone.setText("");
        loadDataCBBox();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txtMaNV.getText().equals("")){
            sb.append("Mã Nhân Viên không được để trống!");
            txtMaNV.setBackground(Color.red);
        }else{
            txtMaNV.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try{
            NhanVien nv = new NhanVien();
            Sdt sdt = new Sdt();
            DamNhiem dn = new DamNhiem();
            String l = cbLuong.getItemAt(cbLuong.getSelectedIndex());
            String pb = cbPB.getItemAt(cbPB.getSelectedIndex());
            String hdld = cbHDLD.getItemAt(cbHDLD.getSelectedIndex());
            String cv = cbCV.getItemAt(cbCV.getSelectedIndex());
            nv.setMaNV(txtMaNV.getText());
            nv.setUserName(txtuser.getText());
            nv.setPassWord(String.valueOf(ptxtpass.getPassword()));
            nv.setNameNV(txtNameNV.getText());
            nv.setMail(txtMail.getText());
            nv.setPhone(txtPhone.getText());
            nv.getCv().setMaCV(cv);
            nv.getL().setBacLuong(Integer.parseInt(l));
            nv.getPb().setMaPB(pb);
            nv.getHdld().setLoaiHD(hdld);
            sdt.setMaNV(txtMaNV.getText());
            sdt.setPhone(txtPhone.getText());
            dn.setMaNV(txtMaNV.getText());
            dn.setMaCV(cv);
            
            NhanVienDao nvd = new NhanVienDao();
            nvd.insert(nv);
            nvd.insertSDT(sdt);
            nvd.insertDamNhiem(dn);
            
            JOptionPane.showMessageDialog(this, "Lưu thành công");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
        loadData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtMaNV.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập mã nhân viên!");
            return;
        }
        tblModel.setRowCount(0);
        try{
            NhanVienDao nvd = new NhanVienDao();
            List<NhanVien> li = nvd.findMaNV(txtMaNV.getText());
            for(NhanVien nv: li){
                if(nv != null){
                    tblModel.addRow(nv.toObjects());
                }else{
                    JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên!");
                }
            }         
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txtMaNV.getText().equals("")){
            sb.append("Mã Nhân Viên không được để trống!");
            txtMaNV.setBackground(Color.red);
        }else{
            txtMaNV.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        if(JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật nhân viên không?")==JOptionPane.NO_OPTION){
            return;
        }
        try{
            NhanVien nv = new NhanVien();
          
            String l = cbLuong.getItemAt(cbLuong.getSelectedIndex());
            String pb = cbPB.getItemAt(cbPB.getSelectedIndex());
            String hdld = cbHDLD.getItemAt(cbHDLD.getSelectedIndex());
            String cv = cbCV.getItemAt(cbCV.getSelectedIndex());
            nv.setMaNV(txtMaNV.getText());
            nv.setUserName(txtuser.getText());
            nv.setPassWord(String.valueOf(ptxtpass.getPassword()));
            nv.setNameNV(txtNameNV.getText());
            nv.setMail(txtMail.getText());
            nv.setPhone(txtPhone.getText());
            nv.getCv().setMaCV(cv);
            nv.getL().setBacLuong(Integer.parseInt(l));
            nv.getPb().setMaPB(pb);
            nv.getHdld().setLoaiHD(hdld);
           
            
            NhanVienDao nvd = new NhanVienDao();
            nvd.update(nv);


            
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
        loadData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txtMaNV.getText().equals("")){
            sb.append("Mã Nhân Viên không được để trống!");
            txtMaNV.setBackground(Color.red);
        }else{
            txtMaNV.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        if(JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa nhân viên không?")==JOptionPane.NO_OPTION){
            return;
        }
        try{
            NhanVienDao nvd = new NhanVienDao();
            String cv = cbCV.getItemAt(cbCV.getSelectedIndex());
            nvd.delete(txtMaNV.getText());
            nvd.deleteSDT(txtMaNV.getText(), txtPhone.getText());
            nvd.deleteDamNhiem(txtMaNV.getText(), cv);
            
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
        loadData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        try{
            int row = tblNhanVien.getSelectedRow();
            if(row >= 0){
                String id = (String) tblNhanVien.getValueAt(row, 0);
                NhanVienDao nvd = new NhanVienDao();
                NhanVien nv = nvd.findById(id);
                
                if(nv != null){
                    txtMaNV.setText(nv.getMaNV());
                    txtuser.setText(nv.getUserName());
                    ptxtpass.setText(nv.getPassWord());
                    txtNameNV.setText(nv.getNameNV());
                    txtMail.setText(nv.getMail());
                    txtPhone.setText(nv.getPhone());
                    cbCV.removeAllItems();
                    cbCV.addItem(nv.getCv().getMaCV());
                    cbLuong.removeAllItems();
                    cbLuong.addItem(String.valueOf(nv.getL().getBacLuong()));
                    cbPB.removeAllItems();
                    cbPB.addItem(nv.getPb().getMaPB());
                    cbHDLD.removeAllItems();
                    cbHDLD.addItem(nv.getHdld().getLoaiHD());
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void cbLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLuongActionPerformed
    private void loadDataCBBox(){
        LuongDao ld = new LuongDao();
        LList = ld.DSLuong();
        cbLuong.removeAllItems();
        for(Luong l: LList){
            cbLuong.addItem(String.valueOf(l.getBacLuong()));
        }
        PhongBanDao pbd = new PhongBanDao();
        PBList = pbd.DSPhongBan();
        cbPB.removeAllItems();
        for(PhongBan pb: PBList){
            cbPB.addItem(pb.getMaPB());
        }
        HDLDDao hd = new HDLDDao();
        List = hd.getListQuanLyHDLD();
        cbHDLD.removeAllItems();
        for(HDLD h: List){
            cbHDLD.addItem(h.getLoaiHD());
        }
        ChucVuDao cvd = new ChucVuDao();
        CVList = cvd.DSChucVu();
        cbCV.removeAllItems();
        for(ChucVu cv: CVList){
            cbCV.addItem(cv.getMaCV());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbCV;
    private javax.swing.JComboBox<String> cbHDLD;
    private javax.swing.JComboBox<String> cbLuong;
    private javax.swing.JComboBox<String> cbPB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField ptxtpass;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNameNV;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}