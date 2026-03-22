package com.patterns.design.domain.model;

// Factory Product
public class SavingsAccount implements Account {

  public AccountType getType() {
    return AccountType.SAVINGS;
  }
}
