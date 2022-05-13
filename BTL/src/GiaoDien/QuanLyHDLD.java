package GiaoDien;

import Model.*;
import Dao.HDLDDao;
import DataBase.DataProvider;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class QuanLyHDLD extends javax.swing.JPanel {
    private ArrayList<HDLD> HDLDlist;
    private DefaultTableModel model; 
    public QuanLyHDLD() {
        initComponents();

        HDLDlist = new HDLDDao().getListQuanLyHDLD();
        model = (DefaultTableModel) tableQuanLyHDLD.getModel();
        showQuanLyHDLD(); 
    }
    public void showQuanLyHDLD() {
        model = (DefaultTableModel)tableQuanLyHDLD.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < HDLDlist.size(); i++) {
            row[0] = HDLDlist.get(i).getMaHD();
            row[1] = HDLDlist.get(i).getLoaiHD();
            row[2] = HDLDlist.get(i).getTimeHD();

            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMaHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTimeHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLoaiHD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyHDLD = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        buttonThem = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        buronX0a = new javax.swing.JButton();
        timkiemCB = new javax.swing.JComboBox<>();
        timkiemHDclick = new javax.swing.JButton();
        danhSachHDLD = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập thông tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        txtMaHD.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Mã Hợp Đồng");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Loại Hợp Đồng");

        txtTimeHD.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtTimeHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeHDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Thời Hạn Hợp Đồng");

        txtLoaiHD.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtLoaiHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimeHD, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTimeHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        tableQuanLyHDLD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableQuanLyHDLD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hợp Đồng", "Loại Hợp Đồng", "Thời Hạn Hợp Đồng"
            }
        ));
        tableQuanLyHDLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuanLyHDLDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQuanLyHDLD);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        buttonThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create-icon.png"))); // NOI18N
        buttonThem.setText("Thêm");
        buttonThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonThemMouseClicked(evt);
            }
        });

        buttonSua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon-16.png"))); // NOI18N
        buttonSua.setText("Sửa");
        buttonSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSuaMouseClicked(evt);
            }
        });

        buronX0a.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buronX0a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-edit-delete-icon.png"))); // NOI18N
        buronX0a.setText("Xoá");
        buronX0a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buronX0aMouseClicked(evt);
            }
        });
        buronX0a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buronX0aActionPerformed(evt);
            }
        });

        timkiemCB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timkiemCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã HĐ", "Tìm kiếm theo Loại HĐ", "Tìm kiếm theo Thời hạn HĐ" }));
        timkiemCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemCBActionPerformed(evt);
            }
        });

        timkiemHDclick.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timkiemHDclick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_search.png"))); // NOI18N
        timkiemHDclick.setText("Tìm Kiếm");
        timkiemHDclick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemHDclickMouseClicked(evt);
            }
        });
        timkiemHDclick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemHDclickActionPerformed(evt);
            }
        });

        danhSachHDLD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        danhSachHDLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-view-calendar-list-icon.png"))); // NOI18N
        danhSachHDLD.setText("Hiển thị danh sách");
        danhSachHDLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                danhSachHDLDMouseClicked(evt);
            }
        });
        danhSachHDLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danhSachHDLDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(danhSachHDLD, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonThem, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(buttonSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buronX0a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(timkiemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timkiemHDclick, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(buttonThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSua)
                .addGap(17, 17, 17)
                .addComponent(buronX0a)
                .addGap(18, 18, 18)
                .addComponent(danhSachHDLD)
                .addGap(18, 18, 18)
                .addComponent(timkiemCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timkiemHDclick)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableQuanLyHDLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuanLyHDLDMouseClicked
        int row = tableQuanLyHDLD.getSelectedRow();
        txtMaHD.setText(model.getValueAt(row, 0).toString());
        txtTimeHD.setText(model.getValueAt(row, 2).toString());
        txtLoaiHD.setText(model.getValueAt(row, 1).toString());

    }//GEN-LAST:event_tableQuanLyHDLDMouseClicked

    private void buttonThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonThemMouseClicked

        String ma = txtMaHD.getText();
        String loai = txtLoaiHD.getText();
        String time = txtTimeHD.getText();

        try {
            HDLDDao hdd = new HDLDDao();
            if (ma.equals("") || loai.equals("") || time.equals("")) {
                JOptionPane.showMessageDialog(null, "Không được để trống !");
                return;
            }
            HDLD hdld = new HDLD(ma, loai, time);
            for (HDLD hd : HDLDlist) {
                if (hdld.trungMa(hd)) {
                    JOptionPane.showMessageDialog(null, "Mã đã tồn tại . Vui lòng nhập mã khác ");
                    return;
                }
            }
            if (hdd.addQuanLyHDLD(hdld)) {
                JOptionPane.showMessageDialog(null, "Thêm thành công !");
                model.addRow(hdld.toObjects());
            } else {
                JOptionPane.showMessageDialog(null, "Thêm mới thất bại ");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_buttonThemMouseClicked

    private void buttonSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSuaMouseClicked
        HDLDDao hdd = new HDLDDao();
        HDLD hdld = new HDLD();
        hdld.setMaHD(txtMaHD.getText());
        hdld.setLoaiHD(txtLoaiHD.getText());
        hdld.setTimeHD(txtTimeHD.getText());

        if (txtMaHD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hãy nhập mã hợp đồng!");
            txtMaHD.requestFocus();
        } else if (txtLoaiHD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hãy nhập loại hợp đồng");
            txtLoaiHD.requestFocus();
        } else if (txtTimeHD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hãy nhập thời hạn hợp đồng");
            txtTimeHD.requestFocus();
        }else {
            if (hdd.updateHDLD(hdld)) {
                JOptionPane.showMessageDialog(null, "Sửa Thành Công!");
                int i = tableQuanLyHDLD.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(txtLoaiHD.getText(), i, 1);
                    model.setValueAt(txtTimeHD.getText(), i, 2);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Sửa thất bại");
            }
            resetThongTin();
        }
    }//GEN-LAST:event_buttonSuaMouseClicked

    private void buronX0aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buronX0aMouseClicked
        HDLDDao hdd = new HDLDDao();
        HDLD qly = new HDLD();
        String MaHD = JOptionPane.showInputDialog(null,"Nhập mã hợp đồng cần xoá");
        qly.setMaHD(MaHD.toString());

        int remove = tableQuanLyHDLD.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá hợp đồng có mã " + MaHD);

        try {
            if(confirm == JOptionPane.YES_OPTION) {
                if(hdd.deleteQuanLyHDLD(qly)) {
                    JOptionPane.showMessageDialog(null, "Xoá thành công!");
                    model.removeRow(remove);
                }
                else { 
                    JOptionPane.showMessageDialog(null, "Xoá thất bại!");

                }
            }
        }
        catch (Exception ex){

        }
    }//GEN-LAST:event_buronX0aMouseClicked

    private void timkiemCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemCBActionPerformed
        
    }//GEN-LAST:event_timkiemCBActionPerformed

    private void timkiemHDclickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemHDclickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiemHDclickActionPerformed

    private void timkiemHDclickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemHDclickMouseClicked
        HDLDDao hdd = new HDLDDao();
        String choice = timkiemCB.getItemAt(timkiemCB.getSelectedIndex());
        if (choice.equals("Tìm kiếm theo mã HĐ")) {
            String input = JOptionPane.showInputDialog(null, "Nhập mã hợp đồng ");
            if (input != null && input.length() > 0) {
                if (hdd.timKiemIdHDLD(input) != null) {
                    model.setRowCount(0);
                    model.addRow(hdd.timKiemIdHDLD(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Mã HĐ không tồn tại ! ");
                }
            }
        } else if (choice.equals("Tìm kiếm theo Loại HĐ")) {
            String input = JOptionPane.showInputDialog(this, "Nhập Loại HĐ cần tìm");

            if (input != null && input.length() > 0) {
                if (hdd.timKiemLoaiHDLD(input) != null) {
                    model.setRowCount(0);
                    model.addRow(hdd.timKiemLoaiHDLD(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Loại HĐ không tồn tại ! ");
                }
            }
        } else if (choice.equals("Tìm kiếm theo Thời hạn HĐ")) {
            String input = JOptionPane.showInputDialog(null, "Nhập Thời hạn HĐ ");
            if (input != null && input.length() > 0) {
                if (hdd.timKiemTimeHDLD(input) != null) {
                    model.setRowCount(0);
                    model.addRow(hdd.timKiemTimeHDLD(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Thời hạn HĐ không tồn tại ! ");
                }
            }
        }
    }//GEN-LAST:event_timkiemHDclickMouseClicked

    private void danhSachHDLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danhSachHDLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_danhSachHDLDActionPerformed

    private void danhSachHDLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_danhSachHDLDMouseClicked
        model.setRowCount(0);
        HDLDlist.forEach(s -> model.addRow(s.toObjects()));        
    }//GEN-LAST:event_danhSachHDLDMouseClicked

    private void txtLoaiHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiHDActionPerformed

    private void txtTimeHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeHDActionPerformed

    private void buronX0aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buronX0aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buronX0aActionPerformed

    
    public void resetThongTin() {
        txtMaHD.setText("");
        txtLoaiHD.setText("");
        txtTimeHD.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buronX0a;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton danhSachHDLD;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableQuanLyHDLD;
    private javax.swing.JComboBox<String> timkiemCB;
    private javax.swing.JButton timkiemHDclick;
    private javax.swing.JTextField txtLoaiHD;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtTimeHD;
    // End of variables declaration//GEN-END:variables
}
