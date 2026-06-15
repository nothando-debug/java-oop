# java-oop
Practicing pure Java OOP principles

## Bank Account
- Fields: balance (double), accountNumber (String) — both private
- Constructor sets both fields
- Getter for balance only — no setter
- Methods: deposit(double amount), withdraw(double amount)
- Withdraw must reject negative balance — throw an IllegalArgumentException
- Write a main() that creates an account and exercises all methods

## Person
- Fields: balance (double), accountNumber (String) — both private
- Constructor sets both fields
- Getter for balance only — no setter
- Methods: deposit(double amount), withdraw(double amount)
- Withdraw must reject negative balance — throw an IllegalArgumentException
- Write a main() that creates an account and exercises all methods


## Temperature Sensor
- Fields: readings (ArrayList<Double>), unit (String: "C" or "F") — private
- addReading(double temp) — stores it
- getAverage() — returns the average of all readings
- getReadings() — returns an unmodifiable copy of the list (not the original)
- Why return a copy? Write a comment explaining it

## Inventory Item
- Fields: name, quantity (int), pricePerUnit (double), lowStockThreshold (int)
- No public setters for quantity — only restock(int units) and sell(int units)
-sell() must throw if units > quantity
- isLowStock() returns true if quantity ≤ threshold
- getTotalValue() returns quantity × pricePerUnit
- Write a JUnit test class with at least 3 test methods

## SafeUserProfile
- Fields: username, email, passwordHash (all private Strings), loginAttempts (int), locked (boolean)
- No getter for passwordHash — ever
- verifyPassword(String input) — hashes input and compares (use input.hashCode() + "" for simplicity)
- After 3 failed attempts, set locked = true; further attempts throw AccountLockedException (custom exception)
- resetLock() only works if called with a valid "admin token" string
- Write a UML class diagram comment block at the top of the file