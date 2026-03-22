package com.patterns.design.domain.factory;

import com.patterns.design.domain.model.*;

// Factory Pattern
public class AccountFactory {

  public static Account create(AccountType type) {
    return switch (type) {
      case SAVINGS ->
        new SavingsAccount();
      case CHECKING ->
        new CheckingAccount();
    };
  }
}
