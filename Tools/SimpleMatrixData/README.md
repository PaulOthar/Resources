# SimpleMatrixData
Simple Matrix Data or .smd for short, is a made up data strucutre designed to hold data in a hexidecimal matrix.

It is inneficient as a data storage system, since it allocates a byte for each character, but only uses half.

This desing choice was made to make it simple to be read and written, in a txt format.


Its uses are limitless, you may find yourself applying usage in maze, or 4BitPallet image.

Practical Example: Chess

Imagine the following bitwise:

Empty = x000 = 0
Pawn = x001 = 1
Horse = x010 = 2
Bishop = x011 = 3
Tower = x100 = 4
Queen = x101 = 5
King = x110 = 6

Black = 0xxx
White = 1xxx

42356324
11111111
00000000
00000000
00000000
00000000
99999999
cabdebac