package MVC.View;

public class appointmentManagement extends javax.swing.JFrame {

    public appointmentManagement() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewAppointments = new javax.swing.JButton();
        cancelAppointment = new javax.swing.JButton();
        addDiagnostic = new javax.swing.JButton();
        addAppointment = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(96, 163, 188));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Appointments");

        viewAppointments.setBackground(new java.awt.Color(255, 255, 255));
        viewAppointments.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        viewAppointments.setForeground(new java.awt.Color(44, 62, 80));
        viewAppointments.setText("View assigned appointments");
        viewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentsActionPerformed(evt);
            }
        });

        cancelAppointment.setBackground(new java.awt.Color(255, 255, 255));
        cancelAppointment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        cancelAppointment.setForeground(new java.awt.Color(44, 62, 80));
        cancelAppointment.setText("Cancel an appointment");
        cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAppointmentActionPerformed(evt);
            }
        });

        addDiagnostic.setBackground(new java.awt.Color(255, 255, 255));
        addDiagnostic.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        addDiagnostic.setForeground(new java.awt.Color(44, 62, 80));
        addDiagnostic.setText("Add diagnostic");
        addDiagnostic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiagnosticActionPerformed(evt);
            }
        });

        addAppointment.setBackground(new java.awt.Color(255, 255, 255));
        addAppointment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        addAppointment.setForeground(new java.awt.Color(44, 62, 80));
        addAppointment.setText("Add an appointment");
        addAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(44, 62, 80));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancelAppointment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAppointments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(addAppointment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addDiagnostic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(addAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addDiagnostic, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentsActionPerformed
        // TODO add your handling code here:
        viewAppointment abrir = new viewAppointment();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewAppointmentsActionPerformed

    private void addAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAppointmentActionPerformed
        // TODO add your handling code here:
        addAppointment abrir = new addAppointment();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addAppointmentActionPerformed

    private void cancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAppointmentActionPerformed
        // TODO add your handling code here:
        cancelAppointment abrir = new cancelAppointment();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelAppointmentActionPerformed

    private void addDiagnosticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiagnosticActionPerformed
        manageConsultationsVeterinary mv = new manageConsultationsVeterinary();
        mv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addDiagnosticActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuOwner mo = new MenuOwner();
        mo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addAppointment;
    public javax.swing.JButton addDiagnostic;
    public javax.swing.JButton cancelAppointment;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton viewAppointments;
    // End of variables declaration//GEN-END:variables
}
