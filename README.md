Assignment 2: Prototype Pattern
This project demonstrates the Prototype design pattern. It is used for cloning game objects, such as blocks and mobs, without full recreation.

The code creates original objects, clones them, and displays the result in the console.

Project Files:
CloneableGameEntity.java – Interface for cloning
Block.java – Class for blocks (e.g., "Stone"), supports cloning
Entity.java – Class for mobs (e.g., "Cow"), supports cloning
MUDPrototypeDemo.java – Demonstration of the Prototype pattern
Console Output Example:

Originals:  
Block: Stone  
Entity: Cow (HP: 10)  

Clones:  
Block: Stone  
Entity: Cow (HP: 10)  

The program creates objects, calls .cloneEntity(), and generates independent copies. This speeds up object creation and optimizes resource usage.
