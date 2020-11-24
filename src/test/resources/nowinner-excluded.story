When there is no winner

Narrative:
When no player wins 

Scenario: tie break

Given a TicTacToe board of size 3 per 3

When the player plays X at (1,1)
Then the result should be 
X..
...
...

Then the game is not finished

When the player plays O at (3,3)
Then the result should be 
X..
...
..O

Then the game is not finished

When the player plays X at (1,3)
Then the result should be 
X..
...
X.O

Then the game is not finished

When the player plays O at (3,1)
Then the result should be 
X.O
...
X.O

Then the game is not finished


When the player plays X at (2,2)
Then the result should be 
X.O
.X.
X.O

Then the game is not finished

When the player plays O at (1,2)
Then the result should be 
X.O
OX.
X.O

Then the game is not finished

When the player plays X at (3,2)
Then the result should be 
X.O
OXX
X.O

Then the game is not finished

When the player plays O at (2,1)
Then the result should be 
XOO
OXX
X.O

Then the game is not finished

When the player plays X at (2,3)
Then the result should be 
XOO
OXX
XXO

Then the game is finished