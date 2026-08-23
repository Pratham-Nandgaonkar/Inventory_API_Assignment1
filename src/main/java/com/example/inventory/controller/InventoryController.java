package com.example.inventory.controller;

import com.example.inventory.entity.InventoryDetails;
import com.example.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping("/details")
    public List<InventoryDetails> getInventoryDetails(
            @RequestParam LocalDate fromDate,
            @RequestParam LocalDate toDate) {

        return service.getInventoryDetails(fromDate, toDate);
    }
}