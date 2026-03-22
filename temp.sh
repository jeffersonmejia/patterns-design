#!/bin/bash

BASE_DIR="src/main/java/com/patterns/design"

mkdir -p $BASE_DIR/domain/model
mkdir -p $BASE_DIR/domain/factory

mkdir -p $BASE_DIR/application/service

mkdir -p $BASE_DIR/infrastructure/persistence

mkdir -p $BASE_DIR/presentation

touch $BASE_DIR/domain/model/Account.java
touch $BASE_DIR/domain/model/AccountType.java
touch $BASE_DIR/domain/model/SavingsAccount.java
touch $BASE_DIR/domain/model/CheckingAccount.java
touch $BASE_DIR/domain/model/Transaction.java

touch $BASE_DIR/domain/factory/AccountFactory.java

touch $BASE_DIR/application/service/AccountService.java

touch $BASE_DIR/infrastructure/persistence/DatabaseConnection.java

touch $BASE_DIR/presentation/PatternsDesign.java

echo "Structure created successfully."