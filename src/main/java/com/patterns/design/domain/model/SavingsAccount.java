package com.patterns.design.domain.model;

// FACTORY PRODUCT
public class SavingsAccount implements Account {

  public AccountType getType() {
    return AccountType.SAVINGS;
  }
}
