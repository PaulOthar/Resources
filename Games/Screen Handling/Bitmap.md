# Bitmap

Bitmap is (In a very simple matter of saying) an array of RGB, representing the pixels.

In order to understand what this means, you must reflect: What is an pixel?
Better yet, what is RGB?

if you think about it, RGB is a collection of 3 Values, situated between 0 and 255 each.
255 is not an arbitrary number, it is precisely the maximum number a single byte can hold.

3 Values.... between 0 and 255... 3 Bytes...
this means that you can hold an RGB data, inside a integer, and still have 1 Byte for general purpose.

if you read my document about Bitwise operations, you might be familiar with the idea of reading
specific bytes of an structure, so explaining it would be a waste of time.

Now that you know a single RGB can fit inside a Integer, you can now grasp the idea of the Bitmap.

A Bitmap is a collection of Integers, representing Each, a single pixel in the screen.

the way the collection is manipulated, may vary between project needs and programmers
in this document i will explain how i use it.

Lets analyse this picture:

![image](https://user-images.githubusercontent.com/64809360/229396397-2887dfe9-b68f-4a3a-856a-232886be09bf.png)

imagine that each square in this matrix, is an integer...
so... the natural way of thinking is to use an integer matrix... right?

Not in my case, i like to represent it as a Single Array of Integer!

"How?" you may ask... Well... its simple, lets slice this matrix by it rows.

![image](https://user-images.githubusercontent.com/64809360/229396425-a27df37d-3548-41e0-8227-80ef654af42b.png)

Notice how this slice maintains the width, but now the height is 1, as well as the others.

Lets fit the next Row, right after this one we have:

![image](https://user-images.githubusercontent.com/64809360/229396650-a0571664-f74d-46b2-8e23-7a3a9bb023ed.png)

Notice how each Row is separated by the length of the Width.
this is what i use to understand and manage the bitmap.

As long i have a coherent Width in a bitmap, i can have a infinite height image.
Not only that, since i have a single array, Iteration is much simpler.

"How you navigate by this mess?" you may ask.
Its a simple calculation:

X + Y * Width

Since i have a new Row for each Width, i can simply multiply the Y by the Width.
Imagine it as "How many rows i must ignore to reach the one row i want?"
