package com.example.inventory.service;

import com.example.inventory.entity.InventoryDetails;
import com.example.inventory.repository.InventoryDetailsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InventoryService {

    private final InventoryDetailsRepository repository;

    public InventoryService(InventoryDetailsRepository repository) {
        this.repository = repository;
    }

    public List<InventoryDetails> getInventoryDetails(
            LocalDate fromDate,
            LocalDate toDate) {

        if (fromDate.isAfter(toDate)) {
            throw new IllegalArgumentException(
                    "fromDate cannot be after toDate"
            );
        }

        return repository.getInventoryDetails(fromDate, toDate);
    }
}