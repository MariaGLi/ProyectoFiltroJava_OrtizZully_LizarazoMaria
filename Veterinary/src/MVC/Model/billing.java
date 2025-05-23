package MVC.Model;

public class billing {
    private int id_bill;
    private int id_veterinarian;
    private int id_owner;
    private int id_consultation;
    private String issue_date;
    private String description;
    private int quantity;
    private Float unit_value;
    private Float subtotal;
    private Float tax;
    private Float total;
    private String statusBill;

    public billing() {
    }

    public billing(int id_bill, int id_veterinarian, int id_owner, int id_consultation, String issue_date, String description, int quantity, Float unit_value, Float subtotal, Float tax, Float total, String statusBill) {
        this.id_bill = id_bill;
        this.id_veterinarian = id_veterinarian;
        this.id_owner = id_owner;
        this.id_consultation = id_consultation;
        this.issue_date = issue_date;
        this.description = description;
        this.quantity = quantity;
        this.unit_value = unit_value;
        this.subtotal = subtotal;
        this.tax = tax;
        this.total = total;
        this.statusBill = statusBill;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public int getId_veterinarian() {
        return id_veterinarian;
    }

    public void setId_veterinarian(int id_veterinarian) {
        this.id_veterinarian = id_veterinarian;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getUnit_value() {
        return unit_value;
    }

    public void setUnit_value(Float unit_value) {
        this.unit_value = unit_value;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getStatusBill() {
        return statusBill;
    }

    public void setStatusBill(String statusBill) {
        this.statusBill = statusBill;
    }

    

    
    
}
