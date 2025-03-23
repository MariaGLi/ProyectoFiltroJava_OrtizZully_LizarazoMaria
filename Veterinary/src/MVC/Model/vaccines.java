package MVC.Model;

public class vaccines {
    private int id_vaccine;
    private String vaccine_type;
    private String manufacturer;
    private String lot;
    private String administration_date;
    private String expiration_date;
    private String entry_date;
    private String next_dose_date;
    private int quantity_in_stock;
    private int quantity_entered;
    private int id_pet;

    public vaccines() {
    }

    public vaccines(int id_vaccine, String vaccine_type, String manufacturer, String lot, String administration_date, String expiration_date, String entry_date, String next_dose_date, int quantity_in_stock, int quantity_entered, int id_pet) {
        this.id_vaccine = id_vaccine;
        this.vaccine_type = vaccine_type;
        this.manufacturer = manufacturer;
        this.lot = lot;
        this.administration_date = administration_date;
        this.expiration_date = expiration_date;
        this.entry_date = entry_date;
        this.next_dose_date = next_dose_date;
        this.quantity_in_stock = quantity_in_stock;
        this.quantity_entered = quantity_entered;
        this.id_pet = id_pet;
    }

    public int getId_vaccine() {
        return id_vaccine;
    }

    public void setId_vaccine(int id_vaccine) {
        this.id_vaccine = id_vaccine;
    }

    public String getVaccine_type() {
        return vaccine_type;
    }

    public void setVaccine_type(String vaccine_type) {
        this.vaccine_type = vaccine_type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getAdministration_date() {
        return administration_date;
    }

    public void setAdministration_date(String administration_date) {
        this.administration_date = administration_date;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(String entry_date) {
        this.entry_date = entry_date;
    }

    public String getNext_dose_date() {
        return next_dose_date;
    }

    public void setNext_dose_date(String next_dose_date) {
        this.next_dose_date = next_dose_date;
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

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }
}
