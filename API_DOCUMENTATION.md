# Inventory Details API Documentation

## 1. Overview

The Inventory Details API is a Spring Boot REST API that retrieves inventory details based on a specified purchase date range.

The API uses two database tables:

- `Inventory`
- `InventoryDetails`

The `InventoryDetails` table is linked to the `Inventory` table using `inventory_id`.

---

## 2. API Endpoint

### Get Inventory Details

**Method:** `GET`

**Endpoint:**

```text
/api/inventory/details