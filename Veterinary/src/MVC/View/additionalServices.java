package MVC.View;

public class additionalServices extends javax.swing.JFrame {

    public additionalServices() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        fondoBlanco = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
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
        fondoGris = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Happy Feet");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 102));
        titulo.setText("Happy Feet");

        javax.swing.GroupLayout fondoBlancoLayout = new javax.swing.GroupLayout(fondoBlanco);
        fondoBlanco.setLayout(fondoBlancoLayout);
        fondoBlancoLayout.setHorizontalGroup(
            fondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoBlancoLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(titulo)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        fondoBlancoLayout.setVerticalGroup(
            fondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoBlancoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoVerde.setBackground(new java.awt.Color(0, 102, 102));

        titulo2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("AdditionalServices");

        idPet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idPet.setText("IdPet: ");

        servicesType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        servicesType.setText("ServicesType: ");

        descServices.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descServices.setText("DescripcionServices: ");

        dateTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateTime.setText("DateTime:");

        btnCancel.setText("Cancel");

        btnList.setText("List");

        btnAdd.setText("Add");

        btnBackAS.setText("Back");
        btnBackAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoVerdeLayout = new javax.swing.GroupLayout(fondoVerde);
        fondoVerde.setLayout(fondoVerdeLayout);
        fondoVerdeLayout.setHorizontalGroup(
            fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoVerdeLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idPet)
                    .addComponent(dateTime)
                    .addComponent(descServices)
                    .addComponent(servicesType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtdescServ, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidPet)
                    .addComponent(txtServType)
                    .addComponent(txtdateTime, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(fondoVerdeLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnCancel)
                .addGap(52, 52, 52)
                .addComponent(btnList)
                .addGap(52, 52, 52)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoVerdeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoVerdeLayout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoVerdeLayout.createSequentialGroup()
                        .addComponent(btnBackAS)
                        .addGap(134, 134, 134))))
        );
        fondoVerdeLayout.setVerticalGroup(
            fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoVerdeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo2)
                .addGap(49, 49, 49)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idPet)
                    .addComponent(txtidPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicesType)
                    .addComponent(txtServType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descServices)
                    .addComponent(txtdescServ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTime)
                    .addComponent(txtdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(fondoVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnList)
                    .addComponent(btnAdd))
                .addGap(47, 47, 47)
                .addComponent(btnBackAS)
                .addGap(19, 19, 19))
        );

        fondoGris.setBackground(new java.awt.Color(204, 204, 204));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdService", "IdPet", "ServicesType", "DescServices", "DateTime"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout fondoGrisLayout = new javax.swing.GroupLayout(fondoGris);
        fondoGris.setLayout(fondoGrisLayout);
        fondoGrisLayout.setHorizontalGroup(
            fondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        fondoGrisLayout.setVerticalGroup(
            fondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(fondoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(fondoGris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fondoVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(fondoGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    public javax.swing.JPanel fondoBlanco;
    private javax.swing.JPanel fondoGris;
    private javax.swing.JPanel fondoVerde;
    public javax.swing.JLabel idPet;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel servicesType;
    public javax.swing.JTable table;
    public javax.swing.JLabel titulo;
    public javax.swing.JLabel titulo2;
    public javax.swing.JTextField txtServType;
    public javax.swing.JTextField txtdateTime;
    public javax.swing.JTextField txtdescServ;
    public javax.swing.JTextField txtidPet;
    // End of variables declaration//GEN-END:variables
}
