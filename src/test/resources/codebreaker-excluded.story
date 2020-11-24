Acceptance tests for errors

Narrative:
To Break M. Flahaut code

Scenario: diagonal with hole

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

When the player plays X at (2,1)
Then the result should be
XX.
...
O..

Then the game is not finished

Given a TicTacToe board of size 4 per 4

When the player plays X at (1,1)
Then the result should be
X...
....
....
....

Then the game is not finished

When the player plays O at (1,3)
Then the result should be
X...
....
O...
....

Then the game is not finished

When the player plays X at (2,1)
Then the result should be
XX..
....
O...
....

Then the game is not finished

When the player plays O at (4,3)
Then the result should be
XX..
....
O..O
....

Then the game is not finished

When the player plays X at (3,1)
Then the result should be
XXX.
....
O..O
....

Then the game is not finished

When the player plays O at (3,3)
Then the result should be
XXX.
....
O.OO
....

Then the game is not finished

When the player plays X at (4,1)
Then the result should be
XXXX
....
O.OO
....

Then the game is finished
