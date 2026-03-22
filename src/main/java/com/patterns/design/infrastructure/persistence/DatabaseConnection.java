package com.patterns.design.infrastructure.persistence;

// SINGLETON PATTERN
public class DatabaseConnection {

  private static DatabaseConnection instance;

  private DatabaseConnection() {
  }

  public static synchronized DatabaseConnection getInstance() {
    if (instance == null) {
      instance = new DatabaseConnection();
    }
    return instance;
  }

  public String connect() {
    return "Connected";
  }
}
