package com.example.inventory.repository;

import com.example.inventory.entity.InventoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface InventoryDetailsRepository
        extends JpaRepository<InventoryDetails, Integer> {

    @Query("""
        SELECT d
        FROM InventoryDetails d
        WHERE d.inventory.purchase_dt
        BETWEEN :fromDate AND :toDate
    """)
    List<InventoryDetails> getInventoryDetails(
            @Param("fromDate") LocalDate fromDate,
            @Param("toDate") LocalDate toDate
    );
}