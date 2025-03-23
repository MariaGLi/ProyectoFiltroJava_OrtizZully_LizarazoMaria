package MVC.Model;

public class supplies {
    private int id_supply;
    private String nameSupply;
    private int quantity_in_stock;
    private int quantity_entered;
    private String expiration_date;
    private int id_supplier;

    public supplies() {
    }

    public supplies(int id_supply, String nameSupply, int quantity_in_stock, int quantity_entered, String expiration_date, int id_supplier) {
        this.id_supply = id_supply;
        this.nameSupply = nameSupply;
        this.quantity_in_stock = quantity_in_stock;
        this.quantity_entered = quantity_entered;
        this.expiration_date = expiration_date;
        this.id_supplier = id_supplier;
    }

    public int getId_supply() {
        return id_supply;
    }

    public void setId_supply(int id_supply) {
        this.id_supply = id_supply;
    }

    public String getNameSupply() {
        return nameSupply;
    }

    public void setNameSupply(String nameSupply) {
        this.nameSupply = nameSupply;
    }

    public int getQuantity_in_stock() {
        return quantity_in_stock;
    }

    public void setQuantity_in_stock(int quantity_in_stock) {
        this.quantity_in_stock = quantity_in_stock;
    }

    public int getQuantity_entered() {
        return quantity_entered;
    }

    public void setQuantity_entered(int quantity_entered) {
        this.quantity_entered = quantity_entered;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }
}
