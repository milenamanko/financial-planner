package com.myla.financialplanner.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class MonthlyBudget {

    private Long id;
    private Long userId;
    private List<Expense> expenseList;
}
