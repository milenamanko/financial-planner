package com.myla.financialplanner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private List<MonthlyBudget> budgetList;
}
