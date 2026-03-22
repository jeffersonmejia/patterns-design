#!/usr/bin/env bash

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

while true; do
    echo "1. Run"
    echo "2. Commit"
    echo "3. Exit"
    read -p "Select option: " choice

    case $choice in
        1)
            echo "Running project..."
            mvn clean compile exec:java -Dexec.mainClass="com.patterns.design.presentation.PatternsDesign"
            ;;
        2)
            echo "Running commit script..."
            "$SCRIPT_DIR/tools/git/commit.sh"
            ;;
        3)
            echo "Exiting."
            exit 0
            ;;
        *)
            echo "Invalid option, try again."
            ;;
    esac
done