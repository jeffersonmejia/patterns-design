package com.patterns.design.domain.model;

// BUILDER PATTERN
public class Transaction {

  private final String id;
  private final double amount;
  private final AccountType type;

  private Transaction(Builder builder) {
    this.id = builder.id;
    this.amount = builder.amount;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }

  public AccountType getType() {
    return type;
  }

  public static class Builder {

    private String id;
    private double amount;
    private AccountType type;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder amount(double amount) {
      this.amount = amount;
      return this;
    }

    public Builder type(AccountType type) {
      this.type = type;
      return this;
    }

    public Transaction build() {
      if (id == null || type == null) {
        throw new IllegalStateException();
      }
      return new Transaction(this);
    }
  }
}
