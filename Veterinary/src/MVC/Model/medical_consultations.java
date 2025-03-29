package MVC.Model;


public class medical_consultations {
    private int id_consultation;
    private String date_time;
    private int id_veterinarian;
    private int id_pet;
    private int id_owner;
    private String reason;
    private String diagnosis;
    private String recommendations;
    private String prescription;
    private String required_precedures;
    private String status_consul;

    public medical_consultations() {
    }

    public medical_consultations(int id_consultation, String date_time, int id_veterinarian, int id_pet, int id_owner, String reason, String diagnosis, String recommendations, String prescription, String required_precedures, String status_consul) {
        this.id_consultation = id_consultation;
        this.date_time = date_time;
        this.id_veterinarian = id_veterinarian;
        this.id_pet = id_pet;
        this.id_owner = id_owner;
        this.reason = reason;
        this.diagnosis = diagnosis;
        this.recommendations = recommendations;
        this.prescription = prescription;
        this.required_precedures = required_precedures;
        this.status_consul = status_consul;
    }

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getId_veterinarian() {
        return id_veterinarian;
    }

    public void setId_veterinarian(int id_veterinarian) {
        this.id_veterinarian = id_veterinarian;
    }

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getRequired_precedures() {
        return required_precedures;
    }

    public void setRequired_precedures(String required_precedures) {
        this.required_precedures = required_precedures;
    }

    public String getStatus_consul() {
        return status_consul;
    }

    public void setStatus_consul(String status_consul) {
        this.status_consul = status_consul;
    }

    

    

    
}
