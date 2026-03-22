package com.patterns.design.domain.model;

// Factory Product
public class CheckingAccount implements Account {

  public AccountType getType() {
    return AccountType.CHECKING;
  }
}
