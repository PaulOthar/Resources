# How to make easy isometric textures

first get a image:

<IMAGE>

for each pixel of the image, make it a 2x2:

<IMAGE>

Now we can proceed to the different types of tiles:

###Diamond shape(floor/ceiling):

1) Take a single row of the image, and for each enlarged pixel, go down 1 pixel:

<IMAGE>

2) Repeat the first step, but with the next row:

<IMAGE>

3) Attach the second row, 2 pixel down and left of the first row:

<IMAGE>

4) Repeat:

<IMAGE>

Voilá, you have now a simple (floor/ceiling) tile!

### Parallelogram shape(Wall)

1) Take a single row of the image, and for each enlarged pixel, go down 1 pixel:

<IMAGE>

2) Repeat the first step, but with the next row:

<IMAGE>

3) Put the second row exactly below the first:

<IMAGE>

4) Repeat:

<IMAGE>

Voilá, you have now a simple (wall) tile!