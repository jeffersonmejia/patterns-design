package com.patterns.design.presentation;

import com.patterns.design.application.service.*;
import com.patterns.design.domain.model.*;
import com.patterns.design.infrastructure.persistence.*;

public class PatternsDesign {

  public static void main(String[] args) {

    DatabaseConnection db = DatabaseConnection.getInstance();
    System.out.println(db.connect());

    AccountService service = new AccountService();

    Account acc = service.createAccount(AccountType.SAVINGS);

    Transaction tx = service.createTransaction("T1", 200.0, AccountType.SAVINGS);

    System.out.println(acc.getType());
    System.out.println(tx.getAmount());
  }
}
