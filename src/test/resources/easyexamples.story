My first acceptance tests

Narrative:
Some simple TicTacToe situations 

Scenario: easy win row

Given a TicTacToe board like
X.X
O.O
...

When the player plays X at (2,1)
Then the result should be 
XXX
O.O
...

Then the game is finished
