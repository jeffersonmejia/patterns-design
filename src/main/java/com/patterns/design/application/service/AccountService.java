package com.patterns.design.application.service;

import com.patterns.design.domain.factory.AccountFactory;
import com.patterns.design.domain.model.*;

public class AccountService {

  public Account createAccount(AccountType type) {
    return AccountFactory.create(type);
  }

  public Transaction createTransaction(String id, double amount, AccountType type) {
    return new Transaction.Builder()
            .id(id)
            .amount(amount)
            .type(type)
            .build();
  }
}
