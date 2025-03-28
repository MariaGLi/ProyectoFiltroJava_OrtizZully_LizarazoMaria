package MVC.Model;

public class suppliers {
    private int id_supplier;
    private String full_name;
    private String identification;
    private String email;
    private String order_name;
    private int id_administrator;

    public suppliers() {
    }

    public suppliers(int id_supplier, String full_name, String identification, String email, String order_name, int id_administrator) {
        this.id_supplier = id_supplier;
        this.full_name = full_name;
        this.identification = identification;
        this.email = email;
        this.order_name = order_name;
        this.id_administrator = id_administrator;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public int getId_administrator() {
        return id_administrator;
    }

    public void setId_administrator(int id_administrator) {
        this.id_administrator = id_administrator;
    }
    
}
