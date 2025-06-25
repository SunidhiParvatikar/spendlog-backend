package com.scanpay.expense;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// This tells Spring it's a REST controller
@RestController

// All endpoints will start with this
@RequestMapping("/api/expenses")

// Allow frontend running on localhost:3000 to access this
@CrossOrigin(origins = "http://localhost:3000")
public class ExpenseController {

    // A simple in-memory list to store all expenses
    private List<Map<String, String>> expenseList = new ArrayList<>();

    // Add an expense (POST request)
    @PostMapping
    public Map<String, String> addExpense(@RequestBody Map<String, String> expense) {
        expenseList.add(expense);  // Add to the list
        return expense;            // Return the added expense
    }

    // Get all expenses (GET request)
    @GetMapping
    public List<Map<String, String>> getAllExpenses() {
        return expenseList;
    }
}
