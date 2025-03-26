DROP DATABASE IF EXISTS Veterinary;
CREATE DATABASE Veterinary;

USE Veterinary;

CREATE TABLE Users(
	id_user INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    identification VARCHAR(20) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL,
    rol ENUM('owner','administrator','veterinarian') NOT NULL
);

CREATE TABLE Login(
	id_login INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    pass VARCHAR(255) NOT NULL,
    id_user INT NOT NULL,
    FOREIGN KEY (id_user) REFERENCES Users (id_user) ON DELETE CASCADE
);

CREATE TABLE Pets (
	id_pet INT AUTO_INCREMENT PRIMARY KEY,
    fullName VARCHAR(255),
    species VARCHAR(255),
    breed VARCHAR(255),
    age INT,
    birth_date DATE,
    gender ENUM('male','female'),
    allergies TEXT,
    conditions TEXT,
    weight DECIMAL(5,2),
    microchip VARCHAR(255),
    photo VARCHAR(255),
    emergy_contact VARCHAR(255),
    id_owner INT,
    FOREIGN KEY (id_owner) REFERENCES Users (id_user)
);

CREATE TABLE Vaccines (
	id_vaccine INT AUTO_INCREMENT PRIMARY KEY,
    vaccine_type VARCHAR(255),
    manufacturer VARCHAR(255),
    lot VARCHAR(255),
    administration_date DATE,
    expiration_date DATE,
    entry_date DATE,
    next_dose_date DATE,
    quantity_in_stock INT,
    quantity_entered INT,
    id_pet INT,
    FOREIGN KEY (id_pet) REFERENCES Pets (id_pet)
);

CREATE TABLE Medical_consultations (
	id_consultation INT AUTO_INCREMENT PRIMARY KEY,
    date_time DATETIME,
    id_veterinarian INT,
    id_pet INT,
    id_owner INT,
    reason TEXT,
    diagnosis TEXT,
    recommendations TEXT,
    prescription TEXT,
    required_precedures TEXT,
    status_consul ENUM('scheduled','in_progress','completed', 'canceled' ),
    FOREIGN KEY (id_pet) REFERENCES Pets (id_pet),
    FOREIGN KEY (id_owner) REFERENCES Users (id_user),
    FOREIGN KEY (id_veterinarian) REFERENCES Users (id_user)
);

CREATE TABLE Surgeries (
	id_surgery INT AUTO_INCREMENT PRIMARY KEY,
    id_consultation INT,
    surgery_type VARCHAR(250),
    supplies_used TEXT,
    recovery_time VARCHAR(250),
    follow_up TEXT,
    preparatory_info TEXT,
    FOREIGN KEY (id_consultation) REFERENCES Medical_consultations(id_consultation)
);

CREATE TABLE Suppliers(
	id_supplier INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255),
    identification INT(20),
    email VARCHAR(255),
    order_name VARCHAR(255),
    id_administrator INT,
    FOREIGN KEY (id_administrator) REFERENCES Users (id_user)
);

CREATE TABLE Medications(
	id_medication INT AUTO_INCREMENT PRIMARY KEY,
    nameMedication VARCHAR(250),
    typeMedication VARCHAR(250),
    manufacturer VARCHAR(250),
    quantity_in_stock INT,
    expiration_date DATE,
    quantity_entered INT,
    id_supplier INT,
    FOREIGN KEY (id_supplier) REFERENCES Suppliers(id_supplier)
);

CREATE TABLE Supplies(
	id_supply INT AUTO_INCREMENT PRIMARY KEY,
    nameSupply VARCHAR(250),
    quantity_in_stock INT,
    quantity_entered INT,
    expiration_date DATE,
    id_supplier INT,
    FOREIGN KEY (id_supplier) REFERENCES Suppliers(id_supplier)
);

CREATE TABLE Additional_Services(
	id_service INT AUTO_INCREMENT PRIMARY KEY,
    id_pet INT,
    service_type ENUM('bathing','daycare','training'),
    descriptionServices TEXT,
    date_time DATETIME,
    FOREIGN KEY (id_pet) REFERENCES Pets (id_pet)
);

CREATE TABLE Billing (
	id_bill INT AUTO_INCREMENT PRIMARY KEY,
    id_veterinarian INT,
    id_owner INT,
    issue_date DATETIME,
    description VARCHAR(250),
    quantity INT,
    unit_value DECIMAL(10,2),
    subtotal DECIMAL(10,2),
    tax DECIMAL(10,2),
    total DECIMAL(10,2),
    cufe VARCHAR(250),
    qr_code VARCHAR(250),
    statusBill ENUM('pending','paid','canceled'),
    FOREIGN KEY (id_owner) REFERENCES Users (id_user),
    FOREIGN KEY (id_veterinarian) REFERENCES Users (id_user)
);


INSERT INTO Pets (fullName, species, breed, age, birth_date, gender, allergies, conditions, weight, microchip, photo, emergy_contact, id_owner) VALUES
('Max', 'Dog', 'Golden Retriever', 3, '2021-05-15', 'male', 'Pollen', 'None', 25.50, '123456789012345', 'max.jpg', '555-123-4567', 1),
('Luna', 'Cat', 'Siamese', 2, '2022-08-20', 'female', 'None', 'Asthma', 4.20, '987654321098765', 'luna.png', '555-987-6543', 2),
('Buddy', 'Dog', 'Labrador', 5, '2019-12-01', 'male', 'Chicken', 'Hip Dysplasia', 30.00, '112233445566778', 'buddy.jpeg', '555-111-2222', 3),
('Bella', 'Cat', 'Persian', 1, '2023-03-10', 'female', 'Dairy', 'None', 3.80, '887766554433221', 'bella.gif', '555-333-4444', 1),
('Rocky', 'Dog', 'German Shepherd', 4, '2020-07-25', 'male', 'Grass', 'None', 32.75, '665544332211998', 'rocky.webp', '555-555-6666', 2),
('Cleo', 'Cat', 'Maine Coon', 6, '2018-01-05', 'female', 'Seafood', 'Kidney Issues', 6.00, '223344556677889', 'cleo.svg', '555-777-8888', 3),
('Charlie', 'Dog', 'Beagle', 2, '2022-11-30', 'male', 'None', 'None', 12.30, '998877665544332', 'charlie.bmp', '555-999-0000', 1),
('Simba', 'Cat', 'Bengal', 3, '2021-04-12', 'male', 'Soy', 'None', 5.10, '776655443322119', 'simba.tiff', '555-222-3333', 2),
('Daisy', 'Dog', 'Poodle', 7, '2017-09-18', 'female', 'Beef', 'Arthritis', 8.90, '554433221199887', 'daisy.heic', '555-444-5555', 3),
('Oliver', 'Cat', 'Sphynx', 1, '2023-06-02', 'male', 'Dust', 'Sensitive Skin', 3.50, '332211998877665', 'oliver.raw', '555-666-7777', 1);


INSERT INTO Users (full_name, identification, address, phone, email, rol) VALUES
('Ana García', '123456789', 'Calle Principal 123', '555-111-2222', 'ana.garcia@email.com', 'owner'),
('Juan Rodríguez', '789123456', 'Transversal Norte 101', '555-777-8888', 'juan.rodriguez@email.com', 'owner'),
('Isabella Torres', '159357468', 'Callejón Oeste 404', '555-444-5555', 'isabella.torres@email.com', 'owner'),
('Mateo Castro', '975318642', 'Bulevar Sur 707', '555-123-7890', 'mateo.castro@email.com', 'owner');