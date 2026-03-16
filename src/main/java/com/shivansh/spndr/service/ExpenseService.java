package com.shivansh.spndr.controller;

import com.shivansh.spndr.dto.ExpenseRequest;
import com.shivansh.spndr.dto.ExpenseResponse;
import com.shivansh.spndr.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/{userId}")
    public ExpenseResponse addExpense(@PathVariable Long userId, @RequestBody ExpenseRequest request) {
        return expenseService.addExpense(userId, request);
    }

    @GetMapping("/{userId}")
    public List<ExpenseResponse> getUserExpenses(@PathVariable Long userId) {
        return expenseService.getUserExpenses(userId);
    }

    @DeleteMapping("/{expenseId}")
    public void deleteExpense(@PathVariable Long expenseId) {
        expenseService.deleteExpense(expenseId);
    }
}