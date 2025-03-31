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
    weight INT,
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
select * from Vaccines;

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
select * from Medical_consultations;
SELECT id_consultation, id_pet, id_owner, date_time, status_consul FROM medical_consultations WHERE id_veterinarian = 2;

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
    date_time varchar(250),
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

INSERT INTO Users (full_name, identification, address, phone, email, rol) VALUES
('Zully Ortiz' , '1092528097', 'Calle 13 Diocesano', '3223529100', 'zullyortiz@gmail.com', 'administrator'),
('Maria Lizarazo' , '109425986', 'Calle 5 Camilo Torres', '34424578555', 'maria@gmail.com', 'owner'),
('Luis Henao' , '1345334422', 'Calle 20 pinos', '4564378555', 'luorheber@gmail.com', 'veterinarian'),
 ('Yessica Perez', '123456566','123 Barrio Barco','234-567-2345', 'yessica@gmail.com', 'owner'),
 ('Luis Bermon', '8743534353','calle45 esperanza', '313-098-3456', 'luisbermon@gmail.com', 'administrator'),
 ('Zuleima Gomez', '123456789', '123 Admin St', '555-0101', 'zuleima@admin.com', 'veterinarian');

select * from Users;
SELECT * FROM Login WHERE username = 'zu0910';

INSERT INTO Login (username, pass, id_user) VALUES
('zu0910' , '091005', 1),
('maria123' , 'lol123', 2),
('luis10' , 'luor123', 3),
('yessi', 'yessi123', 4),
('lmiguel', 'lm123', 5),
('zule12', 'zule123', 6);

INSERT INTO Suppliers (full_name, identification, email, order_name, id_administrator) VALUES
('Pfizer', 123456, 'contact@pfizer.com', 'Medical Supplies', 1),
('Bayer', 654321, 'contact@bayer.com', 'Veterinary Equipment', 5);
 
 INSERT INTO Medications (nameMedication, typeMedication,manufacturer,quantity_in_stock,expiration_date ,quantity_entered,id_supplier) VALUES
 ('Paracetanol', 'Analgesic', 'Pfizer', 100, '2023-01-02', 100, 1),
 ('Amoxicillin', 'Antibiotic', 'Bayer', 200, '2024-06-15', 150, 2);
 
INSERT INTO Pets (fullName, species, breed, age, birth_date, gender, allergies, conditions, weight, microchip, photo, emergy_contact, id_owner) VALUES
('Max', 'Dog', 'Labrador', 3, '2020-01-01', 'male', NULL, NULL, 25.5, NULL, NULL, NULL, 2),
('Bella', 'Cat', 'Siamese', 2, '2021-05-15', 'female', 'None', 'Healthy', 4.2, '1234XYZ', NULL, 'Maria Lizarazo', 2),
('Max', 'Dog', 'Golden Retriever', 3, '2021-05-15', 'male', 'Pollen', 'None', 25.50, '123456789012345', 'max.jpg', '555-123-4567', 4),
('Luna', 'Cat', 'Siamese', 2, '2022-08-20', 'female', 'None', 'Asthma', 4.20, '987654321098765', 'luna.png', '555-987-6543', 2),
('Buddy', 'Dog', 'Labrador', 5, '2019-12-01', 'male', 'Chicken', 'Hip Dysplasia', 30.00, '112233445566778', 'buddy.jpeg', '555-111-2222', 4),
('Bella', 'Cat', 'Persian', 1, '2023-03-10', 'female', 'Dairy', 'None', 3.80, '887766554433221', 'bella.gif', '555-333-4444', 2),
('Rocky', 'Dog', 'German Shepherd', 4, '2020-07-25', 'male', 'Grass', 'None', 32.75, '665544332211998', 'rocky.webp', '555-555-6666', 2),
('Cleo', 'Cat', 'Maine Coon', 6, '2018-01-05', 'female', 'Seafood', 'Kidney Issues', 6.00, '223344556677889', 'cleo.svg', '555-777-8888', 4),
('Charlie', 'Dog', 'Beagle', 2, '2022-11-30', 'male', 'None', 'None', 12.30, '998877665544332', 'charlie.bmp', '555-999-0000', 2),
('Simba', 'Cat', 'Bengal', 3, '2021-04-12', 'male', 'Soy', 'None', 5.10, '776655443322119', 'simba.tiff', '555-222-3333', 2),
('Daisy', 'Dog', 'Poodle', 7, '2017-09-18', 'female', 'Beef', 'Arthritis', 8.90, '554433221199887', 'daisy.heic', '555-444-5555', 4),
('Oliver', 'Cat', 'Sphynx', 1, '2023-06-02', 'male', 'Dust', 'Sensitive Skin', 3.50, '332211998877665', 'oliver.raw', '555-666-7777', 2);
 
INSERT INTO Vaccines (vaccine_type, manufacturer, lot, administration_date, expiration_date, entry_date, next_dose_date, quantity_in_stock, quantity_entered, id_pet) VALUES
('Rabies', 'Merck', 'LOT123', '2023-01-01', '2023-12-01', '2023-01-01', '2024-01-01', 50, 50, 1),
('Feline Distemper', 'Bayer', 'LOT456', '2023-03-10', '2024-03-10', '2023-03-10', '2024-03-10', 30, 30, 2);
 
INSERT INTO Medical_consultations (date_time, id_veterinarian, id_pet, id_owner, reason, diagnosis, recommendations, prescription, required_precedures, status_consul) VALUES
('2023-10-01 10:00:00', 1, 1, 2, 'Checkup', 'Healthy', 'Annual checkup recommended', NULL, NULL, 'completed'),
('2023-11-15 15:30:00', 2, 2, 2, 'Coughing and sneezing', 'Mild respiratory infection', 'Rest and hydration', 'Amoxicillin 5ml/day', NULL, 'in_progress');
 
INSERT INTO Surgeries (id_consultation, surgery_type, supplies_used, recovery_time, follow_up, preparatory_info) VALUES
(1, 'Spaying', 'Anesthesia, sutures', '7 days', 'Check wound daily', 'No food 12 hours before'),
(2, 'Dental Cleaning', 'Anesthesia, dental scaler', '1 day', 'Soft food for 2 days', 'No solid food 8 hours before');

INSERT INTO Supplies (nameSupply, quantity_in_stock, quantity_entered, expiration_date, id_supplier) VALUES
('Syringes', 500, 500, '2025-01-01', 1),
('Gauze Pads', 300, 300, '2024-12-31', 2);

INSERT INTO Additional_Services (id_pet, service_type, descriptionServices, date_time) VALUES
(1, 'bathing', 'Full grooming service', '2023-11-20 14:00:00'),
(2, 'training', 'Basic obedience training', '2023-12-01 10:00:00');

INSERT INTO Surgeries (id_consultation, surgery_type, supplies_used, recovery_time, follow_up, preparatory_info) VALUES
(1, 'Appendectomy', 'Scalpel, Sutures, Surgical gloves', '1-2 semanas', 'Control postoperatorio a los 7 días', 'Ayuno 8 horas antes de la cirugía, análisis de sangre previos'),
(2, 'Cesárea', 'Bisturí, Suturas, Gasas, Guantes quirúrgicos', '6-8 semanas', 'Consulta postoperatoria a los 15 días', 'Ayuno 12 horas antes, análisis médicos previos');
