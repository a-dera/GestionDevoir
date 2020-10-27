/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devgest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author deraa
 */
public class PageAcceuil extends javax.swing.JFrame implements Runnable{
     private Date date;
    private SimpleDateFormat f;
    private Thread t;
    /**
     * Creates new form PageAcceuil
     */
    public PageAcceuil() {
        initComponents();
        this.f = new SimpleDateFormat("hh:mm:ss");
        this.t = new Thread(this);
        this.t.start();
         Dash dash = new Dash();
        content1.add(dash).setVisible(true);
    }
    
    public void run() {
        while(true){
            this.date = new Date();
            String currentTime = this.f.format(this.date);
            this.TimeCard.setText(currentTime);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PageAcceuil.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        bg = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        saveB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        editB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        deleteB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        showB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        saveSB = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        editSB = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        deleteSB = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        showSB = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        banner = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TimeCard = new javax.swing.JLabel();
        content1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 800));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side.setBackground(new java.awt.Color(102, 0, 255));

        logo.setBackground(new java.awt.Color(102, 0, 255));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel11.setText("DevGest");

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setText("Gestion des devoirs");

        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        saveB.setBackground(new java.awt.Color(153, 0, 204));
        saveB.setText("Enregistrer");
        saveB.setBorder(null);
        saveB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveB, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(150, 70, 210));

        editB.setBackground(new java.awt.Color(153, 0, 204));
        editB.setText("Modifier");
        editB.setBorder(null);
        editB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(150, 70, 210));

        deleteB.setBackground(new java.awt.Color(153, 0, 204));
        deleteB.setText("Supprimer");
        deleteB.setBorder(null);
        deleteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(150, 70, 210));

        showB.setBackground(new java.awt.Color(153, 0, 204));
        showB.setText("Afficher");
        showB.setBorder(null);
        showB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(showB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoLayout.createSequentialGroup()
                        .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(logoLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(logoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(logoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(logoLayout.createSequentialGroup()
                                .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setText("Gestion des surveillants");

        jPanel5.setBackground(new java.awt.Color(150, 70, 210));

        saveSB.setBackground(new java.awt.Color(153, 0, 204));
        saveSB.setText("Enregistrer");
        saveSB.setBorder(null);
        saveSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveSBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(saveSB, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveSB, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(150, 70, 210));

        editSB.setBackground(new java.awt.Color(153, 0, 204));
        editSB.setText("Modifier");
        editSB.setBorder(null);
        editSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(editSB, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editSB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(150, 70, 210));

        deleteSB.setBackground(new java.awt.Color(153, 0, 204));
        deleteSB.setText("Supprimer");
        deleteSB.setBorder(null);
        deleteSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSBMouseClicked(evt);
            }
        });
        deleteSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteSB, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteSB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(150, 70, 210));

        showSB.setBackground(new java.awt.Color(153, 0, 204));
        showSB.setText("Afficher");
        showSB.setBorder(null);
        showSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showSBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(showSB, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showSB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(102, 0, 255));

        jLabel3.setBackground(new java.awt.Color(102, 0, 255));
        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setText("DevGest---2020");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideLayout.createSequentialGroup()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sideLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        bg.add(side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        content.setBackground(new java.awt.Color(204, 204, 204));

        banner.setBackground(new java.awt.Color(215, 138, 15));

        jLabel12.setText("LogoDeconnexion");

        jLabel13.setText("NomUser");

        jLabel14.setText("Date");

        TimeCard.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        TimeCard.setText("hh:mm:ss");

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerLayout.createSequentialGroup()
                .addContainerGap(641, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(97, 97, 97)
                .addComponent(TimeCard, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel13)
                .addGap(73, 73, 73)
                .addComponent(jLabel12)
                .addGap(49, 49, 49))
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(bannerLayout.createSequentialGroup()
                .addComponent(TimeCard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        content1.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout content1Layout = new javax.swing.GroupLayout(content1);
        content1.setLayout(content1Layout);
        content1Layout.setHorizontalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1263, Short.MAX_VALUE)
        );
        content1Layout.setVerticalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(content1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(content1))
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 0, -1, 800));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void showSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showSBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));

        jPanel8.setBackground(new java.awt.Color(100, 0, 150));
        content1.removeAll();
        ListerSurveillant ls= new ListerSurveillant();
        content1.add(ls).setVisible(true);
    }//GEN-LAST:event_showSBMouseClicked

    private void deleteSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteSBActionPerformed

    private void deleteSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));

        jPanel7.setBackground(new java.awt.Color(100, 0, 150));
        content1.removeAll();
        SupprimerSurveillant ss= new SupprimerSurveillant();
        content1.add(ss).setVisible(true);
    }//GEN-LAST:event_deleteSBMouseClicked

    private void editSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));

        jPanel6.setBackground(new java.awt.Color(100, 0, 150));
        content1.removeAll();
        ModifierSurveillant ms= new ModifierSurveillant();
        content1.add(ms).setVisible(true);
    }//GEN-LAST:event_editSBMouseClicked

    private void saveSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveSBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));

        jPanel5.setBackground(new java.awt.Color(100, 0, 150));
        content1.removeAll();
        EnregistrerSurveillant es= new EnregistrerSurveillant();
        content1.add(es).setVisible(true);
    }//GEN-LAST:event_saveSBMouseClicked

    private void showBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(100, 0, 150));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));
        content1.removeAll();
        ListerDevoir ld = new ListerDevoir();
        content1.add(ld).setVisible(true);
    }//GEN-LAST:event_showBMouseClicked

    private void deleteBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(100, 0, 150));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));
        content1.removeAll();
        SupprimerDevoir sd = new SupprimerDevoir();
        content1.add(sd).setVisible(true);
    }//GEN-LAST:event_deleteBMouseClicked

    private void editBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBMouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(100, 0, 150));
        content1.removeAll();
        ModifierDevoir md = new ModifierDevoir();
        content1.add(md).setVisible(true);
    }//GEN-LAST:event_editBMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseClicked

    private void saveBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBMouseClicked
        // TODO add your handling code here:
        jPanel4.setBackground(new java.awt.Color(150, 70, 210));
        jPanel2.setBackground(new java.awt.Color(150, 70, 210));
        jPanel3.setBackground(new java.awt.Color(150, 70, 210));
        jPanel6.setBackground(new java.awt.Color(150, 70, 210));
        jPanel7.setBackground(new java.awt.Color(150, 70, 210));
        jPanel8.setBackground(new java.awt.Color(150, 70, 210));
        jPanel5.setBackground(new java.awt.Color(150, 70, 210));

        jPanel1.setBackground(new java.awt.Color(100, 0, 150));
        content1.removeAll();
        EnregistrerDevoir ed = new EnregistrerDevoir();
        content1.add(ed).setVisible(true);
    }//GEN-LAST:event_saveBMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAcceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeCard;
    private javax.swing.JPanel banner;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JDesktopPane content1;
    private javax.swing.JButton deleteB;
    private javax.swing.JButton deleteSB;
    private javax.swing.JButton editB;
    private javax.swing.JButton editSB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel logo;
    private javax.swing.JButton saveB;
    private javax.swing.JButton saveSB;
    private javax.swing.JButton showB;
    private javax.swing.JButton showSB;
    private javax.swing.JPanel side;
    // End of variables declaration//GEN-END:variables
}
