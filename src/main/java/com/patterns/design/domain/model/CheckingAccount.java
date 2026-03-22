package com.patterns.design.domain.model;

// FACTORY PRODUCT
public class CheckingAccount implements Account {

  public AccountType getType() {
    return AccountType.CHECKING;
  }
}
