package com.myla.financialplanner.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
public class Expense {

    private Long id;
    private Long monthlyBudgetId;
    private String name;
    private BigDecimal amount;
}
