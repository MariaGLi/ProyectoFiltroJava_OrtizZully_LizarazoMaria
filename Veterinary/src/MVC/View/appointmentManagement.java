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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MANAGE");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CONSULTATIONS");

        viewAppointments.setBackground(new java.awt.Color(0, 102, 102));
        viewAppointments.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        viewAppointments.setForeground(new java.awt.Color(255, 255, 255));
        viewAppointments.setText("View assigned appointments");
        viewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentsActionPerformed(evt);
            }
        });

        cancelAppointment.setBackground(new java.awt.Color(0, 102, 102));
        cancelAppointment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cancelAppointment.setForeground(new java.awt.Color(255, 255, 255));
        cancelAppointment.setText("Cancel an appointment");
        cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAppointmentActionPerformed(evt);
            }
        });

        addDiagnostic.setBackground(new java.awt.Color(0, 102, 102));
        addDiagnostic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addDiagnostic.setForeground(new java.awt.Color(255, 255, 255));
        addDiagnostic.setText("Add diagnostic");
        addDiagnostic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiagnosticActionPerformed(evt);
            }
        });

        addAppointment.setBackground(new java.awt.Color(0, 102, 102));
        addAppointment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addAppointment.setForeground(new java.awt.Color(255, 255, 255));
        addAppointment.setText("Add an appointment");
        addAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 135, Short.MAX_VALUE)
                            .addComponent(addDiagnostic))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 78, Short.MAX_VALUE)
                            .addComponent(cancelAppointment)))
                    .addGap(82, 82, 82))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 63, Short.MAX_VALUE)
                    .addComponent(viewAppointments)
                    .addGap(58, 58, 58)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(addAppointment)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(addAppointment)
                .addGap(29, 29, 29)
                .addComponent(viewAppointments)
                .addGap(29, 29, 29)
                .addComponent(cancelAppointment)
                .addGap(29, 29, 29)
                .addComponent(addDiagnostic)
                .addGap(87, 87, 87))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addAppointment;
    public javax.swing.JButton addDiagnostic;
    public javax.swing.JButton cancelAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton viewAppointments;
    // End of variables declaration//GEN-END:variables
}
