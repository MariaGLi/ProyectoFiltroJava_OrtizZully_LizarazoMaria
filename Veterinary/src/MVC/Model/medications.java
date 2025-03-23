package MVC.Model;

public class medications {
    private int id_medication;
    private String nameMedication;
    private String typeMedication;
    private String manufacturer;
    private int quantity_in_stock;
    private String expiration_date;
    private int quantity_entered;
    private int id_supplier;

    public medications() {
    }

    public medications(int id_medication, String nameMedication, String typeMedication, String manufacturer, int quantity_in_stock, String expiration_date, int quantity_entered, int id_supplier) {
        this.id_medication = id_medication;
        this.nameMedication = nameMedication;
        this.typeMedication = typeMedication;
        this.manufacturer = manufacturer;
        this.quantity_in_stock = quantity_in_stock;
        this.expiration_date = expiration_date;
        this.quantity_entered = quantity_entered;
        this.id_supplier = id_supplier;
    }

    public int getId_medication() {
        return id_medication;
    }

    public void setId_medication(int id_medication) {
        this.id_medication = id_medication;
    }

    public String getNameMedication() {
        return nameMedication;
    }

    public void setNameMedication(String nameMedication) {
        this.nameMedication = nameMedication;
    }

    public String getTypeMedication() {
        return typeMedication;
    }

    public void setTypeMedication(String typeMedication) {
        this.typeMedication = typeMedication;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity_in_stock() {
        return quantity_in_stock;
    }

    public void setQuantity_in_stock(int quantity_in_stock) {
        this.quantity_in_stock = quantity_in_stock;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public int getQuantity_entered() {
        return quantity_entered;
    }

    public void setQuantity_entered(int quantity_entered) {
        this.quantity_entered = quantity_entered;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }
}
