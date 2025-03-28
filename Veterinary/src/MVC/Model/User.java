package MVC.Model;

public class User {
    private int id_user;
    private String full_name;
    private String identification;
    private String addres;
    private String phone;
    private String email;
    private String role;

    public User() {
    }

    public User(int id_user, String full_name, String identification, String addres, String phone, String email, String role) {
        this.id_user = id_user;
        this.full_name = full_name;
        this.identification = identification;
        this.addres = addres;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
