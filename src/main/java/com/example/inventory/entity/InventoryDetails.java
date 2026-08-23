package com.example.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "InventoryDetails", schema = "inventory_db")
public class InventoryDetails {

    @Id
    private int id;

    private String inventory_details;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    public InventoryDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInventory_details() {
        return inventory_details;
    }

    public void setInventory_details(String inventory_details) {
        this.inventory_details = inventory_details;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}