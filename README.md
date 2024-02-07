# Brain Games

## Description

Brain Games is a console application developed in Java, designed to test and improve your math and logic skills through a series of interactive mini-games. 
Each game presents a unique challenge, requiring correct answers to proceed. The application leverages Java's static methods and classes for a streamlined user experience.

## Getting Started

Before you begin, ensure the Java Development Kit (JDK) and Gradle are installed on your system.

To obtain the project, clone it from the repository:

_git clone [https://github.com/artemevpaul/java-project-61.git]_


## Compiling and Building the Application

To compile and build the application, navigate to the project directory and use the Gradle task `run` or by using the following command:

_./gradlew run_


On Windows, you might need to use:

_gradlew.bat run_

This command compiles the Java source files, builds the project, and runs the application, bringing up the game selection menu.

## Running the Built Application

If the project has already been built, you can quickly start the application using the following Makefile command:

_make run-dist_

This command is designed for convenience, allowing for rapid launching of the built application without recompiling.



## Games Overview

Brain Games includes several engaging mini-games:

- **Calculator** (`Calc`): Solve arithmetic problems. ([link](https://asciinema.org/a/uOVohgRJBdFD3bkJbP0E4TcMn))
- **Even or Odd** (`Even`): Guess if a number is even or odd. ([link](https://asciinema.org/a/yFE0hDTG7epP39jg68BZkQEiW))
- **Greatest Common Divisor** (`GCD`): Find the greatest common divisor of two numbers. ([link](https://asciinema.org/a/vOjQIJ4aD7Sd6b5Ucj5LyvhrH))
- **Arithmetic Progression** (`Progression`): Determine the missing number in a sequence. ([link](https://asciinema.org/a/91zmDPptHmu4bjWYQWdETcQej))
- **Prime Number** (`Prime`): Identify whether a number is prime. ([link](https://asciinema.org/a/r7fNcKgCk8dXTgnsdBws5NZJr))


Choose a game by entering its number when prompted by the menu. To exit, enter `0`.

## Contributions

I welcome contributions to Brain Games. To contribute, fork the repository, create a feature branch for your changes, and submit a pull request for review.



### Hexlet tests and linter status:
[![Actions Status](https://github.com/artemevpaul/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/artemevpaul/java-project-61/actions)

<a href="https://codeclimate.com/github/artemevpaul/java-project-61/maintainability"><img src="https://api.codeclimate.com/v1/badges/a8e46f60c7078ba9f7ff/maintainability" /></a>

