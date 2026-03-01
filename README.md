## ScrabbleSolver

A simple Java console application that generates all possible dictionary words that can be formed from a given pool of letters.

This project demonstrates:

File handling (BufferedReader, FileReader)

HashMap usage

Character frequency counting

String manipulation

Basic algorithmic problem solving

## How It Works

The user enters a pool of letters

The program:

Counts the frequency of each letter

Reads words from a dictionary file (dic.txt)

Checks if each word can be formed using the given letters

If possible → the word is printed

## Example
## Input:
Enter a pool of letters: tca

## Output:
cat
act
at

## Core Logic

The main idea is character frequency matching.

Count letters in user input

Count letters in each dictionary word

Compare frequencies

If dictionary word frequency ≤ input frequency → valid word

## Important Note

Make sure your dictionary file exists at:

src/dic.txt

Each word should be on a new line.

Example:

cat
act
dog
tac



