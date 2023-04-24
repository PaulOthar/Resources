# How to make easy isometric textures

first get a image:

![image](https://user-images.githubusercontent.com/64809360/233989606-1c7dc0bb-bd34-455e-be1b-c7baac0f0cb5.png)

for each pixel of the image, make it a 2x2:

![image](https://user-images.githubusercontent.com/64809360/233989801-21331f58-bb3f-49a6-8407-156330d45534.png)

Now we can proceed to the different types of tiles:

###Diamond shape(floor/ceiling):

1) Take a single row of the image, and for each enlarged pixel, go down 1 pixel:
  
![image](https://user-images.githubusercontent.com/64809360/233990412-d1b987cf-5a78-474c-8f17-1a0184a64099.png)

2) Repeat the first step, but with the next row:

![image](https://user-images.githubusercontent.com/64809360/233990444-8eb13a72-9bb9-4cb3-af7b-abeb602c2c97.png)

3) Attach the second row, 2 pixel down and left of the first row:

![image](https://user-images.githubusercontent.com/64809360/233990568-3739982a-c654-4a14-8866-49ea9f308a80.png)

4) Repeat:

![image](https://user-images.githubusercontent.com/64809360/233990933-e6dde61d-6cd1-41d1-93ff-4956ebb560f4.png)

Voilá, you have now a simple (floor/ceiling) tile!<br>
Keep in mind that some distortions are inevitable.

### Parallelogram shape(Wall)

1) Take a single row of the image, and for each enlarged pixel, go down 1 pixel:

![image](https://user-images.githubusercontent.com/64809360/233990412-d1b987cf-5a78-474c-8f17-1a0184a64099.png)

2) Repeat the first step, but with the next row:

![image](https://user-images.githubusercontent.com/64809360/233990444-8eb13a72-9bb9-4cb3-af7b-abeb602c2c97.png)

3) Put the second row exactly below the first:

![image](https://user-images.githubusercontent.com/64809360/233991148-b35791d7-014b-467c-848c-a540882bc504.png)

4) Repeat:

![image](https://user-images.githubusercontent.com/64809360/233991241-9f3bb2a9-bc34-4446-9574-e419c2674583.png)

Voilá, you have now a simple (wall) tile!
Keep in mind that some distortions are inevitable.
