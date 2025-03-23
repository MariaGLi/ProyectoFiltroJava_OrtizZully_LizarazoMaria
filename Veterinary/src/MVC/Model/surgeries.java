package MVC.Model;

public class surgeries {
    private int id_surgery;
    private int id_consultation;
    private String surgery_type;
    private String supplies_used;
    private String recovery_time;
    private String follow_up;
    private String preparatory_info;

    public surgeries() {
    }

    public surgeries(int id_surgery, int id_consultation, String surgery_type, String supplies_used, String recovery_time, String follow_up, String preparatory_info) {
        this.id_surgery = id_surgery;
        this.id_consultation = id_consultation;
        this.surgery_type = surgery_type;
        this.supplies_used = supplies_used;
        this.recovery_time = recovery_time;
        this.follow_up = follow_up;
        this.preparatory_info = preparatory_info;
    }

    public int getId_surgery() {
        return id_surgery;
    }

    public void setId_surgery(int id_surgery) {
        this.id_surgery = id_surgery;
    }

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public String getSurgery_type() {
        return surgery_type;
    }

    public void setSurgery_type(String surgery_type) {
        this.surgery_type = surgery_type;
    }

    public String getSupplies_used() {
        return supplies_used;
    }

    public void setSupplies_used(String supplies_used) {
        this.supplies_used = supplies_used;
    }

    public String getRecovery_time() {
        return recovery_time;
    }

    public void setRecovery_time(String recovery_time) {
        this.recovery_time = recovery_time;
    }

    public String getFollow_up() {
        return follow_up;
    }

    public void setFollow_up(String follow_up) {
        this.follow_up = follow_up;
    }

    public String getPreparatory_info() {
        return preparatory_info;
    }

    public void setPreparatory_info(String preparatory_info) {
        this.preparatory_info = preparatory_info;
    }
}
