Same acceptance tests, other marks

Narrative:
A simple TicTacToe game with different marks

Scenario: easy win column

Given a TicTacToe board of size 3 per 3

When the player plays $ at (1,1)
Then the result should be 
$..
...
...

Then the game is not finished

When the player plays @ at (3,3)
Then the result should be 
$..
...
..@

Then the game is not finished

When the player plays $ at (1,3)
Then the result should be 
$..
...
$.@

Then the game is not finished

When the player plays @ at (3,1)
Then the result should be 
$.@
...
$.@

Then the game is not finished


When the player plays $ at (1,2)
Then the result should be 
$.@
$..
$.@

Then the game is finished

Scenario: easy win row

Given a TicTacToe board of size 3 per 3

When the player plays $ at (1,1)
Then the result should be 
$..
...
...

Then the game is not finished

When the player plays @ at (3,3)
Then the result should be 
$..
...
..@

Then the game is not finished

When the player plays $ at (3,1)
Then the result should be 
$.$
...
..@

Then the game is not finished

When the player plays @ at (1,3)
Then the result should be 
$.$
...
@.@

Then the game is not finished

When the player plays $ at (2,1)
Then the result should be 
$$$
...
@.@

Then the game is finished

Scenario: easy win diag 1

Given a TicTacToe board of size 3 per 3

When the player plays $ at (1,1)
Then the result should be 
$..
...
...

Then the game is not finished

When the player plays @ at (2,3)
Then the result should be 
$..
...
.@.

Then the game is not finished

When the player plays $ at (3,3)
Then the result should be 
$..
...
.@$

Then the game is not finished

When the player plays @ at (2,1)
Then the result should be 
$@.
...
.@$

Then the game is not finished

When the player plays $ at (2,2)
Then the result should be 
$@.
.$.
.@$

Then the game is finished

Scenario: easy win diag 2

Given a TicTacToe board of size 3 per 3

When the player plays $ at (3,1)
Then the result should be 
..$
...
...

Then the game is not finished

When the player plays @ at (2,3)
Then the result should be 
..$
...
.@.

Then the game is not finished

When the player plays $ at (1,3)
Then the result should be 
..$
...
$@.

Then the game is not finished

When the player plays @ at (2,1)
Then the result should be 
.@$
...
$@.

Then the game is not finished

When the player plays $ at (2,2)
Then the result should be 
.@$
.$.
$@.

Then the game is finished