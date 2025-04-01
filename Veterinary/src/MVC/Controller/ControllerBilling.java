
package MVC.Controller;

import javax.swing.JTable;
import MVC.Model.BillingDAO;
import MVC.Model.billing;
import MVC.View.crudBillings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;




public class ControllerBilling implements ActionListener{

    private BillingDAO dao;
    private billing bill;
    private crudBillings viewBill;
    private DefaultTableModel model;

    public ControllerBilling(BillingDAO dao, billing bill, crudBillings viewBill) {
        this.dao = dao;
        this.bill = bill;
        this.viewBill = viewBill;
        
        this.viewBill.btnDeleteBi.addActionListener(this);
        this.viewBill.btnInsertBi.addActionListener(this);
        this.viewBill.btnListBi.addActionListener(this);
        this.viewBill.btnUpdateBi.addActionListener(this);
        this.viewBill.btnPDF.addActionListener(this);
        
    }
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewBill.btnInsertBi) {
            
            bill.setId_veterinarian(Integer.parseInt(viewBill.txtIdVetBi.getText()));
            bill.setId_owner(Integer.parseInt(viewBill.txtIdOwBil.getText()));
            bill.setId_consultation(Integer.parseInt(viewBill.txtIdConBil.getText()));
            bill.setIssue_date(viewBill.txtDateBi.getText());
            bill.setDescription(viewBill.txtDescipBi.getText());
            bill.setQuantity(Integer.parseInt(viewBill.txtQuantityBi.getText()));
            bill.setUnit_value(Float.parseFloat(viewBill.txtUnitBi.getText()));
            bill.setSubtotal(bill.getQuantity() * bill.getUnit_value());
            bill.setTax(Float.parseFloat(viewBill.txtTaxBi.getText()));
            bill.setTotal(bill.getSubtotal() + bill.getTax());
            bill.setStatusBill((String)viewBill.cbStatuBi.getSelectedItem());
            if(dao.InsertBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Billing added");
                ListBilling(viewBill.TableBi);
            } else {
                JOptionPane.showMessageDialog(null, "Billing not added");
            }
            
        }
        
        if (e.getSource() == viewBill.btnUpdateBi) {
            bill.setId_bill(Integer.parseInt(viewBill.txtIdBi.getText()));
            bill.setId_veterinarian(Integer.parseInt(viewBill.txtIdVetBi.getText()));
            bill.setId_owner(Integer.parseInt(viewBill.txtIdOwBil.getText()));
            bill.setId_consultation(Integer.parseInt(viewBill.txtIdConBil.getText()));
            bill.setIssue_date(viewBill.txtDateBi.getText());
            bill.setDescription(viewBill.txtDescipBi.getText());
            bill.setQuantity(Integer.parseInt(viewBill.txtQuantityBi.getText()));
            bill.setUnit_value(Float.parseFloat(viewBill.txtUnitBi.getText()));
            bill.setSubtotal(bill.getQuantity() * bill.getUnit_value());
            bill.setTax(Float.parseFloat(viewBill.txtTaxBi.getText()));
            bill.setTotal(bill.getSubtotal() + bill.getTax());
            bill.setStatusBill((String)viewBill.cbStatuBi.getSelectedItem());
            if (dao.UpdateBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Billing update");
                
            } else {
                JOptionPane.showMessageDialog(null, "Billing not update");
            }
            
        }
        
        if (e.getSource() == viewBill.btnDeleteBi) {
            bill.setId_bill(Integer.parseInt(viewBill.txtIdBi.getText()));
            if (dao.DeleteBilling(bill)) {
                JOptionPane.showMessageDialog(null, "Billing delete");
                
            } else {
                JOptionPane.showMessageDialog(null, "Billing not delete");
            }
            
        }
        
        if (e.getSource() == viewBill.btnListBi) {
            ListBilling(viewBill.TableBi);
        }
        
        if(e.getSource() == viewBill.btnPDF){
            PDF();
        }

    }
    
    private void ListBilling(JTable table){
        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        List<billing> bills = dao.ListBilling();
        
        
        Object[] object = new Object[12];
        for(int i = 0; i<bills.size(); i++){
            object[0] = bills.get(i).getId_bill();
            object[1] = bills.get(i).getId_veterinarian();
            object[2] = bills.get(i).getId_owner();
            object[3] = bills.get(i).getId_consultation();
            object[4] = bills.get(i).getIssue_date();
            object[5] = bills.get(i).getDescription();
            object[6] = bills.get(i).getQuantity();
            object[7] = bills.get(i).getUnit_value();
            object[8] = bills.get(i).getSubtotal();
            object[9] = bills.get(i).getTax();
            object[10] = bills.get(i).getTotal();
            object[11] = bills.get(i).getStatusBill();
            
            model.addRow(object);
        }
        viewBill.TableBi.setModel(model);
    }
   
    public void PDF(){
        Document doc = null;
        try{
            // Get all bill
            List<billing> bills = dao.ListBilling();
            if (bills == null || bills.isEmpty()){
                JOptionPane.showMessageDialog(null, "no bill found un the databse to generate PDF- ");
                return;
            }
            
            
            // Use JFileChooser to let the user choose where to save the PDF
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save PDF of Billings");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setSelectedFile(new File("Happy_Feet.pdf"));
            int userSelecction = fileChooser.showSaveDialog(null);
            if(userSelecction != JFileChooser.APPROVE_OPTION){
                return;
            }
            
            File SaveFile = fileChooser.getSelectedFile();
            String ruta = SaveFile.getAbsolutePath();
            
            // Create the PDF document
            doc = new Document(PageSize.A4);
            PdfWriter.getInstance(doc, new FileOutputStream(ruta));
            doc.open();
            
            // Header
            Font titleFont = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD);
            Paragraph title = new Paragraph("Billing - FEEL HAPPY", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);
            doc.add(new Paragraph("\n")); // Space
            
            // Create data bill of narrative formate
            Font labelFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font valueFont = new Font(Font.FontFamily.HELVETICA, 12);
            
            
            for (billing bill : bills) {
                Paragraph idBillP = new Paragraph();
                idBillP.add(new Phrase("Bill Number: ", labelFont));
                idBillP.add(new Phrase(String.valueOf(bill.getId_bill()), valueFont));
                doc.add(idBillP);

                Paragraph datePara = new Paragraph();
                datePara.add(new Phrase("Date Issue: ", labelFont));
                datePara.add(new Phrase(bill.getIssue_date() != null ? bill.getIssue_date() : "N/A", valueFont));
                doc.add(datePara);

                Paragraph ownerPara = new Paragraph();
                ownerPara.add(new Phrase("Owner ID: ", labelFont));
                ownerPara.add(new Phrase(String.valueOf(bill.getId_owner()), valueFont));
                doc.add(ownerPara);

                Paragraph vetPara = new Paragraph();
                vetPara.add(new Phrase("Veterinarian ID: ", labelFont));
                vetPara.add(new Phrase(String.valueOf(bill.getId_veterinarian()), valueFont));
                doc.add(vetPara);

                Paragraph consultationPara = new Paragraph();
                consultationPara.add(new Phrase("Consultation: ", labelFont));
                consultationPara.add(new Phrase(String.valueOf(bill.getId_consultation()), valueFont));
                doc.add(consultationPara);

                doc.add(new Paragraph("\n"));

                Paragraph descPara = new Paragraph();
                descPara.add(new Phrase("Description of Service: ", labelFont));
                descPara.add(new Phrase(bill.getDescription() != null ? bill.getDescription() : "N/A", valueFont));
                doc.add(descPara);

                Paragraph quantityPara = new Paragraph();
                quantityPara.add(new Phrase("Quantity: ", labelFont));
                quantityPara.add(new Phrase(String.valueOf(bill.getQuantity()), valueFont));
                doc.add(quantityPara);

                Paragraph unitValuePara = new Paragraph();
                unitValuePara.add(new Phrase("Unit Value: ", labelFont));
                unitValuePara.add(new Phrase(String.format("%.2f", bill.getUnit_value()), valueFont));
                doc.add(unitValuePara);

                Paragraph subtotalPara = new Paragraph();
                subtotalPara.add(new Phrase("Subtotal: ", labelFont));
                subtotalPara.add(new Phrase(String.format("%.2f", bill.getSubtotal()), valueFont));
                doc.add(subtotalPara);

                Paragraph taxPara = new Paragraph();
                taxPara.add(new Phrase("Tax: ", labelFont));
                taxPara.add(new Phrase(String.format("%.2f", bill.getTax()), valueFont));
                doc.add(taxPara);

                Paragraph totalPara = new Paragraph();
                totalPara.add(new Phrase("Total: ", labelFont));
                totalPara.add(new Phrase(String.format("%.2f", bill.getTotal()), valueFont));
                doc.add(totalPara);

                Paragraph statusPara = new Paragraph();
                statusPara.add(new Phrase("State: ", labelFont));
                statusPara.add(new Phrase(bill.getStatusBill() != null ? bill.getStatusBill() : "N/A", valueFont));
                doc.add(statusPara);

                // Separador entre facturas
                doc.add(new Paragraph("\n"));
                doc.add(new Paragraph("----------------------------------------"));
                doc.add(new Paragraph("\n"));
            }


            doc.add(new Paragraph("\n"));
            Font footerFont = new Font(Font.FontFamily.HELVETICA, 10, Font.ITALIC);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentDate = sdf.format(new Date());
            Paragraph footer = new Paragraph("Generate of: " + currentDate, footerFont);
            footer.setAlignment(Element.ALIGN_RIGHT);
            doc.add(footer);


            JOptionPane.showMessageDialog(null, "PDF sucessfull generated: " + ruta);

        } catch (DocumentException de) {
            System.err.println("iText DocumentException: " + de.getMessage());
            de.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to generated PDF: " + de.getMessage());
        } catch (Exception ex) {
            System.err.println("General Exception: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to generate PDF: " + ex.getMessage());
        } finally {
            if (doc != null && doc.isOpen()) {
                doc.close();
            }
        }
    }

}

