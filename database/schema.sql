CREATE DATABASE IF NOT EXISTS inventory_db;

USE inventory_db;

CREATE TABLE Inventory (
    id INT PRIMARY KEY,
    purchase_dt DATE NOT NULL,
    cost DECIMAL(10,2)
);

CREATE TABLE InventoryDetails (
    id INT PRIMARY KEY,
    inventory_id INT NOT NULL,
    inventory_details VARCHAR(255),
    FOREIGN KEY (inventory_id) REFERENCES Inventory(id)
);