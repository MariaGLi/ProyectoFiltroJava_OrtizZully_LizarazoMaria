package MVC.Model;

public class suppliers {
    private int id_supplier;
    private String full_name;
    private int identification;
    private String email;
    private String order_name;

    public suppliers() {
    }

    public suppliers(int id_supplier, String full_name, int identification, String email, String order_name) {
        this.id_supplier = id_supplier;
        this.full_name = full_name;
        this.identification = identification;
        this.email = email;
        this.order_name = order_name;
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

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
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
}
