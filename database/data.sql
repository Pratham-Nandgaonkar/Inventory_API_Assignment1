USE inventory_db;

INSERT INTO Inventory (id, purchase_dt, cost)
VALUES
(1, '2026-01-10', 50000.00),
(2, '2026-04-15', 75000.00),
(3, '2026-08-20', 30000.00),
(4, '2027-01-20', 90000.00);

INSERT INTO InventoryDetails (id, inventory_id, inventory_details)
VALUES
(1, 1, 'Laptop inventory'),
(2, 2, 'Server inventory'),
(3, 3, 'Networking equipment'),
(4, 4, 'Storage equipment');