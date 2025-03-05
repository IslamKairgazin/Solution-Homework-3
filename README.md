Minecraft Builder & Prototype
This project demonstrates the Builder and Prototype design patterns adapted for Minecraft. Unlike the original assignment (Dungeon), this project creates an open game world instead of a closed dungeon structure. It shows how to flexibly construct worlds and clone objects for efficient resource management.

 Assignment 1: Builder (World Creation)
The Builder pattern is used to create a world with biomes and structures.
The world is constructed step by step, adding biomes (Forest, Desert) and structures (Village, Castle).
Unlike the dungeon in the professor’s assignment, this project generates an open world with different zones.
Files:

IWorldBuilder.java – Builder interface.
SimpleWorldBuilder.java – Builder implementation.
World.java – Stores world data.
MUDBuilderDemo.java – Demonstrates world creation.

 Assignment 2: Prototype (Cloning Objects)
The Prototype pattern is used to clone game objects without recreating them from scratch.
Blocks (Stone, Wood) and mobs (Cow, Zombie) are cloned.
Unlike the dungeon, objects are cloned for an open world, not rooms or NPCs.
Files:

CloneableGameEntity.java – Cloning interface.
Block.java – Block class.
Entity.java – Mob class.
MUDPrototypeDemo.java – Demonstrates object cloning.

 Assignment 3: Builder + Prototype (World Creation + Object Cloning)
Builder and Prototype are combined to create a world and clone objects in it.
The world is generated using Builder, and cloned objects (Zombie, Wood) are added to it.
Unlike the dungeon, the world can evolve dynamically and be filled with new objects.
File:

MUDCombinedDemo.java – Demonstrates the combination of Builder and Prototype.
 Difference from the Dungeon Project
Minecraft	Dungeon (Professor’s Assignment)
Open world with biomes	Closed rooms and corridors
Biomes and structures are created	Rooms and NPCs are created
Used for world development	Used for levels and quests
Blocks and mobs are cloned	NPCs and rooms are cloned
World expands dynamically	World is fixed from the start

 Conclusion
This project demonstrates how world-building (Builder) and object cloning (Prototype) work together. Unlike the dungeon assignment, this project creates a dynamic game world instead of a static structure. This approach is useful for sandbox games, where the world constantly evolves and expands.
