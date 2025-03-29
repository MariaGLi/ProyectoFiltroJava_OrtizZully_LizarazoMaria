package vista;

public class vistaVaccines extends javax.swing.JFrame {

    public vistaVaccines() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        idVaccine = new javax.swing.JLabel();
        vaccineType = new javax.swing.JLabel();
        manufacturer = new javax.swing.JLabel();
        lot = new javax.swing.JLabel();
        adminDate = new javax.swing.JLabel();
        expDate = new javax.swing.JLabel();
        txtidVaccine = new javax.swing.JTextField();
        txtvaccineType = new javax.swing.JTextField();
        txtManufacturer = new javax.swing.JTextField();
        txtLot = new javax.swing.JTextField();
        txtadminDate = new javax.swing.JTextField();
        txtexpDate = new javax.swing.JTextField();
        entryDate = new javax.swing.JLabel();
        nextDoseDate = new javax.swing.JLabel();
        txtentryDate = new javax.swing.JTextField();
        quantityStock = new javax.swing.JLabel();
        quantityEntered = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnextDose = new javax.swing.JTextField();
        txtquantStock = new javax.swing.JTextField();
        txtquantEntered = new javax.swing.JTextField();
        txtidPet = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        fondoTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        titulo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        titulo.setText("Vaccines");

        idVaccine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idVaccine.setText("IdVaccine:");

        vaccineType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vaccineType.setText("VaccineType:");

        manufacturer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manufacturer.setText("Manufacturer:");

        lot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lot.setText("Lot:");

        adminDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminDate.setText("AdministrationDate:");

        expDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        expDate.setText("ExpirationDate:");

        entryDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        entryDate.setText("EntryDate:");

        nextDoseDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nextDoseDate.setText("NextDoseDate:");

        quantityStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantityStock.setText("QuantityStock:");

        quantityEntered.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantityEntered.setText("QuantityEntered:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("IdPet:");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");

        btnList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnList.setText("List");

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setText("Save");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(expDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(txtexpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(adminDate)
                                .addGap(18, 18, 18)
                                .addComponent(txtadminDate))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idVaccine)
                                    .addComponent(vaccineType)
                                    .addComponent(manufacturer)
                                    .addComponent(lot))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidVaccine, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(txtvaccineType)
                                    .addComponent(txtManufacturer)
                                    .addComponent(txtLot, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entryDate)
                                    .addComponent(nextDoseDate)
                                    .addComponent(quantityStock))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtentryDate)
                                    .addComponent(txtnextDose)
                                    .addComponent(txtquantStock, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityEntered)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidPet, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtquantEntered))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idVaccine)
                    .addComponent(txtidVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDate)
                    .addComponent(txtentryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineType)
                    .addComponent(txtvaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextDoseDate)
                    .addComponent(txtnextDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityStock)
                    .addComponent(txtquantStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnList)
                    .addComponent(btnSave))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lot)
                    .addComponent(txtLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityEntered)
                    .addComponent(txtquantEntered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminDate)
                    .addComponent(txtadminDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtidPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expDate)
                    .addComponent(txtexpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        fondoTabla.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdVaccine", "VaccineType", "Manufacturer", "Lot", "AdminDate", "ExpDate", "EntryDate", "NextDose", "QuantityStock", "QuantityEntered", "IdPet"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout fondoTablaLayout = new javax.swing.GroupLayout(fondoTabla);
        fondoTabla.setLayout(fondoTablaLayout);
        fondoTablaLayout.setHorizontalGroup(
            fondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        fondoTablaLayout.setVerticalGroup(
            fondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTablaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fondoTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminDate;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnList;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JLabel entryDate;
    private javax.swing.JLabel expDate;
    private javax.swing.JPanel fondoTabla;
    private javax.swing.JLabel idVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lot;
    private javax.swing.JLabel manufacturer;
    private javax.swing.JLabel nextDoseDate;
    private javax.swing.JLabel quantityEntered;
    private javax.swing.JLabel quantityStock;
    public javax.swing.JTable table;
    private javax.swing.JLabel titulo;
    public javax.swing.JTextField txtLot;
    public javax.swing.JTextField txtManufacturer;
    public javax.swing.JTextField txtadminDate;
    public javax.swing.JTextField txtentryDate;
    public javax.swing.JTextField txtexpDate;
    public javax.swing.JTextField txtidPet;
    public javax.swing.JTextField txtidVaccine;
    public javax.swing.JTextField txtnextDose;
    public javax.swing.JTextField txtquantEntered;
    public javax.swing.JTextField txtquantStock;
    public javax.swing.JTextField txtvaccineType;
    private javax.swing.JLabel vaccineType;
    // End of variables declaration//GEN-END:variables
}
