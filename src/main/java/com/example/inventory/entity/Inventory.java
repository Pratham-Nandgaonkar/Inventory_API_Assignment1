package com.example.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Inventory")
public class Inventory {

    @Id
    private int id;

    private LocalDate purchase_dt;

    private double cost;

    public Inventory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getPurchase_dt() {
        return purchase_dt;
    }

    public void setPurchase_dt(LocalDate purchase_dt) {
        this.purchase_dt = purchase_dt;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}