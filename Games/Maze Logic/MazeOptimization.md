# Maze Wall Logic
In mazes, more specificly Rectangular ones, we often imagine it with countless squares, and we may lose ourselves with this concept, by applying inneficient logics behind them.

With this document, im planning to solve this problem.

Lets draw a 3x3 Maze:

![image](https://user-images.githubusercontent.com/64809360/227978717-2e4682de-dbf6-457d-8a10-87c684693f6b.png)

Notice that there is 9 squares in it, and most of them share walls between them.

A common and inneficient aproach is to consider every wall a boolean value, if the wall exists, then it is true, otherwise it is false.

A variation of this logic is asigning a number to a wall, being 0 a innexistant wall, 1 a solid wall, 2 a window, 3 a door... and the list goes on....

But think about it for a moment... why you need to specify the same value for the same wall twice?

if you have the cell A, connected to the cell B, and there is a wall between A and B, wouldn'tyou agree that only one of the cells need to carry the information that there is a wall between them?

Moreover, if A and B are the top cells, wouldn't agree that the top wall information is completly useless? since there is no cell above A and B, therefore there MUST be a wall there.

Following this concept, lets imagine the data of a cell:

"does it have a left Wall?" Boolean

if we are defining the left wall data of a cell, we dont need to specify the Right wall, since the cell on the right will contain a Left wall data.

"does it have a bottom Wall?" Boolean

the same goes for the bottom wall definition, we dont need to specify the top wall.

the end result is this:

![image](https://user-images.githubusercontent.com/64809360/227978925-1ad97114-ad09-4e64-96c6-9d782dcdd3f9.png)

we can represent it as a 2 Bit structure, being the 0b10 bit the left wall, and the 0b01 bit the bottom wall.

Lets go back to the 3x3 Maze, with this new logic, it would look like this:

![image](https://user-images.githubusercontent.com/64809360/227979227-7489584f-d1ea-4069-be97-c5f8eebdc8ea.png)

you may notice that the left and bottom data are redundant relative to the edges of the grid... i havent figured out a way to optimize it yet.

"But what if i wanted to have some other data for each cell? like doors and windows"

In this scenario, you may consider using more than 2 bits for each cell.

Like, 4 Bits for each cell

00 = Empty
01 = Wall
10 = Door
11 = Window

There is no limit for the abstraction you may adopt.

