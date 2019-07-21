# unicorn-cipher


! From tinoC23 @ 20/07/2019


A worm welcome, to the unicorn cipher, github repository.


 Some words about the unicorn cipher
 

unicorn cipher takes it name from a mythical creature named unicorn.

I choose the particular name, not for a particular reason. 

I choose it because i like it as a name for the cipher i have created.

unicorn cipher idea, is partially based on the caesar cipher and partially on the private key encryption ciphers.

unicorn cipher is a GUI program.

I have created it, using the java(J2SE) programming language.

unicorn cipher  needs it accompanying .png splashscreen image, in order for the .java source file, to compile and run properly.

unicorn cipher, ciphers only latin alphabet text, thus the similarity with the caesar cipher.

The unicorn cipher operates as follows:
[1] user enters the latin alphabet text that he wish to cipher, on the jtext area of the program
[2] user press the cipher button
[3] user promped to enter, the times that the text will be encrypted/ciphered(from 1 to 25 times)
[4] the meessage is ciphered [user choice] numbers
[5] program creates two text files: 
    [a] the ciphered text file,
    [b] the private key file,
    The above files, will be used, by the lion decipher, in order to assemble,
    the primary/original text message.
    
    
 unicorn cipher logic/engine


the unicorn cipher has a random number generator, that produces integers to the range of 1 to 25, 
beacause a latin alphabet letter, can be shifted forward/backward, 25 letters in total.

because latin alphabet length is 26 letters, if a letter is shifted 26 letters, it will return to it initial value,
for example if letter A is shifted 26 letters forward/backward, it will return to it initial state, which is the letter A.

the unicorn cipher, will run [n user defined] times, and each time, the random generator, will produce a random number,
between 1 to 25, that will encypt the text.

For example:
Let assume that the program user, choose for the initial text, to be ciphered 25 times. 
The unicorn cipher will run the cipher algorithm for 25 times.
Each time, the random integer generator, will choose, how the text letters will be ciphered(the shift pattern of the letters).
Each time, the random generator shift integer, is saved in an integer array.
The result of the unicorn cipher encryption logic/engine, will be the 25 times ciphered text plus a seperate text,
that will include the private key, for the ciphered text. 

Here is an example of a 25 times ciphered text private key : DACKC1AIE6D13K1DDFFEOFC9N

From the right, the N letter indicates that, in the 25th ciphering of the text, the letters had shifted forward,
for 22 letters.

The number 9, indicates that, in the 24th ciphering of the text, the letters had shifted forward,
for 9 letters.

The error handling mechanism of the program, is that:
[1] letters other than the basic iso latin alphabet(26 letters),
[2] special symbols,
[3] numbers,
are not ciphered.

I would like to indicate that unicorn cipher,operates only as a cipher.

The encrypted/ciphered text message and the private key text produced by the unicorn cipher,
can be deciphered by the lion decipher.

Lion decipher is a program that i will tag in my github repositories, in the near future.

As a comment, in the search that i have contacted, the lion appears as the enemy of the unicorn.

Thus the unicorn cipher and the lion decipher.
