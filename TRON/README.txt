***README

/*
*
* Version info
*
* Copyright notice
*
* Course : CSC171 SPRING 2014
*
* Assignment : Project 2
*
* Author : Stephen Cool
*
* Lab Session : TR 2:00 - 3:15
*
* Lab TA : David Sekora and Yaron Shaverdi
*
* Last Revised : April 16, 2014
*
*/

Must run Tron.jar file to make game work. 
The Tron Light cycle game includes the following components:

the JAR file runs properly 15% 
• the source code compiles properly 15% 
• display splash screen at start of game 10%
end of game and winner detected 10% 
modularity, code style and README documentation 10%
move light cycle under user keypad control 10% 
• collision detection with walls 10%
• “UR” Content (school, background, logos, etc.) (up to +10%)
• Two players (up to +10%)

It is a two player game were the arrow keys control the Red Player and A,S,D,W control the Blue player
The bottom panel will give directions on how to advance through the screens.

I reference code developed by this website: http://math.hws.edu/eck/cs124/s06/lab8/
It developed code for painting the board and had some useful functions.
I used Board.java and DrawBoard.java from this website.

TronPanel.java was almost entirely mine own. I developed the collision detection, Two players, splash screen and end of game winner, as well as resetting the game. The hardest part was figuring out how to do collision detection with one's own trail. Since the board is essentially a grid of squaGre objects that can have their colors changed, I said that if the next square being moved into was black and within the confines of the board, moving is OKAY, else  stop timer and see who died first. 

DrawBoard.java contains main method
Board.java contains functions to change the board
TronPanel.java contains methods that dictate how the game is played. Each event is forced by the timer. Increasing the timer speed makes the game easier, decreasing the speed makes it harder.

The reference code contains many functions in Board.java that are unused. Only setColor() and getRed() getGreen() and getBlue() are used to change the squares colors and to see if the next square being moved into is black.

