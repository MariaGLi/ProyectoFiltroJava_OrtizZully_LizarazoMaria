package modelo;

public class additional_services {
    private int id_service;
    private int id_pet;
    private String service_type;
    private String descriptionServices;
    private String date_time;

    public additional_services() {
    }

    public additional_services(int id_service, int id_pet, String service_type, String descriptionServices, String date_time) {
        this.id_service = id_service;
        this.id_pet = id_pet;
        this.service_type = service_type;
        this.descriptionServices = descriptionServices;
        this.date_time = date_time;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getDescriptionServices() {
        return descriptionServices;
    }

    public void setDescriptionServices(String descriptionServices) {
        this.descriptionServices = descriptionServices;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
}
