# Rock Paper Scissors

A Java console game where the player competes against a randomly generated computer choice. The program validates the player's selection, compares the moves, and displays the outcome.

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

## Implementation Details

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

## How to Run

Requires a Java Development Kit (JDK), with `java` and `javac` available in your terminal. No external libraries are required.

From the directory containing `RockPaperScissors.java`, compile and run:

```sh
javac -d out RockPaperScissors.java
java -cp out day4.RockPaperScissors
```

The run command uses the package declared in the source file. Enter `0`, `1`, or `2` when prompted and press Enter. Run the program again to play another round.

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
