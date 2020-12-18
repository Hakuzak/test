Acceptance tests for errors

Narrative:
When something goes wrong 

Scenario: incorrect game name

Given a Morpion board of size 3 per 3
Then the result should display the error message Morpion is not a supported game

Scenario: incorrect positions

Given a TicTacToe board of size 3 per 3

When the player plays X at (4,1)
Then the result should display the error message incorrect position

Then the game is not finished

When the player plays O at (1,4)
Then the result should display the error message incorrect position

Then the game is not finished

When the player plays X at (4,4)
Then the result should display the error message incorrect position

Then the game is not finished

When the player plays O at (0,1)
Then the result should display the error message incorrect position

Then the game is not finished

When the player plays X at (1,0)
Then the result should display the error message incorrect position

Then the game is not finished

When the player plays O at (0,0)
Then the result should display the error message incorrect position

Then the game is not finished

Scenario: playing twice the same move

Given a TicTacToe board of size 4 per 4

When the player plays X at (4,1)
Then the result should be
...X
....
....
....

Then the game is not finished

When the player plays X at (2,1)
Then the result should display the error message cannot make twice the same move

Then the game is not finished

When the player plays O at (2,1)
Then the result should be
.O.X
....
....
....

Then the game is not finished

When the player plays O at (2,2)
Then the result should display the error message cannot make twice the same move

Scenario: playing with more than two marks

Given a TicTacToe board of size 5 per 5

When the player plays X at (4,1)
Then the result should be
...X.
.....
.....
.....
.....

Then the game is not finished

When the player plays O at (2,1)
Then the result should be
.O.X.
.....
.....
.....
.....

Then the game is not finished

When the player plays + at (2,2)
Then the result should display the error message can only use two marks for this game

Scenario: incorrect positions

Given a TicTacToe board of size 3 per 3

When the player plays X at (1,1)
Then the result should be
X..
...
...

Then the game is not finished

When the player plays O at (1,1)
Then the result should display the error message cell not empty

Then the game is not finished

When the player plays O at (2,1)
Then the result should be
XO.
...
...

Then the game is not finished

When the player plays X at (1,1)
Then the result should display the error message cell not empty
