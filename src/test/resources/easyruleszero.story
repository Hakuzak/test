My first acceptance tests

Narrative:
A simple TicTacToe game where the player O wins

Scenario: easy win column

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

When the player plays O at (3,2)
Then the result should be 
X.O
.XO
X.O

Then the game is finished

Scenario: easy win row

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

When the player plays X at (3,1)
Then the result should be 
X.X
...
..O

Then the game is not finished

When the player plays O at (1,3)
Then the result should be 
X.X
...
O.O

Then the game is not finished

Then the game is not finished

When the player plays X at (2,2)
Then the result should be 
X.X
.X.
O.O

Then the game is not finished

When the player plays O at (2,3)
Then the result should be 
X.X
.X.
OOO

Then the game is finished

Scenario: easy win diag 1

Given a TicTacToe board of size 3 per 3

When the player plays X at (1,1)
Then the result should be 
X..
...
...

Then the game is not finished

When the player plays O at (1,3)
Then the result should be 
X..
...
O..

Then the game is not finished

When the player plays X at (3,3)
Then the result should be 
X..
...
O.X

Then the game is not finished

When the player plays O at (3,1)
Then the result should be 
X.O
...
O.X

Then the game is not finished

When the player plays X at (1,2)
Then the result should be 
X.O
X..
O.X

Then the game is not finished

When the player plays O at (2,2)
Then the result should be 
X.O
XO.
O.X

Then the game is finished

Scenario: easy win diag 2

Given a TicTacToe board of size 3 per 3

When the player plays X at (3,1)
Then the result should be 
..X
...
...

Then the game is not finished

When the player plays O at (3,3)
Then the result should be 
..X
...
..O

Then the game is not finished

When the player plays X at (1,3)
Then the result should be 
..X
...
X.O

Then the game is not finished

When the player plays O at (1,1)
Then the result should be 
O.X
...
X.O

Then the game is not finished

When the player plays X at (3,2)
Then the result should be 
O.X
..X
X.O

Then the game is not finished

When the player plays O at (2,2)
Then the result should be 
O.X
.OX
X.O

Then the game is finished