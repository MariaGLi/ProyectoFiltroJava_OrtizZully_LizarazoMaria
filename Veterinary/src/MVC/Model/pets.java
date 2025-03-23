package MVC.Model;

public class pets {
    private int id_pet;
    private String fullName;
    private String species;
    private String breed;
    private int age;
    private String birth_date;
    private String gender;
    private String allergies;
    private String conditions;
    private Float weight;
    private String microchip;
    private String photo;
    private String emergy_contact;
    private int id_owner;

    public pets() {
    }

    public pets(int id_pet, String fullName, String species, String breed, int age, String birth_date, String gender, String allergies, String conditions, Float weight, String microchip, String photo, String emergy_contact, int id_owner) {
        this.id_pet = id_pet;
        this.fullName = fullName;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.birth_date = birth_date;
        this.gender = gender;
        this.allergies = allergies;
        this.conditions = conditions;
        this.weight = weight;
        this.microchip = microchip;
        this.photo = photo;
        this.emergy_contact = emergy_contact;
        this.id_owner = id_owner;
    }

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmergy_contact() {
        return emergy_contact;
    }

    public void setEmergy_contact(String emergy_contact) {
        this.emergy_contact = emergy_contact;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }
}
