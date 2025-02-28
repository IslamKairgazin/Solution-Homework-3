  Minecraft Builder & Prototype
  
Project Description
This project demonstrates the Builder and Prototype design patterns using a Minecraft-like world.
Builder creates a world with biomes and structures.
Prototype clones objects (blocks, mobs).

  Project Files
IWorldBuilder.java – Interface for the world builder
SimpleWorldBuilder.java – Implementation of the builder
World.java – World class
MUDBuilderDemo.java – Demonstration of the Builder pattern
CloneableGameEntity.java – Interface for cloning entities
Block.java – Class representing blocks
Entity.java – Class representing mobs
MUDPrototypeDemo.java – Demonstration of the Prototype pattern
MUDCombinedDemo.java – Combination of Builder and Prototype patterns

  Program Execution
Creates a world using the Builder pattern.
Displays world information (biomes, structures).
Clones objects (blocks and mobs) using the Prototype pattern.
Outputs cloned objects to the console.

  Expected Console Output
The program creates a world named "Cubic World" with biomes Forest and Desert, as well as structures Village and Castle.
The Prototype pattern clones the object "Stone", resulting in a cloned Stone block.
The Prototype pattern clones a mob "Cow" (HP: 10), and a cloned cow with the same attributes appears.
