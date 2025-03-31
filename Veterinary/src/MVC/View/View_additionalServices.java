package MVC.View;

public class View_additionalServices extends javax.swing.JFrame {

    public View_additionalServices() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        fondoVerde = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        idPet = new javax.swing.JLabel();
        servicesType = new javax.swing.JLabel();
        descServices = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        txtidPet = new javax.swing.JTextField();
        txtServType = new javax.swing.JTextField();
        txtdescServ = new javax.swing.JTextField();
        txtdateTime = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnBackAS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Happy Feet");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoVerde.setBackground(new java.awt.Color(96, 163, 188));

        titulo2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Additional  Services");

        idPet.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        idPet.setForeground(new java.awt.Color(255, 255, 255));
        idPet.setText("IdPet: ");

        servicesType.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        servicesType.setForeground(new java.awt.Color(255, 255, 255));
        servicesType.setText("ServicesType: ");

        descServices.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        descServices.setForeground(new java.awt.Color(255, 255, 255));
        descServices.setText("DescripcionServices: ");

        dateTime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        dateTime.setForeground(new java.awt.Color(255, 255, 255));
        dateTime.setText("DateTime:");

        txtidPet.setBackground(new java.awt.Color(255, 255, 255));

        txtServType.setBackground(new java.awt.Color(255, 255, 255));

        txtdescServ.setBackground(new java.awt.Color(255, 255, 255));

        txtdateTime.setBackground(new java.awt.Color(255, 255, 255));

        btnCancel.setBackground(new java.awt.Color(44, 62, 80));
        btnCancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");

        btnList.setBackground(new java.awt.Color(44, 62, 80));
        btnList.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnList.setForeground(new java.awt.Color(255, 255, 255));
        btnList.setText("List");

        btnAdd.setBackground(new java.awt.Color(44, 62, 80));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");

        btnBackAS.setBackground(new java.awt.Color(44, 62, 80));
        btnBackAS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnBackAS.setForeground(new java.awt.Color(255, 255, 255));
        btnBackAS.setText("Back");
        btnBackAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackASActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdService", "IdPet", "ServicesType", "DescServices", "DateTime"
            }
        ));
        jScrollPane1.setViewportView(table);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout fondoVerdeLayout = new javax.swing.GroupLayout(fondoVerde);
        fondoVerde.setLayout(fondoVerdeLayout);
        fondoVerdeLayout.setHorizontalGroup(
            fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoVerdeLayout.createSequentialGroup()
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoVerdeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(fondoVerdeLayout.createSequentialGroup()
                                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(fondoVerdeLayout.createSequentialGroup()
                                        .addComponent(idPet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtidPet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fondoVerdeLayout.createSequentialGroup()
                                        .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(servicesType)
                                            .addComponent(dateTime)
                                            .addComponent(descServices))
                                        .addGap(45, 45, 45)
                                        .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdescServ)
                                            .addComponent(txtServType))))
                                .addGap(44, 44, 44)
                                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd)
                                    .addComponent(btnCancel)
                                    .addComponent(btnList))
                                .addGap(27, 27, 27))))
                    .addGroup(fondoVerdeLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnBackAS)))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo2)
                .addGap(142, 142, 142))
        );
        fondoVerdeLayout.setVerticalGroup(
            fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoVerdeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titulo2)
                .addGap(54, 54, 54)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPet)
                    .addComponent(txtidPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnList))
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoVerdeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servicesType)))
                    .addGroup(fondoVerdeLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descServices)
                    .addComponent(txtdescServ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTime)
                    .addComponent(txtdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnBackAS)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackASActionPerformed
        MenuOwner mo = new MenuOwner();
        mo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackASActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnBackAS;
    public javax.swing.JButton btnCancel;
    public javax.swing.JButton btnList;
    public javax.swing.JLabel dateTime;
    public javax.swing.JLabel descServices;
    private javax.swing.JPanel fondoVerde;
    public javax.swing.JLabel idPet;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel servicesType;
    public javax.swing.JTable table;
    public javax.swing.JLabel titulo2;
    public javax.swing.JTextField txtServType;
    public javax.swing.JTextField txtdateTime;
    public javax.swing.JTextField txtdescServ;
    public javax.swing.JTextField txtidPet;
    // End of variables declaration//GEN-END:variables
}
