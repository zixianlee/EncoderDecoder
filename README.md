# Requirements
Write an encoder that takes in a plaintext and
encode it to another obfuscated string. 

Logic:
Choose any character in the reference table as the offset.
The first character of the encoded message will be the
offset character. Any character not in the reference table
will mapped back to the same character.

## Example
Input:
HELLO WORLD

Offset:
B

Encoded:
BGDKKN VNQKC

Decoded:
HELLO WORLD
