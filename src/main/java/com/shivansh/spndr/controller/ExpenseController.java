package com.shivansh.spndr.controller;

import com.shivansh.spndr.dto.ExpenseRequest;
import com.shivansh.spndr.dto.ExpenseResponse;
import com.shivansh.spndr.service.ExpenseService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://spndr-tracker.netlify.app")
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/{userId}")
    public List<ExpenseResponse> getExpenses(@PathVariable Long userId) {
        return expenseService.getExpensesByUser(userId);
    }

    @PostMapping("/{userId}")
    public ExpenseResponse addExpense(
            @PathVariable Long userId,
            @RequestBody ExpenseRequest request) {

        return expenseService.addExpense(userId, request);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }
}