# Laser Chess

This project was created for my high school AP Computer Science A course.
It is intended to implement the rules of [ThinkFun's Laser Chess™](https://www.thinkfun.com/wp-content/uploads/2017/10/LaserCh-1034-Instructions.pdf).

The game is playable but requires some adaptation of src/laserchess/Main.java:main.
All moves are executed at runtime. The program is not responsive to new moves while running.

The board is displayed after any valid move in the terminal, but requires UTF-8 encoding for proper visibility.

```
  =================[Laser  Chess]=================
   A    B    C    D    E    F    G    H    I    J
1 [↓]  [ ]  [⬔]  [ ]  [\]  [ ]  [┻]  [◩]  [ ]  [ ]  
2 [ ]  [ ]  [ ]  [ ]  [ ]  [\]  [ ]  [ ]  [ ]  [◥]  
3 [ ]  [ ]  [ ]  [◢]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  
4 [⬕]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  
5 [ ]  [ ]  [ ]  [ ]  [⧄]  [⧅]  [ ]  [ ]  [◥]  [ ]  
6 [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [◩]  [ ]  [ ]  [ ]  
7 [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  
8 [ ]  [ ]  [◢]  [┬]  [k]  [┤]  [ ]  [◣]  [ ]  [↑]  
  ================Key: (Red, Blue)================
      King: K k   Deflector: ◣ ⬕   Switch: \ ⧅
             Cannon: → ←  Defender: ┤ ┣
  ================================================

The game is won! Congratulations Blue!
```
