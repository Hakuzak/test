My first acceptance tests

Narrative:
A simple TicTacToe game 

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


When the player plays X at (1,2)
Then the result should be 
X.O
X..
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

When the player plays X at (2,1)
Then the result should be 
XXX
...
O.O

Then the game is finished

Scenario: easy win diag 1

Given a TicTacToe board of size 3 per 3

When the player plays X at (1,1)
Then the result should be 
X..
...
...

Then the game is not finished

When the player plays O at (2,3)
Then the result should be 
X..
...
.O.

Then the game is not finished

When the player plays X at (3,3)
Then the result should be 
X..
...
.OX

Then the game is not finished

When the player plays O at (2,1)
Then the result should be 
XO.
...
.OX

Then the game is not finished

When the player plays X at (2,2)
Then the result should be 
XO.
.X.
.OX

Then the game is finished

Scenario: easy win diag 2

Given a TicTacToe board of size 3 per 3

When the player plays X at (3,1)
Then the result should be 
..X
...
...

Then the game is not finished

When the player plays O at (2,3)
Then the result should be 
..X
...
.O.

Then the game is not finished

When the player plays X at (1,3)
Then the result should be 
..X
...
XO.

Then the game is not finished

When the player plays O at (2,1)
Then the result should be 
.OX
...
XO.

Then the game is not finished

When the player plays X at (2,2)
Then the result should be 
.OX
.X.
XO.

Then the game is finished