# DiceJack
This is Dice Game.

- To complete the game the user need to pick three numbers between 1 to 6, as dice have numbers 1 to 6.
- The user need to roll the dice three times.

# Condition to win the game:
- The sum of dice roll is smaller than the sum of the number you choise.
- And the difference betweeb the sumOfnumbers and sumOfDiceRoll is less than 3.
if both condtion are fullfilled, you will win. Otherwise you will lose.

## Code overview

```
double randomNumber = Math.random() * 6; 
randomNumber +=1;
return (int)randomNumber;
```
random() function generates numbers between 0 to 0.99. If we multiply with 6 will get the maximum number 5.99. But we need 6.
To make it round we have used type cast. But there is also a problem, now will get it 5, the fraction part will be removed
by type cast.
to so this problem, we increment random value by 1. As a result we will get the value between 1 to 6.

### To compile the code

We can compile the code on visual studio code, from termial 
with command
```
javac DiceJack.java
```
```
java DiceJack.java
```
