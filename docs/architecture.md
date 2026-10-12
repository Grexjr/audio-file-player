# ARCHITECTURE
***
## PLAYER
The player comes from the VLCJ API version 4.12.1 and particularly the AudioPlayerComponent class. 
- [See Javadocs](https://javadoc.io/doc/uk.co.caprica/vlcj/latest/index.html)
- [See Tutorial Page](https://capricasoftware.co.uk/tutorials/vlcj/4)

## USER INTERFACE
This application uses Java Swing GUI to play its audio using JButtons, JFrames, and JPanels to hold its information.

## MODEL
This application puts songs into a custom doubly circular linked list structure which allows loops and songs to
reference their neighbors for navigation.