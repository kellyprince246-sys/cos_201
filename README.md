COS 201 - Assignment KELLY-ATINSE PRINCE 25/17921
Three small console programs written in Java.

| File | What it does |
|------|--------------|
| `SimpleCalculator.java` | Takes two numbers and an operator (`+ - * /`) and prints the result. |
| `AverageCalculator.java` | Takes a count of numbers, reads them, and prints the sum and average. |
| `ItemCost.java` | Takes an item name, unit price and quantity, and prints the total cost. |

## Requirements

- Java Development Kit (JDK) 8 or later
- Check your installation with: `javac -version`

## How to compile

Open a terminal in the project folder and run:

```
javac SimpleCalculator.java AverageCalculator.java ItemCost.java
```

This creates a `.class` file for each program.

## How to run

```
java SimpleCalculator
java AverageCalculator
java ItemCost
```

## Sample runs

**SimpleCalculator**
```
Enter the first number: 12
Enter an operator (+, -, *, /): *
Enter the second number: 3
12.0 * 3.0 = 36.0
```

**AverageCalculator**
```
How many numbers do you want to average? 3
Enter number 1: 70
Enter number 2: 80
Enter number 3: 90
Sum     = 240.0
Average = 80.0
```

**ItemCost**
```
Enter the item name: Notebook
Enter the unit price: 250.5
Enter the quantity: 4

Item:       Notebook
Unit price: 250.5
Quantity:   4
Total cost: 1002.0
```