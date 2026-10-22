# Rock Paper Scissors

A Java console game created as a Day 4 exercise for a QA Automation Bootcamp. The player selects rock, paper, or scissors, and the computer makes a random choice. The program compares the choices and displays the outcome.

## How to Play

Enter one of the following whole numbers when prompted:

| Input | Choice |
| --- | --- |
| 0 | Rock |
| 1 | Paper |
| 2 | Scissors |

Rock beats scissors, paper beats rock, and scissors beats paper. Matching choices produce a draw.

The program displays one of these results:

```text
Draw
```

```text
You win!
```

```text
Computer wins :c
```

## Features

- Reads the player's choice using `Scanner`.
- Rejects integer choices outside the range of 0 through 2.
- Generates a random computer choice using `Random`.
- Determines a draw, player win, or computer win.
- Plays one round per run.

## Java Concepts Practiced

- Imports and standard Java classes: `Scanner` and `Random`.
- Variables and the `int` data type.
- User input with `nextInt()`.
- Random number generation with `new Random().nextInt(3)`.
- Comparison operators: `<`, `>`, and `==`.
- Logical operators: `&&` and `||`.
- Conditional statements: `if`, `else if`, and `else`.
- An early `return` from `main` when the menu choice is invalid.
- Console output and closing the scanner.

`nextInt(3)` generates 0, 1, or 2. The upper bound, 3, is excluded.

## How to Run in Eclipse

You need a Java Development Kit (JDK) configured in Eclipse IDE for Java Developers. No external libraries are required.

1. Open your Java project in Eclipse.
2. Create a package named `day4` under the source folder if it does not already exist.
3. Save the source code in that package as `RockPaperScissors.java`. The file must begin with `package day4;`.
4. Right-click `RockPaperScissors.java` and select **Run As > Java Application**.
5. Enter `0`, `1`, or `2` in the Console and press Enter.
6. Read the outcome. Run the program again to play another round.

## Example Round

```text
Welcome to the Rock Paper Scissors game!
Enter your choice
0. Rock, 1. Paper, 2. Scissors
0
You win!
```

This example occurs when the player chooses rock and the computer randomly chooses scissors. The current program displays the outcome without revealing the computer's choice, so the result can vary between runs.

## Expected Outcomes

The following table describes the game's decision logic. It is a reference for checking the code, not a record of executed tests. The computer's choice is random during normal play.

| Player choice | Computer: Rock (0) | Computer: Paper (1) | Computer: Scissors (2) |
| --- | --- | --- | --- |
| Rock (0) | Draw | Computer wins | Player wins |
| Paper (1) | Player wins | Draw | Computer wins |
| Scissors (2) | Computer wins | Player wins | Draw |

Entering an integer such as `-1` or `3` displays:

```text
Invalid Choice. Please run the game again and enter 0, 1, or 2
```

The program then closes the scanner and exits before generating a computer choice.

## Current Limitations

- Does not include a replay loop or score tracking.
- Does not display the computer's selected move.
- Expects an integer. Text or decimal input causes an input mismatch exception rather than the custom invalid-choice message.
