# SimpleMatrixData
Simple Matrix Data or .smd for short, is a made up data strucutre designed to hold data in a hexidecimal matrix.

It is inneficient as a data storage system, since it allocates a byte for each character, but only uses half.

This desing choice was made to make it simple to be read and written, in a txt format.


Its uses are limitless, you may find yourself applying usage in maze, or 4BitPallet image.

Practical Example: Chess

Imagine the following bitwise:

Empty = x000 = 0|8<br>
Pawn = x001 = 1|9<br>
Horse = x010 = 2|a<br>
Bishop = x011 = 3|b<br>
Tower = x100 = 4|c<br>
Queen = x101 = 5|d<br>
King = x110 = 6|e<br>

Black = 0xxx<br>
White = 1xxx

42356324<br>
11111111<br>
00000000<br>
00000000<br>
00000000<br>
00000000<br>
99999999<br>
cabdebac
